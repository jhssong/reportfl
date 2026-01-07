{
  "filepath": "/tmp/Lang-62b/src/java/org/apache/commons/lang/builder/ReflectionToStringBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReflectionToStringBuilder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.ToStringBuilder"
      ],
      "begin_line": 97,
      "end_line": 883,
      "comment": "\n * \u003cp\u003e\n * Assists in implementing {@link Object#toString()} methods using reflection.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * This class uses reflection to determine the fields to append. Because these fields are usually private, the class\n * uses {@link java.lang.reflect.AccessibleObject#setAccessible(java.lang.reflect.AccessibleObject[], boolean)} to\n * change the visibility of the fields. This will fail under a security manager, unless the appropriate permissions are\n * set up correctly.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * A typical invocation for this method would look like:\n * \u003c/p\u003e\n * \n * \u003cpre\u003e\n * public String toString() {\n *   return ReflectionToStringBuilder.toString(this);\n * }\u003c/pre\u003e\n * \n * \n * \n * \u003cp\u003e\n * You can also use the builder to debug 3rd party objects:\n * \u003c/p\u003e\n * \n * \u003cpre\u003e\n * System.out.println(\"An object: \" + ReflectionToStringBuilder.toString(anObject));\u003c/pre\u003e\n * \n * \n * \n * \u003cp\u003e\n * A subclass can control field output by overriding the methods:\n * \u003cul\u003e\n * \u003cli\u003e{@link #accept(java.lang.reflect.Field)}\u003c/li\u003e\n * \u003cli\u003e{@link #getValue(java.lang.reflect.Field)}\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * For example, this method does \u003ci\u003enot\u003c/i\u003e include the \u003ccode\u003epassword\u003c/code\u003e field in the returned\n * \u003ccode\u003eString\u003c/code\u003e:\n * \u003c/p\u003e\n * \n * \u003cpre\u003e\n * public String toString() {\n *     return (new ReflectionToStringBuilder(this) {\n *         protected boolean accept(Field f) {\n *             return super.accept(f) \u0026\u0026 !f.getName().equals(\"password\");\n *         }\n *     }).toString();\n * }\u003c/pre\u003e\n * \n * \n * \n * \u003cp\u003e\n * The exact format of the \u003ccode\u003etoString\u003c/code\u003e is determined by the {@link ToStringStyle} passed into the\n * constructor.\n * \u003c/p\u003e\n * \n * @author Gary Gregory\n * @author Stephen Colebourne\n * @author Pete Gieser\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 104,
      "end_line": 110,
      "comment": "\n     * \u003cp\u003e\n     * A registry of objects used by \u003ccode\u003ereflectionToString\u003c/code\u003e methods to detect cyclical object references and\n     * avoid infinite loops.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.Anonymous-a12b8a2b-4544-4f82-b306-ae03ee03bfe7.initialValue()",
      "begin_line": 105,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.getRegistry()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * \u003cp\u003e\n     * Returns the registry of objects being traversed by the \u003ccode\u003ereflectionToString\u003c/code\u003e methods in the current\n     * thread.\n     * \u003c/p\u003e\n     * \n     * @return Set the registry of objects being traversed\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.isRegistered(java.lang.Object)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given object. Used by the reflection methods to avoid\n     * infinite loops.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            The object to lookup in the registry.\n     * @return boolean \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given object.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.register(java.lang.Object)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * \u003cp\u003e\n     * Registers the given object. Used by the reflection methods to avoid infinite loops.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            The object to register.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(java.lang.Object)",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value using the default \u003ccode\u003eToStringStyle\u003c/code\u003e through reflection.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be included, as they are likely derived. Static fields will not be included.\n     * Superclass fields will be appended.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to be output\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value through reflection.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be included, as they are likely derived. Static fields will not be included.\n     * Superclass fields will be appended.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to be output\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object or \u003ccode\u003eToStringStyle\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle, boolean)",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value through reflection.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, transient members will be output, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the Object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be included. Superclass fields will be appended.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to be output\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients\n     *            whether to include transient fields\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle, boolean, boolean)",
      "begin_line": 288,
      "end_line": 290,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value through reflection.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, transient fields will be output, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the Object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputStatics\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, static fields will be output, otherwise they are\n     * ignored.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be included. Superclass fields will be appended.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to be output\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients\n     *            whether to include transient fields\n     * @param outputStatics\n     *            whether to include transient fields\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle, boolean, boolean, java.lang.Class)",
      "begin_line": 337,
      "end_line": 341,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value through reflection.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, transient fields will be output, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the Object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputStatics\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, static fields will be output, otherwise they are\n     * ignored.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Superclass fields will be appended up to and including the specified superclass. A null superclass is treated as\n     * \u003ccode\u003ejava.lang.Object\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to be output\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients\n     *            whether to include transient fields\n     * @param outputStatics\n     *            whether to include static fields\n     * @param reflectUpToClass\n     *            the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 340,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle, boolean, java.lang.Class)",
      "begin_line": 383,
      "end_line": 387,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value through reflection.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, transient members will be output, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the Object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be included. Superclass fields will be appended up to and including the specified\n     * superclass. A null superclass is treated as \u003ccode\u003ejava.lang.Object\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\n     * \u003c/p\u003e\n     * \n     * @deprecated Use {@link #toString(Object,ToStringStyle,boolean,boolean,Class)}\n     * \n     * @param object\n     *            the Object to be output\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients\n     *            whether to include transient fields\n     * @param reflectUpToClass\n     *            the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.toStringExclude(java.lang.Object, java.lang.String)",
      "begin_line": 398,
      "end_line": 400,
      "comment": "\n     * Builds a String for a toString method excluding the given field name.\n     * \n     * @param object\n     *            The object to \"toString\".\n     * @param excludeFieldName\n     *            The field name to exclude\n     * @return The toString value.\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.toStringExclude(java.lang.Object, java.util.Collection)",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\n     * Builds a String for a toString method excluding the given field names.\n     * \n     * @param object\n     *            The object to \"toString\".\n     * @param excludeFieldNames\n     *            The field names to exclude. Null excludes nothing.\n     * @return The toString value.\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.toNoNullStringArray(java.util.Collection)",
      "begin_line": 424,
      "end_line": 429,
      "comment": "\n     * Converts the given Collection into an array of Strings. The returned array does not contain \u003ccode\u003enull\u003c/code\u003e\n     * entries. Note that {@link Arrays#sort(Object[])} will throw an {@link NullPointerException} if an array element \n     * is \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @param collection\n     *            The collection to convert\n     * @return A new array of Strings.\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.toNoNullStringArray(java.lang.Object[])",
      "begin_line": 440,
      "end_line": 449,
      "comment": "\n     * Returns a new array of Strings without null elements. Internal method used to normalize exclude lists\n     * (arrays and collections). Note that {@link Arrays#sort(Object[])} will throw an {@link NullPointerException} \n     * if an array element is \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @param array\n     *            The array to check\n     * @return The given array or a new array without null.\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 53)",
        "(line 442,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.toStringExclude(java.lang.Object, java.lang.String[])",
      "begin_line": 461,
      "end_line": 463,
      "comment": "\n     * Builds a String for a toString method excluding the given field names.\n     * \n     * @param object\n     *            The object to \"toString\".\n     * @param excludeFieldNames\n     *            The field names to exclude\n     * @return The toString value.\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.unregister(java.lang.Object)",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\n     * \u003cp\u003e\n     * Unregisters the given object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Used by the reflection methods to avoid infinite loops.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            The object to unregister.\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 36)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "appendStatics"
      ],
      "begin_line": 484,
      "end_line": 484,
      "comment": "\n     * Whether or not to append static fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "appendTransients"
      ],
      "begin_line": 489,
      "end_line": 489,
      "comment": "\n     * Whether or not to append transient fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "excludeFieldNames"
      ],
      "begin_line": 494,
      "end_line": 494,
      "comment": "\n     * Which field names to exclude from output. Intended for fields like \u003ccode\u003e\"password\"\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "upToClass"
      ],
      "begin_line": 499,
      "end_line": 499,
      "comment": "\n     * The last super class to stop appending fields for.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.ReflectionToStringBuilder(java.lang.Object)",
      "begin_line": 515,
      "end_line": 517,
      "comment": "\n     * \u003cp\u003e\n     * Constructor.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor outputs using the default style set with \u003ccode\u003esetDefaultStyle\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to build a \u003ccode\u003etoString\u003c/code\u003e for, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the Object passed in is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.ReflectionToStringBuilder(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle)",
      "begin_line": 535,
      "end_line": 537,
      "comment": "\n     * \u003cp\u003e\n     * Constructor.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default style is used.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to build a \u003ccode\u003etoString\u003c/code\u003e for, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the Object passed in is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.ReflectionToStringBuilder(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle, java.lang.StringBuffer)",
      "begin_line": 561,
      "end_line": 563,
      "comment": "\n     * \u003cp\u003e\n     * Constructor.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default style is used.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the buffer is \u003ccode\u003enull\u003c/code\u003e, a new one is created.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to build a \u003ccode\u003etoString\u003c/code\u003e for\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param buffer\n     *            the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate, may be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the Object passed in is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.ReflectionToStringBuilder(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle, java.lang.StringBuffer, java.lang.Class, boolean)",
      "begin_line": 581,
      "end_line": 586,
      "comment": "\n     * Constructor.\n     * \n     * @deprecated Use {@link #ReflectionToStringBuilder(Object,ToStringStyle,StringBuffer,Class,boolean,boolean)}.\n     * \n     * @param object\n     *            the Object to build a \u003ccode\u003etoString\u003c/code\u003e for\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param buffer\n     *            the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param reflectUpToClass\n     *            the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients\n     *            whether to include transient fields\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 37)",
        "(line 584,col 9)-(line 584,col 44)",
        "(line 585,col 9)-(line 585,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.ReflectionToStringBuilder(java.lang.Object, org.apache.commons.lang.builder.ToStringStyle, java.lang.StringBuffer, java.lang.Class, boolean, boolean)",
      "begin_line": 605,
      "end_line": 611,
      "comment": "\n     * Constructor.\n     * \n     * @param object\n     *            the Object to build a \u003ccode\u003etoString\u003c/code\u003e for\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param buffer\n     *            the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param reflectUpToClass\n     *            the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients\n     *            whether to include transient fields\n     * @param outputStatics\n     *            whether to include static fields\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 37)",
        "(line 608,col 9)-(line 608,col 44)",
        "(line 609,col 9)-(line 609,col 51)",
        "(line 610,col 9)-(line 610,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.accept(java.lang.reflect.Field)",
      "begin_line": 625,
      "end_line": 644,
      "comment": "\n     * Returns whether or not to append the given \u003ccode\u003eField\u003c/code\u003e.\n     * \u003cul\u003e\n     * \u003cli\u003eTransient fields are appended only if {@link #isAppendTransients()} returns \u003ccode\u003etrue\u003c/code\u003e.\n     * \u003cli\u003eStatic fields are appended only if {@link #isAppendStatics()} returns \u003ccode\u003etrue\u003c/code\u003e.\n     * \u003cli\u003eInner class fields are not appened.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param field\n     *            The Field to test.\n     * @return Whether or not to append the given \u003ccode\u003eField\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 637,col 9)",
        "(line 638,col 9)-(line 642,col 9)",
        "(line 643,col 9)-(line 643,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.appendFieldsIn(java.lang.Class)",
      "begin_line": 659,
      "end_line": 715,
      "comment": "\n     * \u003cp\u003e\n     * Appends the fields and values defined by the given object of the given Class.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If a cycle is detected as an object is \u0026quot;toString()\u0027ed\u0026quot;, such an object is rendered as if\n     * \u003ccode\u003eObject.toString()\u003c/code\u003e had been called and not implemented by the object.\n     * \u003c/p\u003e\n     * \n     * @param clazz\n     *            The class of object parameter\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 714,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.getExcludeFieldNames()",
      "begin_line": 720,
      "end_line": 722,
      "comment": "\n     * @return Returns the excludeFieldNames.\n     ",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.getUpToClass()",
      "begin_line": 731,
      "end_line": 733,
      "comment": "\n     * \u003cp\u003e\n     * Gets the last super class to stop appending fields for.\n     * \u003c/p\u003e\n     * \n     * @return The last super class to stop appending fields for.\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.getValue(java.lang.reflect.Field)",
      "begin_line": 751,
      "end_line": 753,
      "comment": "\n     * \u003cp\u003e\n     * Calls \u003ccode\u003ejava.lang.reflect.Field.get(Object)\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param field\n     *            The Field to query.\n     * @return The Object from the given Field.\n     * \n     * @throws IllegalArgumentException\n     *             see {@link java.lang.reflect.Field#get(Object)}\n     * @throws IllegalAccessException\n     *             see {@link java.lang.reflect.Field#get(Object)}\n     * \n     * @see java.lang.reflect.Field#get(Object)\n     ",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.isAppendStatics()",
      "begin_line": 763,
      "end_line": 765,
      "comment": "\n     * \u003cp\u003e\n     * Gets whether or not to append static fields.\n     * \u003c/p\u003e\n     * \n     * @return Whether or not to append static fields.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 764,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.isAppendTransients()",
      "begin_line": 774,
      "end_line": 776,
      "comment": "\n     * \u003cp\u003e\n     * Gets whether or not to append transient fields.\n     * \u003c/p\u003e\n     * \n     * @return Whether or not to append transient fields.\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.reflectionAppendArray(java.lang.Object)",
      "begin_line": 787,
      "end_line": 790,
      "comment": "\n     * \u003cp\u003e\n     * Append to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 788,col 9)-(line 788,col 89)",
        "(line 789,col 9)-(line 789,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.registerObject()",
      "begin_line": 797,
      "end_line": 799,
      "comment": "\n     * \u003cp\u003e\n     * Registers this builder\u0027s source object to avoid infinite loops when processing circular object references.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.setAppendStatics(boolean)",
      "begin_line": 810,
      "end_line": 812,
      "comment": "\n     * \u003cp\u003e\n     * Sets whether or not to append static fields.\n     * \u003c/p\u003e\n     * \n     * @param appendStatics\n     *            Whether or not to append static fields.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.setAppendTransients(boolean)",
      "begin_line": 822,
      "end_line": 824,
      "comment": "\n     * \u003cp\u003e\n     * Sets whether or not to append transient fields.\n     * \u003c/p\u003e\n     * \n     * @param appendTransients\n     *            Whether or not to append transient fields.\n     ",
      "child_ranges": [
        "(line 823,col 9)-(line 823,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.setExcludeFieldNames(java.lang.String[])",
      "begin_line": 833,
      "end_line": 841,
      "comment": "\n     * Sets the field names to exclude.\n     * \n     * @param excludeFieldNamesParam\n     *            The excludeFieldNames to excluding from toString or \u003ccode\u003enull\u003c/code\u003e.\n     * @return \u003ccode\u003ethis\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 839,col 9)",
        "(line 840,col 9)-(line 840,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.setUpToClass(java.lang.Class)",
      "begin_line": 851,
      "end_line": 853,
      "comment": "\n     * \u003cp\u003e\n     * Sets the last super class to stop appending fields for.\n     * \u003c/p\u003e\n     * \n     * @param clazz\n     *            The last super class to stop appending fields for.\n     ",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.toString()",
      "begin_line": 862,
      "end_line": 873,
      "comment": "\n     * \u003cp\u003e\n     * Gets the String built by this builder.\n     * \u003c/p\u003e\n     * \n     * @return the built string\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 865,col 9)",
        "(line 866,col 9)-(line 866,col 50)",
        "(line 867,col 9)-(line 867,col 35)",
        "(line 868,col 9)-(line 871,col 9)",
        "(line 872,col 9)-(line 872,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.ReflectionToStringBuilder.unregisterObject()",
      "begin_line": 880,
      "end_line": 882,
      "comment": "\n     * \u003cp\u003e\n     * Unregisters this builder\u0027s source object to avoid infinite loops when processing circular object references.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 881,col 9)-(line 881,col 37)"
      ]
    }
  ]
}