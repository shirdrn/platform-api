package cn.shiyanjun.platform.api.common;

import java.io.InputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.shiyanjun.platform.api.Context;
import cn.shiyanjun.platform.api.utils.IoUtils;

/**
 * Default {@link Context} implementation. One can read/write any
 * configuration value based on <code>key</code> from given properties files.
 * 
 * @author yanjun
 */
public class ContextImpl extends AbstractContext implements Context {

	private static final Log LOG = LogFactory.getLog(ContextImpl.class);
	private static final String CONFIG_FILE = "config.properties";
	
	/**
	 * Use default properties file 'config.properties' to create an context object.
	 */
	public ContextImpl() {
		this(CONFIG_FILE);
	}

	public ContextImpl(String... configs) {
		super();
		for(String config : configs) {
			loadConfiguration(config);
		}
	}

	private void loadConfiguration(String config) {
		LOG.info("Load configuration file: config=" + config);
		InputStream in = null;
		try {
			in = getClass().getClassLoader().getResourceAsStream(config);
			if(in != null) {
				properties.load(in);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (in != null)
			IoUtils.closeQuietly(in);
		}
	}
	
}
