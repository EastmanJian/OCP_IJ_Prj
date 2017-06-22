package edu.exam.ocp.se6.pe.coding.ex7f;

import java.util.Properties;

/**
 * Properties
 */
public class Ex7f {
    public static void main(String[] args) {
        Properties p = System.getProperties();
        p.setProperty("First Name", "Eastman");
        p.setProperty("Last Name", "Kan");
        for (String key : p.stringPropertyNames()) {
            System.out.println(key + " : " + p.getProperty(key));
        }
    }
}

/* sample output ->
java.runtime.name : Java(TM) SE Runtime Environment
sun.boot.library.path : C:\Program Files (x86)\Java\jdk1.8.0_121\jre\bin
java.vm.version : 25.121-b13
java.vm.vendor : Oracle Corporation
java.vendor.url : http://java.oracle.com/
path.separator : ;
java.vm.name : Java HotSpot(TM) Client VM
file.encoding.pkg : sun.io
idea.launcher.port : 7534
user.script :
user.country : GB
sun.java.launcher : SUN_STANDARD
sun.os.patch.level :
java.vm.specification.name : Java Virtual Machine Specification
user.dir : H:\workspaces\OCP_IJ_Prj
java.runtime.version : 1.8.0_121-b13
java.awt.graphicsenv : sun.awt.Win32GraphicsEnvironment
java.endorsed.dirs : C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\endorsed
os.arch : x86
java.io.tmpdir : C:\Users\jiany\AppData\Local\Temp\
line.separator :

java.vm.specification.vendor : Oracle Corporation
user.variant :
os.name : Windows 10
sun.jnu.encoding : GBK
java.library.path : C:\Program Files (x86)\Java\jdk1.8.0_121\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\ProgramData\Oracle\Java\javapath;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Program Files (x86)\ATI Technologies\ATI.ACE\Core-Static;C:\Shortcuts;C:\Program Files (x86)\IBM\SDP\jdk\bin;C:\adb;C:\Program Files (x86)\Lua\5.1;C:\Program Files (x86)\Lua\5.1\clibs;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\Program Files\Git\cmd;C:\Program Files (x86)\QuickTime Alternative\QTSystem;C:\Users\jiany\AppData\Local\Microsoft\WindowsApps;;.
java.specification.name : Java Platform API Specification
java.class.version : 52.0
sun.management.compiler : HotSpot Client Compiler
Last Name : Kan
os.version : 10.0
user.home : C:\Users\jiany
user.timezone :
java.awt.printerjob : sun.awt.windows.WPrinterJob
java.specification.version : 1.8
idea.launcher.bin.path : C:\ProgramFiles\ideaIU-2016.3.3.win\bin
file.encoding : UTF-8
user.name : jiany
java.class.path : C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\charsets.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\deploy.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\ext\access-bridge-32.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\ext\cldrdata.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\ext\dnsns.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\ext\jaccess.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\ext\jfxrt.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\ext\localedata.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\ext\nashorn.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\ext\sunec.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\ext\sunjce_provider.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\ext\sunmscapi.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\ext\sunpkcs11.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\ext\zipfs.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\javaws.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\jce.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\jfr.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\jfxswt.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\jsse.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\management-agent.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\plugin.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\resources.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\rt.jar;H:\workspaces\OCP_IJ_Prj\out\production\OCP_IJ_Prj;C:\ProgramFiles\ideaIU-2016.3.3.win\lib\idea_rt.jar
java.vm.specification.version : 1.8
sun.arch.data.model : 32
java.home : C:\Program Files (x86)\Java\jdk1.8.0_121\jre
sun.java.command : com.intellij.rt.execution.application.AppMain edu.exam.ocp.se6.pe.coding.ex7f.Ex7f
First Name : Eastman
java.specification.vendor : Oracle Corporation
user.language : en
awt.toolkit : sun.awt.windows.WToolkit
java.vm.info : mixed mode, sharing
java.version : 1.8.0_121
java.ext.dirs : C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\ext;C:\WINDOWS\Sun\Java\lib\ext
sun.boot.class.path : C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\resources.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\rt.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\sunrsasign.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\jsse.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\jce.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\charsets.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\lib\jfr.jar;C:\Program Files (x86)\Java\jdk1.8.0_121\jre\classes
java.vendor : Oracle Corporation
file.separator : \
java.vendor.url.bug : http://bugreport.sun.com/bugreport/
sun.cpu.endian : little
sun.io.unicode.encoding : UnicodeLittle
sun.desktop : windows
sun.cpu.isalist : pentium_pro+mmx pentium_pro pentium+mmx pentium i486 i386 i86
*/
