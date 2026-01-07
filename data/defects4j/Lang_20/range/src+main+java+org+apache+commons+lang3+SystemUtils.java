{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/SystemUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SystemUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 1383,
      "comment": "\n * \u003cp\u003e\n * Helpers for {@code java.lang.System}.\n * \u003c/p\u003e\n * \u003cp\u003e\n * If a system property cannot be read due to security restrictions, the corresponding field in this class will be set\n * to {@code null} and a message will be written to {@code System.err}.\n * \u003c/p\u003e\n * \u003cp\u003e\n * #ThreadSafe#\n * \u003c/p\u003e\n *\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "OS_NAME_WINDOWS_PREFIX"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * The prefix String for all Windows OS.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_HOME_KEY"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * The System property key for the user home directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_DIR_KEY"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * The System property key for the user directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_IO_TMPDIR_KEY"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * The System property key for the Java IO temporary directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_HOME_KEY"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * The System property key for the Java home directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "AWT_TOOLKIT"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * \u003cp\u003e\n     * The {@code awt.toolkit} System Property.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Holds a class name, on Windows XP this is {@code sun.awt.windows.WToolkit}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cb\u003eOn platforms without a GUI, this value is {@code null}.\u003c/b\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FILE_ENCODING"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * \u003cp\u003e\n     * The {@code file.encoding} System Property.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * File encoding, such as {@code Cp1252}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FILE_SEPARATOR"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * \u003cp\u003e\n     * The {@code file.separator} System Property. File separator (\u003ccode\u003e\u0026quot;/\u0026quot;\u003c/code\u003e on UNIX).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_FONTS"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.awt.fonts} System Property.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_GRAPHICSENV"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.awt.graphicsenv} System Property.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_HEADLESS"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.awt.headless} System Property. The value of this property is the String {@code \"true\"} or\n     * {@code \"false\"}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @see #isJavaAwtHeadless()\n     * @since 2.1\n     * @since Java 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_PRINTERJOB"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.awt.printerjob} System Property.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_CLASS_PATH"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.class.path} System Property. Java class path.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_CLASS_VERSION"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.class.version} System Property. Java class format version number.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_COMPILER"
      ],
      "begin_line": 259,
      "end_line": 259,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.compiler} System Property. Name of JIT compiler to use. First in JDK version 1.2. Not used in Sun\n     * JDKs after 1.2.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.2. Not used in Sun versions after 1.2.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_ENDORSED_DIRS"
      ],
      "begin_line": 277,
      "end_line": 277,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.endorsed.dirs} System Property. Path of endorsed directory or directories.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_EXT_DIRS"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.ext.dirs} System Property. Path of extension directory or directories.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_HOME"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.home} System Property. Java installation directory.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_IO_TMPDIR"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.io.tmpdir} System Property. Default temp file path.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_LIBRARY_PATH"
      ],
      "begin_line": 349,
      "end_line": 349,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.library.path} System Property. List of paths to search when loading libraries.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_RUNTIME_NAME"
      ],
      "begin_line": 368,
      "end_line": 368,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.runtime.name} System Property. Java Runtime Environment name.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_RUNTIME_VERSION"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.runtime.version} System Property. Java Runtime Environment version.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_SPECIFICATION_NAME"
      ],
      "begin_line": 405,
      "end_line": 405,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.specification.name} System Property. Java Runtime Environment specification name.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_SPECIFICATION_VENDOR"
      ],
      "begin_line": 423,
      "end_line": 423,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.specification.vendor} System Property. Java Runtime Environment specification vendor.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_SPECIFICATION_VERSION"
      ],
      "begin_line": 441,
      "end_line": 441,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.specification.version} System Property. Java Runtime Environment specification version.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_SPECIFICATION_VERSION_AS_ENUM"
      ],
      "begin_line": 442,
      "end_line": 442,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_UTIL_PREFS_PREFERENCES_FACTORY"
      ],
      "begin_line": 461,
      "end_line": 462,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.util.prefs.PreferencesFactory} System Property. A class name.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since 2.1\n     * @since Java 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VENDOR"
      ],
      "begin_line": 480,
      "end_line": 480,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.vendor} System Property. Java vendor-specific string.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VENDOR_URL"
      ],
      "begin_line": 498,
      "end_line": 498,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.vendor.url} System Property. Java vendor URL.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION"
      ],
      "begin_line": 516,
      "end_line": 516,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.version} System Property. Java version number.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_INFO"
      ],
      "begin_line": 535,
      "end_line": 535,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.vm.info} System Property. Java Virtual Machine implementation info.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_NAME"
      ],
      "begin_line": 553,
      "end_line": 553,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.vm.name} System Property. Java Virtual Machine implementation name.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_SPECIFICATION_NAME"
      ],
      "begin_line": 571,
      "end_line": 571,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.vm.specification.name} System Property. Java Virtual Machine specification name.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_SPECIFICATION_VENDOR"
      ],
      "begin_line": 589,
      "end_line": 589,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.vm.specification.vendor} System Property. Java Virtual Machine specification vendor.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_SPECIFICATION_VERSION"
      ],
      "begin_line": 607,
      "end_line": 607,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.vm.specification.version} System Property. Java Virtual Machine specification version.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_VENDOR"
      ],
      "begin_line": 625,
      "end_line": 625,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.vm.vendor} System Property. Java Virtual Machine implementation vendor.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_VERSION"
      ],
      "begin_line": 643,
      "end_line": 643,
      "comment": "\n     * \u003cp\u003e\n     * The {@code java.vm.version} System Property. Java Virtual Machine implementation version.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LINE_SEPARATOR"
      ],
      "begin_line": 661,
      "end_line": 661,
      "comment": "\n     * \u003cp\u003e\n     * The {@code line.separator} System Property. Line separator (\u003ccode\u003e\u0026quot;\\n\u0026quot;\u003c/code\u003e on UNIX).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "OS_ARCH"
      ],
      "begin_line": 679,
      "end_line": 679,
      "comment": "\n     * \u003cp\u003e\n     * The {@code os.arch} System Property. Operating system architecture.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "OS_NAME"
      ],
      "begin_line": 697,
      "end_line": 697,
      "comment": "\n     * \u003cp\u003e\n     * The {@code os.name} System Property. Operating system name.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "OS_VERSION"
      ],
      "begin_line": 715,
      "end_line": 715,
      "comment": "\n     * \u003cp\u003e\n     * The {@code os.version} System Property. Operating system version.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PATH_SEPARATOR"
      ],
      "begin_line": 733,
      "end_line": 733,
      "comment": "\n     * \u003cp\u003e\n     * The {@code path.separator} System Property. Path separator (\u003ccode\u003e\u0026quot;:\u0026quot;\u003c/code\u003e on UNIX).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_COUNTRY"
      ],
      "begin_line": 753,
      "end_line": 754,
      "comment": "\n     * \u003cp\u003e\n     * The {@code user.country} or {@code user.region} System Property. User\u0027s country code, such as {@code GB}. First\n     * in Java version 1.2 as {@code user.region}. Renamed to {@code user.country} in 1.4\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_DIR"
      ],
      "begin_line": 772,
      "end_line": 772,
      "comment": "\n     * \u003cp\u003e\n     * The {@code user.dir} System Property. User\u0027s current working directory.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_HOME"
      ],
      "begin_line": 790,
      "end_line": 790,
      "comment": "\n     * \u003cp\u003e\n     * The {@code user.home} System Property. User\u0027s home directory.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_LANGUAGE"
      ],
      "begin_line": 809,
      "end_line": 809,
      "comment": "\n     * \u003cp\u003e\n     * The {@code user.language} System Property. User\u0027s language code, such as {@code \"en\"}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_NAME"
      ],
      "begin_line": 827,
      "end_line": 827,
      "comment": "\n     * \u003cp\u003e\n     * The {@code user.name} System Property. User\u0027s account name.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_TIMEZONE"
      ],
      "begin_line": 845,
      "end_line": 845,
      "comment": "\n     * \u003cp\u003e\n     * The {@code user.timezone} System Property. For example: {@code \"America/Los_Angeles\"}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Defaults to {@code null} if the runtime does not have security access to read this property or the property does\n     * not exist.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of\n     * sync with that System property.\n     * \u003c/p\u003e\n     *\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_1"
      ],
      "begin_line": 860,
      "end_line": 860,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Java version 1.1 (also 1.1.x versions).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@link #JAVA_VERSION} is {@code null}.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_2"
      ],
      "begin_line": 870,
      "end_line": 870,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Java version 1.2 (also 1.2.x versions).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@link #JAVA_VERSION} is {@code null}.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_3"
      ],
      "begin_line": 880,
      "end_line": 880,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Java version 1.3 (also 1.3.x versions).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@link #JAVA_VERSION} is {@code null}.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_4"
      ],
      "begin_line": 890,
      "end_line": 890,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Java version 1.4 (also 1.4.x versions).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@link #JAVA_VERSION} is {@code null}.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_5"
      ],
      "begin_line": 900,
      "end_line": 900,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Java version 1.5 (also 1.5.x versions).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@link #JAVA_VERSION} is {@code null}.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_6"
      ],
      "begin_line": 910,
      "end_line": 910,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Java version 1.6 (also 1.6.x versions).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@link #JAVA_VERSION} is {@code null}.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_7"
      ],
      "begin_line": 922,
      "end_line": 922,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Java version 1.7 (also 1.7.x versions).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@link #JAVA_VERSION} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_AIX"
      ],
      "begin_line": 942,
      "end_line": 942,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is AIX.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@code OS_NAME} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_HP_UX"
      ],
      "begin_line": 954,
      "end_line": 954,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is HP-UX.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@code OS_NAME} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_IRIX"
      ],
      "begin_line": 966,
      "end_line": 966,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Irix.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@code OS_NAME} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_LINUX"
      ],
      "begin_line": 978,
      "end_line": 978,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Linux.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@code OS_NAME} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_MAC"
      ],
      "begin_line": 990,
      "end_line": 990,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Mac.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@code OS_NAME} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_MAC_OSX"
      ],
      "begin_line": 1002,
      "end_line": 1002,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Mac.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@code OS_NAME} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_OS2"
      ],
      "begin_line": 1014,
      "end_line": 1014,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is OS/2.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@code OS_NAME} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_SOLARIS"
      ],
      "begin_line": 1026,
      "end_line": 1026,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Solaris.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@code OS_NAME} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_SUN_OS"
      ],
      "begin_line": 1038,
      "end_line": 1038,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is SunOS.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@code OS_NAME} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_UNIX"
      ],
      "begin_line": 1050,
      "end_line": 1051,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is a UNIX like system, as in any of AIX, HP-UX, Irix, Linux, MacOSX, Solaris or SUN OS.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@code OS_NAME} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS"
      ],
      "begin_line": 1063,
      "end_line": 1063,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Windows.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@code OS_NAME} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_2000"
      ],
      "begin_line": 1075,
      "end_line": 1075,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Windows 2000.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@code OS_NAME} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_95"
      ],
      "begin_line": 1087,
      "end_line": 1087,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Windows 95.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@code OS_NAME} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_98"
      ],
      "begin_line": 1100,
      "end_line": 1100,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Windows 98.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@code OS_NAME} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_ME"
      ],
      "begin_line": 1113,
      "end_line": 1113,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Windows ME.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@code OS_NAME} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_NT"
      ],
      "begin_line": 1126,
      "end_line": 1126,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Windows NT.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@code OS_NAME} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_XP"
      ],
      "begin_line": 1139,
      "end_line": 1139,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Windows XP.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@code OS_NAME} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_VISTA"
      ],
      "begin_line": 1152,
      "end_line": 1152,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Windows Vista.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@code OS_NAME} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 2.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_7"
      ],
      "begin_line": 1164,
      "end_line": 1164,
      "comment": "\n     * \u003cp\u003e\n     * Is {@code true} if this is Windows 7.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The field will return {@code false} if {@code OS_NAME} is {@code null}.\n     * \u003c/p\u003e\n     *\n     * @since 3.0\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getJavaHome()",
      "begin_line": 1177,
      "end_line": 1179,
      "comment": "\n     * \u003cp\u003e\n     * Gets the Java home directory as a {@code File}.\n     * \u003c/p\u003e\n     *\n     * @return a directory\n     * @throws SecurityException if a security manager exists and its {@code checkPropertyAccess} method doesn\u0027t allow\n     * access to the specified system property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1178,col 9)-(line 1178,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getJavaIoTmpDir()",
      "begin_line": 1192,
      "end_line": 1194,
      "comment": "\n     * \u003cp\u003e\n     * Gets the Java IO temporary directory as a {@code File}.\n     * \u003c/p\u003e\n     *\n     * @return a directory\n     * @throws SecurityException if a security manager exists and its {@code checkPropertyAccess} method doesn\u0027t allow\n     * access to the specified system property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1193,col 9)-(line 1193,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getJavaVersionMatches(java.lang.String)",
      "begin_line": 1204,
      "end_line": 1206,
      "comment": "\n     * \u003cp\u003e\n     * Decides if the Java version matches.\n     * \u003c/p\u003e\n     *\n     * @param versionPrefix the prefix for the java version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 1205,col 9)-(line 1205,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getOSMatches(java.lang.String, java.lang.String)",
      "begin_line": 1215,
      "end_line": 1217,
      "comment": "\n     * Decides if the operating system matches.\n     *\n     * @param osNamePrefix the prefix for the os name\n     * @param osVersionPrefix the prefix for the version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 1216,col 9)-(line 1216,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getOSMatchesName(java.lang.String)",
      "begin_line": 1225,
      "end_line": 1227,
      "comment": "\n     * Decides if the operating system matches.\n     *\n     * @param osNamePrefix the prefix for the os name\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 1226,col 9)-(line 1226,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getSystemProperty(java.lang.String)",
      "begin_line": 1242,
      "end_line": 1251,
      "comment": "\n     * \u003cp\u003e\n     * Gets a System property, defaulting to {@code null} if the property cannot be read.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * If a {@code SecurityException} is caught, the return value is {@code null} and a message is written to\n     * {@code System.err}.\n     * \u003c/p\u003e\n     *\n     * @param property the system property name\n     * @return the system property value or {@code null} if a security problem occurs\n     ",
      "child_ranges": [
        "(line 1243,col 9)-(line 1250,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getUserDir()",
      "begin_line": 1264,
      "end_line": 1266,
      "comment": "\n     * \u003cp\u003e\n     * Gets the user directory as a {@code File}.\n     * \u003c/p\u003e\n     *\n     * @return a directory\n     * @throws SecurityException if a security manager exists and its {@code checkPropertyAccess} method doesn\u0027t allow\n     * access to the specified system property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1265,col 9)-(line 1265,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getUserHome()",
      "begin_line": 1279,
      "end_line": 1281,
      "comment": "\n     * \u003cp\u003e\n     * Gets the user home directory as a {@code File}.\n     * \u003c/p\u003e\n     *\n     * @return a directory\n     * @throws SecurityException if a security manager exists and its {@code checkPropertyAccess} method doesn\u0027t allow\n     * access to the specified system property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 1280,col 9)-(line 1280,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.isJavaAwtHeadless()",
      "begin_line": 1291,
      "end_line": 1293,
      "comment": "\n     * Returns whether the {@link #JAVA_AWT_HEADLESS} value is {@code true}.\n     *\n     * @return {@code true} if {@code JAVA_AWT_HEADLESS} is {@code \"true\"}, {@code false} otherwise.\n     * @see #JAVA_AWT_HEADLESS\n     * @since 2.1\n     * @since Java 1.4\n     ",
      "child_ranges": [
        "(line 1292,col 9)-(line 1292,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(org.apache.commons.lang3.JavaVersion)",
      "begin_line": 1310,
      "end_line": 1312,
      "comment": "\n     * \u003cp\u003e\n     * Is the Java version at least the requested version.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Example input:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e{@code 1.2f} to test for Java 1.2\u003c/li\u003e\n     * \u003cli\u003e{@code 1.31f} to test for Java 1.3.1\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param requiredVersion the required version, for example 1.31f\n     * @return {@code true} if the actual version is equal or greater than the required version\n     ",
      "child_ranges": [
        "(line 1311,col 9)-(line 1311,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.isJavaVersionMatch(java.lang.String, java.lang.String)",
      "begin_line": 1326,
      "end_line": 1331,
      "comment": "\n     * \u003cp\u003e\n     * Decides if the Java version matches.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method is package private instead of private to support unit test invocation.\n     * \u003c/p\u003e\n     *\n     * @param version the actual Java version\n     * @param versionPrefix the prefix for the expected Java version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 1327,col 9)-(line 1329,col 9)",
        "(line 1330,col 9)-(line 1330,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.isOSMatch(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 1345,
      "end_line": 1350,
      "comment": "\n     * Decides if the operating system matches.\n     * \u003cp\u003e\n     * This method is package private instead of private to support unit test invocation.\n     * \u003c/p\u003e\n     *\n     * @param osName the actual OS name\n     * @param osVersion the actual OS version\n     * @param osNamePrefix the prefix for the expected OS name\n     * @param osVersionPrefix the prefix for the expected OS version\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 1346,col 9)-(line 1348,col 9)",
        "(line 1349,col 9)-(line 1349,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.isOSNameMatch(java.lang.String, java.lang.String)",
      "begin_line": 1362,
      "end_line": 1367,
      "comment": "\n     * Decides if the operating system matches.\n     * \u003cp\u003e\n     * This method is package private instead of private to support unit test invocation.\n     * \u003c/p\u003e\n     *\n     * @param osName the actual OS name\n     * @param osNamePrefix the prefix for the expected OS name\n     * @return true if matches, or false if not or can\u0027t determine\n     ",
      "child_ranges": [
        "(line 1363,col 9)-(line 1365,col 9)",
        "(line 1366,col 9)-(line 1366,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SystemUtils.SystemUtils()",
      "begin_line": 1379,
      "end_line": 1381,
      "comment": "\n     * \u003cp\u003e\n     * SystemUtils instances should NOT be constructed in standard programming. Instead, the class should be used as\n     * {@code SystemUtils.FILE_SEPARATOR}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This constructor is public to permit tools that require a JavaBean instance to operate.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1380,col 9)-(line 1380,col 16)"
      ]
    }
  ]
}