{
  "filepath": "/tmp/Lang-21b/src/main/java/org/apache/commons/lang3/SystemUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SystemUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 1483,
      "comment": "\n * \u003cp\u003e\n * Helpers for \u003ccode\u003ejava.lang.System\u003c/code\u003e.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * If a system property cannot be read due to security restrictions, the corresponding field in this class will be set to \u003ccode\u003enull\u003c/code\u003e\n * and a message will be written to \u003ccode\u003eSystem.err\u003c/code\u003e.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * #ThreadSafe#\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @author Based on code from Avalon Excalibur\n * @author Based on code from Lucene\n * @author \u003ca href\u003d\"mailto:sdowney@panix.com\"\u003eSteve Downey\u003c/a\u003e\n * @author Gary Gregory\n * @author Michael Becke\n * @author Tetsuya Kaneuchi\n * @author Rafal Krupinski\n * @author Jason Gritman\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "OS_NAME_WINDOWS_PREFIX"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * The prefix String for all Windows OS.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_HOME_KEY"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * The System property key for the user home directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_DIR_KEY"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * The System property key for the user directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_IO_TMPDIR_KEY"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * The System property key for the Java IO temporary directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_HOME_KEY"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * The System property key for the Java home directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "AWT_TOOLKIT"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003eawt.toolkit\u003c/code\u003e System Property.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Holds a class name, on Windows XP this is \u003ccode\u003esun.awt.windows.WToolkit\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cb\u003eOn platforms without a GUI, this value is \u003ccode\u003enull\u003c/code\u003e.\u003c/b\u003e\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FILE_ENCODING"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003efile.encoding\u003c/code\u003e System Property.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * File encoding, such as \u003ccode\u003eCp1252\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FILE_SEPARATOR"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003efile.separator\u003c/code\u003e System Property. File separator (\u003ccode\u003e\u0026quot;/\u0026quot;\u003c/code\u003e on UNIX).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_FONTS"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.awt.fonts\u003c/code\u003e System Property.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_GRAPHICSENV"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.awt.graphicsenv\u003c/code\u003e System Property.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_HEADLESS"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.awt.headless\u003c/code\u003e System Property. The value of this property is the String \u003ccode\u003e\"true\"\u003c/code\u003e or\n     * \u003ccode\u003e\"false\"\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @see #isJavaAwtHeadless()\n     * @since 2.1\n     * @since Java 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_PRINTERJOB"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.awt.printerjob\u003c/code\u003e System Property.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_CLASS_PATH"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.class.path\u003c/code\u003e System Property. Java class path.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_CLASS_VERSION"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.class.version\u003c/code\u003e System Property. Java class format version number.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_COMPILER"
      ],
      "begin_line": 280,
      "end_line": 280,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.compiler\u003c/code\u003e System Property. Name of JIT compiler to use. First in JDK version 1.2. Not used in Sun JDKs after\n     * 1.2.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2. Not used in Sun versions after 1.2.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_ENDORSED_DIRS"
      ],
      "begin_line": 299,
      "end_line": 299,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.endorsed.dirs\u003c/code\u003e System Property. Path of endorsed directory or directories.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_EXT_DIRS"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.ext.dirs\u003c/code\u003e System Property. Path of extension directory or directories.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_HOME"
      ],
      "begin_line": 337,
      "end_line": 337,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.home\u003c/code\u003e System Property. Java installation directory.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_IO_TMPDIR"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.io.tmpdir\u003c/code\u003e System Property. Default temp file path.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_LIBRARY_PATH"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.library.path\u003c/code\u003e System Property. List of paths to search when loading libraries.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_RUNTIME_NAME"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.runtime.name\u003c/code\u003e System Property. Java Runtime Environment name.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_RUNTIME_VERSION"
      ],
      "begin_line": 415,
      "end_line": 415,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.runtime.version\u003c/code\u003e System Property. Java Runtime Environment version.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_SPECIFICATION_NAME"
      ],
      "begin_line": 434,
      "end_line": 434,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.specification.name\u003c/code\u003e System Property. Java Runtime Environment specification name.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_SPECIFICATION_VENDOR"
      ],
      "begin_line": 453,
      "end_line": 453,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.specification.vendor\u003c/code\u003e System Property. Java Runtime Environment specification vendor.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_SPECIFICATION_VERSION"
      ],
      "begin_line": 472,
      "end_line": 472,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.specification.version\u003c/code\u003e System Property. Java Runtime Environment specification version.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_SPECIFICATION_VERSION_AS_ENUM"
      ],
      "begin_line": 473,
      "end_line": 473,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_UTIL_PREFS_PREFERENCES_FACTORY"
      ],
      "begin_line": 493,
      "end_line": 493,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.util.prefs.PreferencesFactory\u003c/code\u003e System Property. A class name.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     * @since Java 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VENDOR"
      ],
      "begin_line": 512,
      "end_line": 512,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.vendor\u003c/code\u003e System Property. Java vendor-specific string.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VENDOR_URL"
      ],
      "begin_line": 531,
      "end_line": 531,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.vendor.url\u003c/code\u003e System Property. Java vendor URL.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION"
      ],
      "begin_line": 550,
      "end_line": 550,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.version\u003c/code\u003e System Property. Java version number.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_INFO"
      ],
      "begin_line": 570,
      "end_line": 570,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.vm.info\u003c/code\u003e System Property. Java Virtual Machine implementation info.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_NAME"
      ],
      "begin_line": 589,
      "end_line": 589,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.vm.name\u003c/code\u003e System Property. Java Virtual Machine implementation name.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_SPECIFICATION_NAME"
      ],
      "begin_line": 608,
      "end_line": 608,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.vm.specification.name\u003c/code\u003e System Property. Java Virtual Machine specification name.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_SPECIFICATION_VENDOR"
      ],
      "begin_line": 627,
      "end_line": 627,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.vm.specification.vendor\u003c/code\u003e System Property. Java Virtual Machine specification vendor.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_SPECIFICATION_VERSION"
      ],
      "begin_line": 646,
      "end_line": 646,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.vm.specification.version\u003c/code\u003e System Property. Java Virtual Machine specification version.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_VENDOR"
      ],
      "begin_line": 665,
      "end_line": 665,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.vm.vendor\u003c/code\u003e System Property. Java Virtual Machine implementation vendor.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_VERSION"
      ],
      "begin_line": 684,
      "end_line": 684,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.vm.version\u003c/code\u003e System Property. Java Virtual Machine implementation version.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LINE_SEPARATOR"
      ],
      "begin_line": 703,
      "end_line": 703,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003eline.separator\u003c/code\u003e System Property. Line separator (\u003ccode\u003e\u0026quot;\\n\u0026quot;\u003c/code\u003e on UNIX).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "OS_ARCH"
      ],
      "begin_line": 722,
      "end_line": 722,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003eos.arch\u003c/code\u003e System Property. Operating system architecture.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "OS_NAME"
      ],
      "begin_line": 741,
      "end_line": 741,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003eos.name\u003c/code\u003e System Property. Operating system name.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "OS_VERSION"
      ],
      "begin_line": 760,
      "end_line": 760,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003eos.version\u003c/code\u003e System Property. Operating system version.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PATH_SEPARATOR"
      ],
      "begin_line": 779,
      "end_line": 779,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003epath.separator\u003c/code\u003e System Property. Path separator (\u003ccode\u003e\u0026quot;:\u0026quot;\u003c/code\u003e on UNIX).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_COUNTRY"
      ],
      "begin_line": 800,
      "end_line": 801,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003euser.country\u003c/code\u003e or \u003ccode\u003euser.region\u003c/code\u003e System Property. User\u0027s country code, such as \u003ccode\u003eGB\u003c/code\u003e. First in\n     * Java version 1.2 as \u003ccode\u003euser.region\u003c/code\u003e. Renamed to \u003ccode\u003euser.country\u003c/code\u003e in 1.4\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_DIR"
      ],
      "begin_line": 820,
      "end_line": 820,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003euser.dir\u003c/code\u003e System Property. User\u0027s current working directory.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_HOME"
      ],
      "begin_line": 839,
      "end_line": 839,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003euser.home\u003c/code\u003e System Property. User\u0027s home directory.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_LANGUAGE"
      ],
      "begin_line": 859,
      "end_line": 859,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003euser.language\u003c/code\u003e System Property. User\u0027s language code, such as \u003ccode\u003e\"en\"\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_NAME"
      ],
      "begin_line": 878,
      "end_line": 878,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003euser.name\u003c/code\u003e System Property. User\u0027s account name.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_TIMEZONE"
      ],
      "begin_line": 897,
      "end_line": 897,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003euser.timezone\u003c/code\u003e System Property. For example: \u003ccode\u003e\"America/Los_Angeles\"\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_1"
      ],
      "begin_line": 913,
      "end_line": 913,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.1 (also 1.1.x versions).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_2"
      ],
      "begin_line": 924,
      "end_line": 924,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.2 (also 1.2.x versions).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_3"
      ],
      "begin_line": 935,
      "end_line": 935,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.3 (also 1.3.x versions).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_4"
      ],
      "begin_line": 946,
      "end_line": 946,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.4 (also 1.4.x versions).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_5"
      ],
      "begin_line": 957,
      "end_line": 957,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.5 (also 1.5.x versions).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_6"
      ],
      "begin_line": 968,
      "end_line": 968,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.6 (also 1.6.x versions).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_7"
      ],
      "begin_line": 981,
      "end_line": 981,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.7 (also 1.7.x versions).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_AIX"
      ],
      "begin_line": 1002,
      "end_line": 1002,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is AIX.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_HP_UX"
      ],
      "begin_line": 1015,
      "end_line": 1015,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is HP-UX.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_IRIX"
      ],
      "begin_line": 1028,
      "end_line": 1028,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Irix.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_LINUX"
      ],
      "begin_line": 1041,
      "end_line": 1041,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Linux.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_MAC"
      ],
      "begin_line": 1054,
      "end_line": 1054,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Mac.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_MAC_OSX"
      ],
      "begin_line": 1067,
      "end_line": 1067,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Mac.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_OS2"
      ],
      "begin_line": 1080,
      "end_line": 1080,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is OS/2.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_SOLARIS"
      ],
      "begin_line": 1093,
      "end_line": 1093,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Solaris.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_SUN_OS"
      ],
      "begin_line": 1106,
      "end_line": 1106,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is SunOS.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_UNIX"
      ],
      "begin_line": 1119,
      "end_line": 1120,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is a UNIX like system, as in any of AIX, HP-UX, Irix, Linux, MacOSX, Solaris or SUN OS.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS"
      ],
      "begin_line": 1133,
      "end_line": 1133,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Windows.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_2000"
      ],
      "begin_line": 1146,
      "end_line": 1146,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Windows 2000.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_95"
      ],
      "begin_line": 1159,
      "end_line": 1159,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Windows 95.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_98"
      ],
      "begin_line": 1173,
      "end_line": 1173,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Windows 98.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_ME"
      ],
      "begin_line": 1187,
      "end_line": 1187,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Windows ME.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_NT"
      ],
      "begin_line": 1201,
      "end_line": 1201,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Windows NT.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_XP"
      ],
      "begin_line": 1215,
      "end_line": 1215,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Windows XP.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_VISTA"
      ],
      "begin_line": 1229,
      "end_line": 1229,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Windows Vista.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_7"
      ],
      "begin_line": 1242,
      "end_line": 1242,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Windows 7.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 3.0\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getJavaHome()",
      "begin_line": 1256,
      "end_line": 1258,
      "comment": "\n     * \u003cp\u003e\n     * Gets the Java home directory as a \u003ccode\u003eFile\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @return a directory\n     * @throws SecurityException\n     *             if a security manager exists and its \u003ccode\u003echeckPropertyAccess\u003c/code\u003e method doesn\u0027t allow access to the specified system\n     *             property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1257,col 9)-(line 1257,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getJavaIoTmpDir()",
      "begin_line": 1272,
      "end_line": 1274,
      "comment": "\n     * \u003cp\u003e\n     * Gets the Java IO temporary directory as a \u003ccode\u003eFile\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @return a directory\n     * @throws SecurityException\n     *             if a security manager exists and its \u003ccode\u003echeckPropertyAccess\u003c/code\u003e method doesn\u0027t allow access to the specified system\n     *             property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1273,col 9)-(line 1273,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getJavaVersionMatches(java.lang.String)",
      "begin_line": 1285,
      "end_line": 1287,
      "comment": "\n     * \u003cp\u003e\n     * Decides if the Java version matches.\n     * \u003c/p\u003e\n     * \n     * @param versionPrefix\n     *            the prefix for the java version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 1286,col 9)-(line 1286,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getOSMatches(java.lang.String, java.lang.String)",
      "begin_line": 1298,
      "end_line": 1300,
      "comment": "\n     * Decides if the operating system matches.\n     * \n     * @param osNamePrefix\n     *            the prefix for the os name\n     * @param osVersionPrefix\n     *            the prefix for the version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 1299,col 9)-(line 1299,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getOSMatchesName(java.lang.String)",
      "begin_line": 1309,
      "end_line": 1311,
      "comment": "\n     * Decides if the operating system matches.\n     * \n     * @param osNamePrefix\n     *            the prefix for the os name\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 1310,col 9)-(line 1310,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getSystemProperty(java.lang.String)",
      "begin_line": 1328,
      "end_line": 1337,
      "comment": "\n     * \u003cp\u003e\n     * Gets a System property, defaulting to \u003ccode\u003enull\u003c/code\u003e if the property cannot be read.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If a \u003ccode\u003eSecurityException\u003c/code\u003e is caught, the return value is \u003ccode\u003enull\u003c/code\u003e and a message is written to\n     * \u003ccode\u003eSystem.err\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param property\n     *            the system property name\n     * @return the system property value or \u003ccode\u003enull\u003c/code\u003e if a security problem occurs\n     ",
      "child_ranges": [
        "(line 1329,col 9)-(line 1336,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getUserDir()",
      "begin_line": 1351,
      "end_line": 1353,
      "comment": "\n     * \u003cp\u003e\n     * Gets the user directory as a \u003ccode\u003eFile\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @return a directory\n     * @throws SecurityException\n     *             if a security manager exists and its \u003ccode\u003echeckPropertyAccess\u003c/code\u003e method doesn\u0027t allow access to the specified system\n     *             property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1352,col 9)-(line 1352,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getUserHome()",
      "begin_line": 1367,
      "end_line": 1369,
      "comment": "\n     * \u003cp\u003e\n     * Gets the user home directory as a \u003ccode\u003eFile\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @return a directory\n     * @throws SecurityException\n     *             if a security manager exists and its \u003ccode\u003echeckPropertyAccess\u003c/code\u003e method doesn\u0027t allow access to the specified system\n     *             property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1368,col 9)-(line 1368,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.isJavaAwtHeadless()",
      "begin_line": 1380,
      "end_line": 1382,
      "comment": "\n     * Returns whether the {@link #JAVA_AWT_HEADLESS} value is \u003ccode\u003etrue\u003c/code\u003e.\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003eJAVA_AWT_HEADLESS\u003c/code\u003e is \u003ccode\u003e\"true\"\u003c/code\u003e, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * \n     * @see #JAVA_AWT_HEADLESS\n     * @since 2.1\n     * @since Java 1.4\n     ",
      "child_ranges": [
        "(line 1381,col 9)-(line 1381,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(org.apache.commons.lang3.JavaVersion)",
      "begin_line": 1401,
      "end_line": 1403,
      "comment": "\n     * \u003cp\u003e\n     * Is the Java version at least the requested version.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Example input:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e1.2f\u003c/code\u003e to test for Java 1.2\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e1.31f\u003c/code\u003e to test for Java 1.3.1\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param requiredVersion\n     *            the required version, for example 1.31f\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the actual version is equal or greater than the required version\n     ",
      "child_ranges": [
        "(line 1402,col 9)-(line 1402,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.isJavaVersionMatch(java.lang.String, java.lang.String)",
      "begin_line": 1419,
      "end_line": 1424,
      "comment": "\n     * \u003cp\u003e\n     * Decides if the Java version matches.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method is package private instead of private to support unit test invocation.\n     * \u003c/p\u003e\n     * \n     * @param version\n     *            the actual Java version\n     * @param versionPrefix\n     *            the prefix for the expected Java version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 1420,col 9)-(line 1422,col 9)",
        "(line 1423,col 9)-(line 1423,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.isOSMatch(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 1442,
      "end_line": 1447,
      "comment": "\n     * Decides if the operating system matches.\n     * \u003cp\u003e\n     * This method is package private instead of private to support unit test invocation.\n     * \u003c/p\u003e\n     * \n     * @param osName\n     *            the actual OS name\n     * @param osVersion\n     *            the actual OS version\n     * @param osNamePrefix\n     *            the prefix for the expected OS name\n     * @param osVersionPrefix\n     *            the prefix for the expected OS version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 1443,col 9)-(line 1445,col 9)",
        "(line 1446,col 9)-(line 1446,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.isOSNameMatch(java.lang.String, java.lang.String)",
      "begin_line": 1461,
      "end_line": 1466,
      "comment": "\n     * Decides if the operating system matches.\n     * \u003cp\u003e\n     * This method is package private instead of private to support unit test invocation.\n     * \u003c/p\u003e\n     * \n     * @param osName\n     *            the actual OS name\n     * @param osNamePrefix\n     *            the prefix for the expected OS name\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 1462,col 9)-(line 1464,col 9)",
        "(line 1465,col 9)-(line 1465,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SystemUtils.SystemUtils()",
      "begin_line": 1479,
      "end_line": 1481,
      "comment": "\n     * \u003cp\u003e\n     * SystemUtils instances should NOT be constructed in standard programming. Instead, the class should be used as\n     * \u003ccode\u003eSystemUtils.FILE_SEPARATOR\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor is public to permit tools that require a JavaBean instance to operate.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1480,col 9)-(line 1480,col 16)"
      ]
    }
  ]
}