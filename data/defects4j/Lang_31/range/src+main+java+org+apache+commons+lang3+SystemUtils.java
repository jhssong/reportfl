{
  "filepath": "/tmp/Lang-31b/src/main/java/org/apache/commons/lang3/SystemUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SystemUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 1365,
      "comment": "\n * \u003cp\u003eHelpers for \u003ccode\u003ejava.lang.System\u003c/code\u003e.\u003c/p\u003e\n * \n * \u003cp\u003eIf a system property cannot be read due to security restrictions, \n * the corresponding field in this class will be set to \u003ccode\u003enull\u003c/code\u003e\n * and a message will be written to \u003ccode\u003eSystem.err\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @author Apache Software Foundation\n * @author Based on code from Avalon Excalibur\n * @author Based on code from Lucene\n * @author \u003ca href\u003d\"mailto:sdowney@panix.com\"\u003eSteve Downey\u003c/a\u003e\n * @author Gary Gregory\n * @author Michael Becke\n * @author Tetsuya Kaneuchi\n * @author Rafal Krupinski\n * @author Jason Gritman\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "OS_NAME_WINDOWS_PREFIX"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * The prefix String for all Windows OS.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_HOME_KEY"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * The System property key for the user home directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_DIR_KEY"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * The System property key for the user directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_IO_TMPDIR_KEY"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * The System property key for the Java IO temporary directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_HOME_KEY"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * The System property key for the Java home directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "AWT_TOOLKIT"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003eawt.toolkit\u003c/code\u003e System Property.\u003c/p\u003e\n     * \u003cp\u003eHolds a class name, on Windows XP this is \u003ccode\u003esun.awt.windows.WToolkit\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\u003cb\u003eOn platforms without a GUI, this value is \u003ccode\u003enull\u003c/code\u003e.\u003c/b\u003e\u003c/p\u003e\n     * \n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FILE_ENCODING"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003efile.encoding\u003c/code\u003e System Property.\u003c/p\u003e\n     * \u003cp\u003eFile encoding, such as \u003ccode\u003eCp1252\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FILE_SEPARATOR"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003efile.separator\u003c/code\u003e System Property.\n     * File separator (\u003ccode\u003e\u0026quot;/\u0026quot;\u003c/code\u003e on UNIX).\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_FONTS"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.awt.fonts\u003c/code\u003e System Property.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_GRAPHICSENV"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.awt.graphicsenv\u003c/code\u003e System Property.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_HEADLESS"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.awt.headless\u003c/code\u003e System Property.\n     * The value of this property is the String \u003ccode\u003e\"true\"\u003c/code\u003e or \u003ccode\u003e\"false\"\u003c/code\u003e. \n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @see #isJavaAwtHeadless()\n     * @since 2.1\n     * @since Java 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_PRINTERJOB"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.awt.printerjob\u003c/code\u003e System Property.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_CLASS_PATH"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.class.path\u003c/code\u003e System Property. Java class path.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_CLASS_VERSION"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.class.version\u003c/code\u003e System Property.\n     * Java class format version number.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_COMPILER"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.compiler\u003c/code\u003e System Property. Name of JIT compiler to use.\n     * First in JDK version 1.2. Not used in Sun JDKs after 1.2.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2. Not used in Sun versions after 1.2.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_ENDORSED_DIRS"
      ],
      "begin_line": 259,
      "end_line": 259,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.endorsed.dirs\u003c/code\u003e System Property. Path of endorsed directory\n     * or directories.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_EXT_DIRS"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.ext.dirs\u003c/code\u003e System Property. Path of extension directory\n     * or directories.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_HOME"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.home\u003c/code\u003e System Property. Java installation directory.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_IO_TMPDIR"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.io.tmpdir\u003c/code\u003e System Property. Default temp file path.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_LIBRARY_PATH"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.library.path\u003c/code\u003e System Property. List of paths to search\n     * when loading libraries.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_RUNTIME_NAME"
      ],
      "begin_line": 343,
      "end_line": 343,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.runtime.name\u003c/code\u003e System Property. Java Runtime Environment\n     * name.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_RUNTIME_VERSION"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.runtime.version\u003c/code\u003e System Property. Java Runtime Environment\n     * version.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_SPECIFICATION_NAME"
      ],
      "begin_line": 378,
      "end_line": 378,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.specification.name\u003c/code\u003e System Property. Java Runtime Environment\n     * specification name.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_SPECIFICATION_VENDOR"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.specification.vendor\u003c/code\u003e System Property. Java Runtime Environment\n     * specification vendor.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_SPECIFICATION_VERSION"
      ],
      "begin_line": 412,
      "end_line": 412,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.specification.version\u003c/code\u003e System Property. Java Runtime Environment\n     * specification version.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_UTIL_PREFS_PREFERENCES_FACTORY"
      ],
      "begin_line": 429,
      "end_line": 430,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.util.prefs.PreferencesFactory\u003c/code\u003e System Property. A class name.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     * @since Java 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VENDOR"
      ],
      "begin_line": 446,
      "end_line": 446,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.vendor\u003c/code\u003e System Property. Java vendor-specific string.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VENDOR_URL"
      ],
      "begin_line": 462,
      "end_line": 462,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.vendor.url\u003c/code\u003e System Property. Java vendor URL.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n    "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION"
      ],
      "begin_line": 478,
      "end_line": 478,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.version\u003c/code\u003e System Property. Java version number.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_INFO"
      ],
      "begin_line": 496,
      "end_line": 496,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.vm.info\u003c/code\u003e System Property. Java Virtual Machine implementation\n     * info.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_NAME"
      ],
      "begin_line": 513,
      "end_line": 513,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.vm.name\u003c/code\u003e System Property. Java Virtual Machine implementation\n     * name.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_SPECIFICATION_NAME"
      ],
      "begin_line": 530,
      "end_line": 530,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.vm.specification.name\u003c/code\u003e System Property. Java Virtual Machine\n     * specification name.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_SPECIFICATION_VENDOR"
      ],
      "begin_line": 547,
      "end_line": 547,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.vm.specification.vendor\u003c/code\u003e System Property. Java Virtual\n     * Machine specification vendor.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_SPECIFICATION_VERSION"
      ],
      "begin_line": 564,
      "end_line": 564,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.vm.specification.version\u003c/code\u003e System Property. Java Virtual Machine\n     * specification version.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_VENDOR"
      ],
      "begin_line": 581,
      "end_line": 581,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.vm.vendor\u003c/code\u003e System Property. Java Virtual Machine implementation\n     * vendor.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_VERSION"
      ],
      "begin_line": 598,
      "end_line": 598,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.vm.version\u003c/code\u003e System Property. Java Virtual Machine\n     * implementation version.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LINE_SEPARATOR"
      ],
      "begin_line": 615,
      "end_line": 615,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003eline.separator\u003c/code\u003e System Property. Line separator\n     * (\u003ccode\u003e\u0026quot;\\n\u0026quot;\u003c/code\u003e on UNIX).\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "OS_ARCH"
      ],
      "begin_line": 631,
      "end_line": 631,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003eos.arch\u003c/code\u003e System Property. Operating system architecture.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "OS_NAME"
      ],
      "begin_line": 647,
      "end_line": 647,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003eos.name\u003c/code\u003e System Property. Operating system name.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "OS_VERSION"
      ],
      "begin_line": 663,
      "end_line": 663,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003eos.version\u003c/code\u003e System Property. Operating system version.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PATH_SEPARATOR"
      ],
      "begin_line": 680,
      "end_line": 680,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003epath.separator\u003c/code\u003e System Property. Path separator\n     * (\u003ccode\u003e\u0026quot;:\u0026quot;\u003c/code\u003e on UNIX).\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_COUNTRY"
      ],
      "begin_line": 699,
      "end_line": 701,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003euser.country\u003c/code\u003e or \u003ccode\u003euser.region\u003c/code\u003e System Property.\n     * User\u0027s country code, such as \u003ccode\u003eGB\u003c/code\u003e. First in JDK version 1.2 as\n     * \u003ccode\u003euser.region\u003c/code\u003e. Renamed to \u003ccode\u003euser.country\u003c/code\u003e in 1.4\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_DIR"
      ],
      "begin_line": 718,
      "end_line": 718,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003euser.dir\u003c/code\u003e System Property. User\u0027s current working\n     * directory.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_HOME"
      ],
      "begin_line": 734,
      "end_line": 734,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003euser.home\u003c/code\u003e System Property. User\u0027s home directory.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_LANGUAGE"
      ],
      "begin_line": 752,
      "end_line": 752,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003euser.language\u003c/code\u003e System Property. User\u0027s language code,\n     * such as \u003ccode\u003e\"en\"\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_NAME"
      ],
      "begin_line": 768,
      "end_line": 768,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003euser.name\u003c/code\u003e System Property. User\u0027s account name.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_TIMEZONE"
      ],
      "begin_line": 785,
      "end_line": 785,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003euser.timezone\u003c/code\u003e System Property. \n     * For example: \u003ccode\u003e\"America/Los_Angeles\"\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION_TRIMMED"
      ],
      "begin_line": 799,
      "end_line": 799,
      "comment": "\n     * \u003cp\u003eGets the Java version as a \u003ccode\u003eString\u003c/code\u003e trimming leading letters.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003enull\u003c/code\u003e if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION_FLOAT"
      ],
      "begin_line": 819,
      "end_line": 819,
      "comment": "\n     * \u003cp\u003eGets the Java version as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample return values:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e1.2f\u003c/code\u003e for JDK 1.2\n     *  \u003cli\u003e\u003ccode\u003e1.31f\u003c/code\u003e for JDK 1.3.1\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eThe field will return zero if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION_INT"
      ],
      "begin_line": 834,
      "end_line": 834,
      "comment": "\n     * \u003cp\u003eGets the Java version as an \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample return values:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e120\u003c/code\u003e for JDK 1.2\n     *  \u003cli\u003e\u003ccode\u003e131\u003c/code\u003e for JDK 1.3.1\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eThe field will return zero if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_1"
      ],
      "begin_line": 847,
      "end_line": 847,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.1 (also 1.1.x versions).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_2"
      ],
      "begin_line": 855,
      "end_line": 855,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.2 (also 1.2.x versions).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_3"
      ],
      "begin_line": 863,
      "end_line": 863,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.3 (also 1.3.x versions).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_4"
      ],
      "begin_line": 871,
      "end_line": 871,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.4 (also 1.4.x versions).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_5"
      ],
      "begin_line": 879,
      "end_line": 879,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.5 (also 1.5.x versions).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_6"
      ],
      "begin_line": 887,
      "end_line": 887,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.6 (also 1.6.x versions).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_7"
      ],
      "begin_line": 897,
      "end_line": 897,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.7 (also 1.7.x versions).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_AIX"
      ],
      "begin_line": 915,
      "end_line": 915,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is AIX.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_HP_UX"
      ],
      "begin_line": 925,
      "end_line": 925,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is HP-UX.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_IRIX"
      ],
      "begin_line": 935,
      "end_line": 935,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Irix.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_LINUX"
      ],
      "begin_line": 945,
      "end_line": 945,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Linux.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_MAC"
      ],
      "begin_line": 955,
      "end_line": 955,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Mac.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_MAC_OSX"
      ],
      "begin_line": 965,
      "end_line": 965,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Mac.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_OS2"
      ],
      "begin_line": 975,
      "end_line": 975,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is OS/2.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_SOLARIS"
      ],
      "begin_line": 985,
      "end_line": 985,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Solaris.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_SUN_OS"
      ],
      "begin_line": 995,
      "end_line": 995,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is SunOS.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_UNIX"
      ],
      "begin_line": 1006,
      "end_line": 1008,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is a POSIX compilant system,\n     * as in any of AIX, HP-UX, Irix, Linux, MacOSX, Solaris or SUN OS.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS"
      ],
      "begin_line": 1018,
      "end_line": 1018,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Windows.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_2000"
      ],
      "begin_line": 1028,
      "end_line": 1028,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Windows 2000.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_95"
      ],
      "begin_line": 1038,
      "end_line": 1038,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Windows 95.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_98"
      ],
      "begin_line": 1049,
      "end_line": 1049,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Windows 98.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_ME"
      ],
      "begin_line": 1060,
      "end_line": 1060,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Windows ME.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_NT"
      ],
      "begin_line": 1071,
      "end_line": 1071,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Windows NT.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_XP"
      ],
      "begin_line": 1082,
      "end_line": 1082,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Windows XP.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_VISTA"
      ],
      "begin_line": 1093,
      "end_line": 1093,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Windows Vista.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @since 2.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_7"
      ],
      "begin_line": 1103,
      "end_line": 1103,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Windows 7.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @since 3.0\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SystemUtils.SystemUtils()",
      "begin_line": 1114,
      "end_line": 1116,
      "comment": "\n     * \u003cp\u003eSystemUtils instances should NOT be constructed in standard\n     * programming. Instead, the class should be used as\n     * \u003ccode\u003eSystemUtils.FILE_SEPARATOR\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1115,col 9)-(line 1115,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getJavaVersionAsFloat()",
      "begin_line": 1133,
      "end_line": 1146,
      "comment": "\n     * \u003cp\u003eGets the Java version number as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample return values:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e1.2f\u003c/code\u003e for JDK 1.2\n     *  \u003cli\u003e\u003ccode\u003e1.31f\u003c/code\u003e for JDK 1.3.1\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003ePatch releases are not reported.\n     * Zero is returned if {@link #JAVA_VERSION_TRIMMED} is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return the version, for example 1.31f for JDK 1.3.1\n     ",
      "child_ranges": [
        "(line 1134,col 9)-(line 1136,col 9)",
        "(line 1137,col 9)-(line 1137,col 58)",
        "(line 1138,col 9)-(line 1140,col 9)",
        "(line 1141,col 9)-(line 1145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getJavaVersionAsInt()",
      "begin_line": 1162,
      "end_line": 1178,
      "comment": "\n     * \u003cp\u003eGets the Java version number as an \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample return values:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e120\u003c/code\u003e for JDK 1.2\n     *  \u003cli\u003e\u003ccode\u003e131\u003c/code\u003e for JDK 1.3.1\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003ePatch releases are not reported.\n     * Zero is returned if {@link #JAVA_VERSION_TRIMMED} is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return the version, for example 131 for JDK 1.3.1\n     ",
      "child_ranges": [
        "(line 1163,col 9)-(line 1165,col 9)",
        "(line 1166,col 9)-(line 1166,col 58)",
        "(line 1167,col 9)-(line 1167,col 57)",
        "(line 1168,col 9)-(line 1172,col 9)",
        "(line 1173,col 9)-(line 1177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getJavaVersionTrimmed()",
      "begin_line": 1185,
      "end_line": 1195,
      "comment": "\n     * Trims the text of the java version to start with numbers.\n     * \n     * @return the trimmed java version\n     ",
      "child_ranges": [
        "(line 1186,col 9)-(line 1193,col 9)",
        "(line 1194,col 9)-(line 1194,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getJavaVersionMatches(java.lang.String)",
      "begin_line": 1203,
      "end_line": 1208,
      "comment": "\n     * \u003cp\u003eDecides if the java version matches.\u003c/p\u003e\n     * \n     * @param versionPrefix  the prefix for the java version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 1204,col 9)-(line 1206,col 9)",
        "(line 1207,col 9)-(line 1207,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getOSMatches(java.lang.String)",
      "begin_line": 1216,
      "end_line": 1221,
      "comment": "\n     * \u003cp\u003eDecides if the operating system matches.\u003c/p\u003e\n     * \n     * @param osNamePrefix  the prefix for the os name\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 1217,col 9)-(line 1219,col 9)",
        "(line 1220,col 9)-(line 1220,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getOSMatches(java.lang.String, java.lang.String)",
      "begin_line": 1230,
      "end_line": 1235,
      "comment": "\n     * \u003cp\u003eDecides if the operating system matches.\u003c/p\u003e\n     * \n     * @param osNamePrefix  the prefix for the os name\n     * @param osVersionPrefix  the prefix for the version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 1231,col 9)-(line 1233,col 9)",
        "(line 1234,col 9)-(line 1234,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getSystemProperty(java.lang.String)",
      "begin_line": 1248,
      "end_line": 1259,
      "comment": "\n     * \u003cp\u003eGets a System property, defaulting to \u003ccode\u003enull\u003c/code\u003e if the property\n     * cannot be read.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf a \u003ccode\u003eSecurityException\u003c/code\u003e is caught, the return\n     * value is \u003ccode\u003enull\u003c/code\u003e and a message is written to \u003ccode\u003eSystem.err\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param property the system property name\n     * @return the system property value or \u003ccode\u003enull\u003c/code\u003e if a security problem occurs\n     ",
      "child_ranges": [
        "(line 1249,col 9)-(line 1258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(float)",
      "begin_line": 1274,
      "end_line": 1276,
      "comment": "\n     * \u003cp\u003eIs the Java version at least the requested version.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample input:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e1.2f\u003c/code\u003e to test for JDK 1.2\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003e1.31f\u003c/code\u003e to test for JDK 1.3.1\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param requiredVersion  the required version, for example 1.31f\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the actual version is equal or greater\n     *  than the required version\n     ",
      "child_ranges": [
        "(line 1275,col 9)-(line 1275,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(int)",
      "begin_line": 1292,
      "end_line": 1294,
      "comment": "\n     * \u003cp\u003eIs the Java version at least the requested version.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample input:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e120\u003c/code\u003e to test for JDK 1.2 or greater\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003e131\u003c/code\u003e to test for JDK 1.3.1 or greater\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param requiredVersion  the required version, for example 131\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the actual version is equal or greater\n     *  than the required version\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1293,col 9)-(line 1293,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.isJavaAwtHeadless()",
      "begin_line": 1306,
      "end_line": 1308,
      "comment": "\n     * Returns whether the {@link #JAVA_AWT_HEADLESS} value is \u003ccode\u003etrue\u003c/code\u003e.\n     *  \n     * @return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003eJAVA_AWT_HEADLESS\u003c/code\u003e is \u003ccode\u003e\"true\"\u003c/code\u003e,\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * \n     * @see #JAVA_AWT_HEADLESS\n     * @since 2.1\n     * @since Java 1.4\n     ",
      "child_ranges": [
        "(line 1307,col 9)-(line 1307,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getJavaHome()",
      "begin_line": 1319,
      "end_line": 1321,
      "comment": "\n     * \u003cp\u003eGets the Java home directory as a \u003ccode\u003eFile\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return a directory\n     * @throws  SecurityException  if a security manager exists and its  \n     *             \u003ccode\u003echeckPropertyAccess\u003c/code\u003e method doesn\u0027t allow\n     *              access to the specified system property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1320,col 9)-(line 1320,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getJavaIoTmpDir()",
      "begin_line": 1333,
      "end_line": 1335,
      "comment": "\n     * \u003cp\u003eGets the Java IO temporary directory as a \u003ccode\u003eFile\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return a directory\n     * @throws  SecurityException  if a security manager exists and its  \n     *             \u003ccode\u003echeckPropertyAccess\u003c/code\u003e method doesn\u0027t allow\n     *              access to the specified system property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1334,col 9)-(line 1334,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getUserDir()",
      "begin_line": 1347,
      "end_line": 1349,
      "comment": "\n     * \u003cp\u003eGets the user directory as a \u003ccode\u003eFile\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return a directory\n     * @throws  SecurityException  if a security manager exists and its  \n     *             \u003ccode\u003echeckPropertyAccess\u003c/code\u003e method doesn\u0027t allow\n     *              access to the specified system property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1348,col 9)-(line 1348,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getUserHome()",
      "begin_line": 1361,
      "end_line": 1363,
      "comment": "\n     * \u003cp\u003eGets the user home directory as a \u003ccode\u003eFile\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return a directory\n     * @throws  SecurityException  if a security manager exists and its  \n     *             \u003ccode\u003echeckPropertyAccess\u003c/code\u003e method doesn\u0027t allow\n     *              access to the specified system property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1362,col 9)-(line 1362,col 59)"
      ]
    }
  ]
}