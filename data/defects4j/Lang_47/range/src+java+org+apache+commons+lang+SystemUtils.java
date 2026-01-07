{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/SystemUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SystemUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 1361,
      "comment": "\n * \u003cp\u003eHelpers for \u003ccode\u003ejava.lang.System\u003c/code\u003e.\u003c/p\u003e\n * \n * \u003cp\u003eIf a system property cannot be read due to security restrictions, \n * the corresponding field in this class will be set to \u003ccode\u003enull\u003c/code\u003e\n * and a message will be written to \u003ccode\u003eSystem.err\u003c/code\u003e.\u003c/p\u003e\n *\n * @author Based on code from Avalon Excalibur\n * @author Based on code from Lucene\n * @author Stephen Colebourne\n * @author \u003ca href\u003d\"mailto:sdowney@panix.com\"\u003eSteve Downey\u003c/a\u003e\n * @author Gary Gregory\n * @author Michael Becke\n * @author Tetsuya Kaneuchi\n * @author Rafal Krupinski\n * @author Jason Gritman\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "OS_NAME_WINDOWS_PREFIX"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * The prefix String for all Windows OS.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_HOME_KEY"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * The System property key for the user home directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_DIR_KEY"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * The System property key for the user directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_IO_TMPDIR_KEY"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * The System property key for the Java IO temporary directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_HOME_KEY"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * The System property key for the Java home directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "AWT_TOOLKIT"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003eawt.toolkit\u003c/code\u003e System Property.\u003c/p\u003e\n     * \u003cp\u003eHolds a class name, on Windows XP this is \u003ccode\u003esun.awt.windows.WToolkit\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\u003cb\u003eOn platforms without a GUI, this value is \u003ccode\u003enull\u003c/code\u003e.\u003c/b\u003e\u003c/p\u003e\n     * \n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FILE_ENCODING"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003efile.encoding\u003c/code\u003e System Property.\u003c/p\u003e\n     * \u003cp\u003eFile encoding, such as \u003ccode\u003eCp1252\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FILE_SEPARATOR"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003efile.separator\u003c/code\u003e System Property.\n     * File separator (\u003ccode\u003e\u0026quot;/\u0026quot;\u003c/code\u003e on UNIX).\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_FONTS"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.awt.fonts\u003c/code\u003e System Property.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_GRAPHICSENV"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.awt.graphicsenv\u003c/code\u003e System Property.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_HEADLESS"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.awt.headless\u003c/code\u003e System Property.\n     * The value of this property is the String \u003ccode\u003e\"true\"\u003c/code\u003e or \u003ccode\u003e\"false\"\u003c/code\u003e. \n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @see #isJavaAwtHeadless()\n     * @since 2.1\n     * @since Java 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_PRINTERJOB"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.awt.printerjob\u003c/code\u003e System Property.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_CLASS_PATH"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.class.path\u003c/code\u003e System Property. Java class path.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_CLASS_VERSION"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.class.version\u003c/code\u003e System Property.\n     * Java class format version number.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_COMPILER"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.compiler\u003c/code\u003e System Property. Name of JIT compiler to use.\n     * First in JDK version 1.2. Not used in Sun JDKs after 1.2.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2. Not used in Sun versions after 1.2.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_ENDORSED_DIRS"
      ],
      "begin_line": 258,
      "end_line": 258,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.endorsed.dirs\u003c/code\u003e System Property. Path of endorsed directory\n     * or directories.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_EXT_DIRS"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.ext.dirs\u003c/code\u003e System Property. Path of extension directory\n     * or directories.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_HOME"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.home\u003c/code\u003e System Property. Java installation directory.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_IO_TMPDIR"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.io.tmpdir\u003c/code\u003e System Property. Default temp file path.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_LIBRARY_PATH"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.library.path\u003c/code\u003e System Property. List of paths to search\n     * when loading libraries.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_RUNTIME_NAME"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.runtime.name\u003c/code\u003e System Property. Java Runtime Environment\n     * name.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_RUNTIME_VERSION"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.runtime.version\u003c/code\u003e System Property. Java Runtime Environment\n     * version.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_SPECIFICATION_NAME"
      ],
      "begin_line": 377,
      "end_line": 377,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.specification.name\u003c/code\u003e System Property. Java Runtime Environment\n     * specification name.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_SPECIFICATION_VENDOR"
      ],
      "begin_line": 394,
      "end_line": 394,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.specification.vendor\u003c/code\u003e System Property. Java Runtime Environment\n     * specification vendor.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_SPECIFICATION_VERSION"
      ],
      "begin_line": 411,
      "end_line": 411,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.specification.version\u003c/code\u003e System Property. Java Runtime Environment\n     * specification version.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_UTIL_PREFS_PREFERENCES_FACTORY"
      ],
      "begin_line": 428,
      "end_line": 429,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.util.prefs.PreferencesFactory\u003c/code\u003e System Property. A class name.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     * @since Java 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VENDOR"
      ],
      "begin_line": 445,
      "end_line": 445,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.vendor\u003c/code\u003e System Property. Java vendor-specific string.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VENDOR_URL"
      ],
      "begin_line": 461,
      "end_line": 461,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.vendor.url\u003c/code\u003e System Property. Java vendor URL.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n    "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION"
      ],
      "begin_line": 477,
      "end_line": 477,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.version\u003c/code\u003e System Property. Java version number.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_INFO"
      ],
      "begin_line": 495,
      "end_line": 495,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.vm.info\u003c/code\u003e System Property. Java Virtual Machine implementation\n     * info.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_NAME"
      ],
      "begin_line": 512,
      "end_line": 512,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.vm.name\u003c/code\u003e System Property. Java Virtual Machine implementation\n     * name.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_SPECIFICATION_NAME"
      ],
      "begin_line": 529,
      "end_line": 529,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.vm.specification.name\u003c/code\u003e System Property. Java Virtual Machine\n     * specification name.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_SPECIFICATION_VENDOR"
      ],
      "begin_line": 546,
      "end_line": 546,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.vm.specification.vendor\u003c/code\u003e System Property. Java Virtual\n     * Machine specification vendor.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_SPECIFICATION_VERSION"
      ],
      "begin_line": 563,
      "end_line": 563,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.vm.specification.version\u003c/code\u003e System Property. Java Virtual Machine\n     * specification version.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_VENDOR"
      ],
      "begin_line": 580,
      "end_line": 580,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.vm.vendor\u003c/code\u003e System Property. Java Virtual Machine implementation\n     * vendor.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_VERSION"
      ],
      "begin_line": 597,
      "end_line": 597,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003ejava.vm.version\u003c/code\u003e System Property. Java Virtual Machine\n     * implementation version.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LINE_SEPARATOR"
      ],
      "begin_line": 614,
      "end_line": 614,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003eline.separator\u003c/code\u003e System Property. Line separator\n     * (\u003ccode\u003e\u0026quot;\\n\u0026quot;\u003c/code\u003e on UNIX).\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "OS_ARCH"
      ],
      "begin_line": 630,
      "end_line": 630,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003eos.arch\u003c/code\u003e System Property. Operating system architecture.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "OS_NAME"
      ],
      "begin_line": 646,
      "end_line": 646,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003eos.name\u003c/code\u003e System Property. Operating system name.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "OS_VERSION"
      ],
      "begin_line": 662,
      "end_line": 662,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003eos.version\u003c/code\u003e System Property. Operating system version.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PATH_SEPARATOR"
      ],
      "begin_line": 679,
      "end_line": 679,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003epath.separator\u003c/code\u003e System Property. Path separator\n     * (\u003ccode\u003e\u0026quot;:\u0026quot;\u003c/code\u003e on UNIX).\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_COUNTRY"
      ],
      "begin_line": 698,
      "end_line": 700,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003euser.country\u003c/code\u003e or \u003ccode\u003euser.region\u003c/code\u003e System Property.\n     * User\u0027s country code, such as \u003ccode\u003eGB\u003c/code\u003e. First in JDK version 1.2 as\n     * \u003ccode\u003euser.region\u003c/code\u003e. Renamed to \u003ccode\u003euser.country\u003c/code\u003e in 1.4\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_DIR"
      ],
      "begin_line": 717,
      "end_line": 717,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003euser.dir\u003c/code\u003e System Property. User\u0027s current working\n     * directory.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_HOME"
      ],
      "begin_line": 733,
      "end_line": 733,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003euser.home\u003c/code\u003e System Property. User\u0027s home directory.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_LANGUAGE"
      ],
      "begin_line": 751,
      "end_line": 751,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003euser.language\u003c/code\u003e System Property. User\u0027s language code,\n     * such as \u003ccode\u003e\"en\"\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_NAME"
      ],
      "begin_line": 767,
      "end_line": 767,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003euser.name\u003c/code\u003e System Property. User\u0027s account name.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_TIMEZONE"
      ],
      "begin_line": 784,
      "end_line": 784,
      "comment": "\n     * \u003cp\u003eThe \u003ccode\u003euser.timezone\u003c/code\u003e System Property. \n     * For example: \u003ccode\u003e\"America/Los_Angeles\"\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have\n     * security access to read this property or the property does not exist.\u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)}\n     * or {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value\n     * will be out of sync with that System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION_TRIMMED"
      ],
      "begin_line": 798,
      "end_line": 798,
      "comment": "\n     * \u003cp\u003eGets the Java version as a \u003ccode\u003eString\u003c/code\u003e trimming leading letters.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003enull\u003c/code\u003e if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION_FLOAT"
      ],
      "begin_line": 818,
      "end_line": 818,
      "comment": "\n     * \u003cp\u003eGets the Java version as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample return values:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e1.2f\u003c/code\u003e for JDK 1.2\n     *  \u003cli\u003e\u003ccode\u003e1.31f\u003c/code\u003e for JDK 1.3.1\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eThe field will return zero if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION_INT"
      ],
      "begin_line": 833,
      "end_line": 833,
      "comment": "\n     * \u003cp\u003eGets the Java version as an \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample return values:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e120\u003c/code\u003e for JDK 1.2\n     *  \u003cli\u003e\u003ccode\u003e131\u003c/code\u003e for JDK 1.3.1\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eThe field will return zero if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_1"
      ],
      "begin_line": 846,
      "end_line": 846,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.1 (also 1.1.x versions).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_2"
      ],
      "begin_line": 854,
      "end_line": 854,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.2 (also 1.2.x versions).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_3"
      ],
      "begin_line": 862,
      "end_line": 862,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.3 (also 1.3.x versions).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_4"
      ],
      "begin_line": 870,
      "end_line": 870,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.4 (also 1.4.x versions).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_5"
      ],
      "begin_line": 878,
      "end_line": 878,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.5 (also 1.5.x versions).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_6"
      ],
      "begin_line": 886,
      "end_line": 886,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.6 (also 1.6.x versions).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_AIX"
      ],
      "begin_line": 904,
      "end_line": 904,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is AIX.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_HP_UX"
      ],
      "begin_line": 914,
      "end_line": 914,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is HP-UX.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_IRIX"
      ],
      "begin_line": 924,
      "end_line": 924,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Irix.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_LINUX"
      ],
      "begin_line": 934,
      "end_line": 934,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Linux.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_MAC"
      ],
      "begin_line": 944,
      "end_line": 944,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Mac.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_MAC_OSX"
      ],
      "begin_line": 954,
      "end_line": 954,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Mac.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_OS2"
      ],
      "begin_line": 964,
      "end_line": 964,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is OS/2.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_SOLARIS"
      ],
      "begin_line": 974,
      "end_line": 974,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Solaris.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_SUN_OS"
      ],
      "begin_line": 984,
      "end_line": 984,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is SunOS.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_UNIX"
      ],
      "begin_line": 995,
      "end_line": 997,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is a POSIX compilant system,\n     * as in any of AIX, HP-UX, Irix, Linux, MacOSX, Solaris or SUN OS.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS"
      ],
      "begin_line": 1007,
      "end_line": 1007,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Windows.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_2000"
      ],
      "begin_line": 1017,
      "end_line": 1017,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Windows 2000.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_95"
      ],
      "begin_line": 1027,
      "end_line": 1027,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Windows 95.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_98"
      ],
      "begin_line": 1038,
      "end_line": 1038,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Windows 98.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_ME"
      ],
      "begin_line": 1049,
      "end_line": 1049,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Windows ME.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_NT"
      ],
      "begin_line": 1060,
      "end_line": 1060,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Windows NT.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_XP"
      ],
      "begin_line": 1071,
      "end_line": 1071,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Windows XP.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_VISTA"
      ],
      "begin_line": 1082,
      "end_line": 1082,
      "comment": "\n     * \u003cp\u003eIs \u003ccode\u003etrue\u003c/code\u003e if this is Windows Vista.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @since 2.4\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.SystemUtils.SystemUtils()",
      "begin_line": 1093,
      "end_line": 1095,
      "comment": "\n     * \u003cp\u003eSystemUtils instances should NOT be constructed in standard\n     * programming. Instead, the class should be used as\n     * \u003ccode\u003eSystemUtils.FILE_SEPARATOR\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1094,col 9)-(line 1094,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtils.getJavaVersion()",
      "begin_line": 1111,
      "end_line": 1113,
      "comment": "\n     * \u003cp\u003eGets the Java version number as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample return values:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e1.2f\u003c/code\u003e for JDK 1.2\n     *  \u003cli\u003e\u003ccode\u003e1.31f\u003c/code\u003e for JDK 1.3.1\n     * \u003c/ul\u003e\n     * \n     * @return the version, for example 1.31f for JDK 1.3.1\n     * @deprecated Use {@link #JAVA_VERSION_FLOAT} instead.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 1112,col 9)-(line 1112,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtils.getJavaVersionAsFloat()",
      "begin_line": 1129,
      "end_line": 1142,
      "comment": "\n     * \u003cp\u003eGets the Java version number as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample return values:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e1.2f\u003c/code\u003e for JDK 1.2\n     *  \u003cli\u003e\u003ccode\u003e1.31f\u003c/code\u003e for JDK 1.3.1\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003ePatch releases are not reported.\n     * Zero is returned if {@link #JAVA_VERSION_TRIMMED} is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return the version, for example 1.31f for JDK 1.3.1\n     ",
      "child_ranges": [
        "(line 1130,col 9)-(line 1132,col 9)",
        "(line 1133,col 9)-(line 1133,col 58)",
        "(line 1134,col 9)-(line 1136,col 9)",
        "(line 1137,col 9)-(line 1141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtils.getJavaVersionAsInt()",
      "begin_line": 1158,
      "end_line": 1174,
      "comment": "\n     * \u003cp\u003eGets the Java version number as an \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample return values:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e120\u003c/code\u003e for JDK 1.2\n     *  \u003cli\u003e\u003ccode\u003e131\u003c/code\u003e for JDK 1.3.1\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003ePatch releases are not reported.\n     * Zero is returned if {@link #JAVA_VERSION_TRIMMED} is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return the version, for example 131 for JDK 1.3.1\n     ",
      "child_ranges": [
        "(line 1159,col 9)-(line 1161,col 9)",
        "(line 1162,col 9)-(line 1162,col 58)",
        "(line 1163,col 9)-(line 1163,col 57)",
        "(line 1164,col 9)-(line 1168,col 9)",
        "(line 1169,col 9)-(line 1173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtils.getJavaVersionTrimmed()",
      "begin_line": 1181,
      "end_line": 1191,
      "comment": "\n     * Trims the text of the java version to start with numbers.\n     * \n     * @return the trimmed java version\n     ",
      "child_ranges": [
        "(line 1182,col 9)-(line 1189,col 9)",
        "(line 1190,col 9)-(line 1190,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtils.getJavaVersionMatches(java.lang.String)",
      "begin_line": 1199,
      "end_line": 1204,
      "comment": "\n     * \u003cp\u003eDecides if the java version matches.\u003c/p\u003e\n     * \n     * @param versionPrefix  the prefix for the java version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 1200,col 9)-(line 1202,col 9)",
        "(line 1203,col 9)-(line 1203,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtils.getOSMatches(java.lang.String)",
      "begin_line": 1212,
      "end_line": 1217,
      "comment": "\n     * \u003cp\u003eDecides if the operating system matches.\u003c/p\u003e\n     * \n     * @param osNamePrefix  the prefix for the os name\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 1213,col 9)-(line 1215,col 9)",
        "(line 1216,col 9)-(line 1216,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtils.getOSMatches(java.lang.String, java.lang.String)",
      "begin_line": 1226,
      "end_line": 1231,
      "comment": "\n     * \u003cp\u003eDecides if the operating system matches.\u003c/p\u003e\n     * \n     * @param osNamePrefix  the prefix for the os name\n     * @param osVersionPrefix  the prefix for the version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 1227,col 9)-(line 1229,col 9)",
        "(line 1230,col 9)-(line 1230,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtils.getSystemProperty(java.lang.String)",
      "begin_line": 1244,
      "end_line": 1255,
      "comment": "\n     * \u003cp\u003eGets a System property, defaulting to \u003ccode\u003enull\u003c/code\u003e if the property\n     * cannot be read.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf a \u003ccode\u003eSecurityException\u003c/code\u003e is caught, the return\n     * value is \u003ccode\u003enull\u003c/code\u003e and a message is written to \u003ccode\u003eSystem.err\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param property the system property name\n     * @return the system property value or \u003ccode\u003enull\u003c/code\u003e if a security problem occurs\n     ",
      "child_ranges": [
        "(line 1245,col 9)-(line 1254,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtils.isJavaVersionAtLeast(float)",
      "begin_line": 1270,
      "end_line": 1272,
      "comment": "\n     * \u003cp\u003eIs the Java version at least the requested version.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample input:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e1.2f\u003c/code\u003e to test for JDK 1.2\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003e1.31f\u003c/code\u003e to test for JDK 1.3.1\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param requiredVersion  the required version, for example 1.31f\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the actual version is equal or greater\n     *  than the required version\n     ",
      "child_ranges": [
        "(line 1271,col 9)-(line 1271,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtils.isJavaVersionAtLeast(int)",
      "begin_line": 1288,
      "end_line": 1290,
      "comment": "\n     * \u003cp\u003eIs the Java version at least the requested version.\u003c/p\u003e\n     *\n     * \u003cp\u003eExample input:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u003ccode\u003e120\u003c/code\u003e to test for JDK 1.2 or greater\u003c/li\u003e\n     *  \u003cli\u003e\u003ccode\u003e131\u003c/code\u003e to test for JDK 1.3.1 or greater\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param requiredVersion  the required version, for example 131\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the actual version is equal or greater\n     *  than the required version\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1289,col 9)-(line 1289,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtils.isJavaAwtHeadless()",
      "begin_line": 1302,
      "end_line": 1304,
      "comment": "\n     * Returns whether the {@link #JAVA_AWT_HEADLESS} value is \u003ccode\u003etrue\u003c/code\u003e.\n     *  \n     * @return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003eJAVA_AWT_HEADLESS\u003c/code\u003e is \u003ccode\u003e\"true\"\u003c/code\u003e,\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * \n     * @see #JAVA_AWT_HEADLESS\n     * @since 2.1\n     * @since Java 1.4\n     ",
      "child_ranges": [
        "(line 1303,col 9)-(line 1303,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtils.getJavaHome()",
      "begin_line": 1315,
      "end_line": 1317,
      "comment": "\n     * \u003cp\u003eGets the Java home directory as a \u003ccode\u003eFile\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return a directory\n     * @throws  SecurityException  if a security manager exists and its  \n     *             \u003ccode\u003echeckPropertyAccess\u003c/code\u003e method doesn\u0027t allow\n     *              access to the specified system property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1316,col 9)-(line 1316,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtils.getJavaIoTmpDir()",
      "begin_line": 1329,
      "end_line": 1331,
      "comment": "\n     * \u003cp\u003eGets the Java IO temporary directory as a \u003ccode\u003eFile\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return a directory\n     * @throws  SecurityException  if a security manager exists and its  \n     *             \u003ccode\u003echeckPropertyAccess\u003c/code\u003e method doesn\u0027t allow\n     *              access to the specified system property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1330,col 9)-(line 1330,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtils.getUserDir()",
      "begin_line": 1343,
      "end_line": 1345,
      "comment": "\n     * \u003cp\u003eGets the user directory as a \u003ccode\u003eFile\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return a directory\n     * @throws  SecurityException  if a security manager exists and its  \n     *             \u003ccode\u003echeckPropertyAccess\u003c/code\u003e method doesn\u0027t allow\n     *              access to the specified system property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1344,col 9)-(line 1344,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SystemUtils.getUserHome()",
      "begin_line": 1357,
      "end_line": 1359,
      "comment": "\n     * \u003cp\u003eGets the user home directory as a \u003ccode\u003eFile\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @return a directory\n     * @throws  SecurityException  if a security manager exists and its  \n     *             \u003ccode\u003echeckPropertyAccess\u003c/code\u003e method doesn\u0027t allow\n     *              access to the specified system property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1358,col 9)-(line 1358,col 59)"
      ]
    }
  ]
}