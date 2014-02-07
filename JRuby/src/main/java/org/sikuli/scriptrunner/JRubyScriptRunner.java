/*
 * Copyright 2010-2014, Sikuli.org
 * Released under the MIT License.
 *
 * WhoIsWho 2014
 */
package org.sikuli.scriptrunner;

import java.io.File;
import org.sikuli.basics.Debug;
import org.sikuli.basics.IScriptRunner;

public class JRubyScriptRunner implements IScriptRunner {

  //<editor-fold defaultstate="collapsed" desc="new logging concept">
  private static final String me = "JRubyScriptRunner: ";
  private int lvl = 3;

  private void log(int level, String message, Object... args) {
    Debug.logx(level, level < 0 ? "error" : "debug",
            me + message, args);
  }
  //</editor-fold>

	@Override
	public void init(String[] args) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public int runScript(File scriptfile, File imagedirectory, String[] scriptArgs, String[] forIDE) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public int runTest(File scriptfile, File imagedirectory, String[] scriptArgs, String[] forIDE) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public int runInteractive(String[] scriptArgs) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String getCommandLineHelp() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String getInteractiveHelp() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String getName() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String[] getFileEndings() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String hasFileEnding(String ending) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void close() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean doSomethingSpecial(String action, Object[] args) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void execBefore(String[] stmts) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void execAfter(String[] stmts) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
