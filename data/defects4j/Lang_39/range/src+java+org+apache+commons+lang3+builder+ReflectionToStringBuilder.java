{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/builder/ReflectionToStringBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReflectionToStringBuilder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringBuilder"
      ],
      "begin_line": 98,
      "end_line": 707,
      "comment": "\n * \u003cp\u003e\n * Assists in implementing {@link Object#toString()} methods using reflection.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * This class uses reflection to determine the fields to append. Because these fields are usually private, the class\n * uses {@link java.lang.reflect.AccessibleObject#setAccessible(java.lang.reflect.AccessibleObject[], boolean)} to\n * change the visibility of the fields. This will fail under a security manager, unless the appropriate permissions are\n * set up correctly.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * A typical invocation for this method would look like:\n * \u003c/p\u003e\n * \n * \u003cpre\u003e\n * public String toString() {\n *   return ReflectionToStringBuilder.toString(this);\n * }\u003c/pre\u003e\n * \n * \n * \n * \u003cp\u003e\n * You can also use the builder to debug 3rd party objects:\n * \u003c/p\u003e\n * \n * \u003cpre\u003e\n * System.out.println(\"An object: \" + ReflectionToStringBuilder.toString(anObject));\u003c/pre\u003e\n * \n * \n * \n * \u003cp\u003e\n * A subclass can control field output by overriding the methods:\n * \u003cul\u003e\n * \u003cli\u003e{@link #accept(java.lang.reflect.Field)}\u003c/li\u003e\n * \u003cli\u003e{@link #getValue(java.lang.reflect.Field)}\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * For example, this method does \u003ci\u003enot\u003c/i\u003e include the \u003ccode\u003epassword\u003c/code\u003e field in the returned\n * \u003ccode\u003eString\u003c/code\u003e:\n * \u003c/p\u003e\n * \n * \u003cpre\u003e\n * public String toString() {\n *     return (new ReflectionToStringBuilder(this) {\n *         protected boolean accept(Field f) {\n *             return super.accept(f) \u0026\u0026 !f.getName().equals(\"password\");\n *         }\n *     }).toString();\n * }\u003c/pre\u003e\n * \n * \n * \n * \u003cp\u003e\n * The exact format of the \u003ccode\u003etoString\u003c/code\u003e is determined by the {@link ToStringStyle} passed into the\n * constructor.\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @author Gary Gregory\n * @author Pete Gieser\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(java.lang.Object)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value using the default \u003ccode\u003eToStringStyle\u003c/code\u003e through reflection.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be included, as they are likely derived. Static fields will not be included.\n     * Superclass fields will be appended.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to be output\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value through reflection.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be included, as they are likely derived. Static fields will not be included.\n     * Superclass fields will be appended.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to be output\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object or \u003ccode\u003eToStringStyle\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle, boolean)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value through reflection.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, transient members will be output, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the Object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be included. Superclass fields will be appended.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to be output\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients\n     *            whether to include transient fields\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle, boolean, boolean)",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value through reflection.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, transient fields will be output, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the Object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputStatics\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, static fields will be output, otherwise they are\n     * ignored.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be included. Superclass fields will be appended.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to be output\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients\n     *            whether to include transient fields\n     * @param outputStatics\n     *            whether to include transient fields\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(T, org.apache.commons.lang3.builder.ToStringStyle, boolean, boolean, java.lang.Class\u003c? super T\u003e)",
      "begin_line": 287,
      "end_line": 292,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value through reflection.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, transient fields will be output, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the Object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputStatics\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, static fields will be output, otherwise they are\n     * ignored.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Superclass fields will be appended up to and including the specified superclass. A null superclass is treated as\n     * \u003ccode\u003ejava.lang.Object\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to be output\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients\n     *            whether to include transient fields\n     * @param outputStatics\n     *            whether to include static fields\n     * @param reflectUpToClass\n     *            the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 291,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(java.lang.Object, java.lang.String)",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\n     * Builds a String for a toString method excluding the given field name.\n     * \n     * @param object\n     *            The object to \"toString\".\n     * @param excludeFieldName\n     *            The field name to exclude\n     * @return The toString value.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(java.lang.Object, java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 316,
      "end_line": 318,
      "comment": "\n     * Builds a String for a toString method excluding the given field names.\n     * \n     * @param object\n     *            The object to \"toString\".\n     * @param excludeFieldNames\n     *            The field names to exclude. Null excludes nothing.\n     * @return The toString value.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 329,
      "end_line": 334,
      "comment": "\n     * Converts the given Collection into an array of Strings. The returned array does not contain \u003ccode\u003enull\u003c/code\u003e\n     * entries. Note that {@link Arrays#sort(Object[])} will throw an {@link NullPointerException} if an array element \n     * is \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @param collection\n     *            The collection to convert\n     * @return A new array of Strings.\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(java.lang.Object[])",
      "begin_line": 345,
      "end_line": 353,
      "comment": "\n     * Returns a new array of Strings without null elements. Internal method used to normalize exclude lists\n     * (arrays and collections). Note that {@link Arrays#sort(Object[])} will throw an {@link NullPointerException} \n     * if an array element is \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @param array\n     *            The array to check\n     * @return The given array or a new array without null.\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 64)",
        "(line 347,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(java.lang.Object, java.lang.String[])",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\n     * Builds a String for a toString method excluding the given field names.\n     * \n     * @param object\n     *            The object to \"toString\".\n     * @param excludeFieldNames\n     *            The field names to exclude\n     * @return The toString value.\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 104)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "appendStatics"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": "\n     * Whether or not to append static fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "appendTransients"
      ],
      "begin_line": 377,
      "end_line": 377,
      "comment": "\n     * Whether or not to append transient fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "excludeFieldNames"
      ],
      "begin_line": 382,
      "end_line": 382,
      "comment": "\n     * Which field names to exclude from output. Intended for fields like \u003ccode\u003e\"password\"\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "upToClass"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": "\n     * The last super class to stop appending fields for.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.ReflectionToStringBuilder(java.lang.Object)",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\n     * \u003cp\u003e\n     * Constructor.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor outputs using the default style set with \u003ccode\u003esetDefaultStyle\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to build a \u003ccode\u003etoString\u003c/code\u003e for, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the Object passed in is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.ReflectionToStringBuilder(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle)",
      "begin_line": 423,
      "end_line": 425,
      "comment": "\n     * \u003cp\u003e\n     * Constructor.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default style is used.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to build a \u003ccode\u003etoString\u003c/code\u003e for, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the Object passed in is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.ReflectionToStringBuilder(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle, java.lang.StringBuffer)",
      "begin_line": 449,
      "end_line": 451,
      "comment": "\n     * \u003cp\u003e\n     * Constructor.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default style is used.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the buffer is \u003ccode\u003enull\u003c/code\u003e, a new one is created.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to build a \u003ccode\u003etoString\u003c/code\u003e for\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param buffer\n     *            the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate, may be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the Object passed in is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.ReflectionToStringBuilder(T, org.apache.commons.lang3.builder.ToStringStyle, java.lang.StringBuffer, java.lang.Class\u003c? super T\u003e, boolean, boolean)",
      "begin_line": 470,
      "end_line": 477,
      "comment": "\n     * Constructor.\n     * \n     * @param object\n     *            the Object to build a \u003ccode\u003etoString\u003c/code\u003e for\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param buffer\n     *            the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param reflectUpToClass\n     *            the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients\n     *            whether to include transient fields\n     * @param outputStatics\n     *            whether to include static fields\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 37)",
        "(line 474,col 9)-(line 474,col 44)",
        "(line 475,col 9)-(line 475,col 51)",
        "(line 476,col 9)-(line 476,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.accept(java.lang.reflect.Field)",
      "begin_line": 491,
      "end_line": 510,
      "comment": "\n     * Returns whether or not to append the given \u003ccode\u003eField\u003c/code\u003e.\n     * \u003cul\u003e\n     * \u003cli\u003eTransient fields are appended only if {@link #isAppendTransients()} returns \u003ccode\u003etrue\u003c/code\u003e.\n     * \u003cli\u003eStatic fields are appended only if {@link #isAppendStatics()} returns \u003ccode\u003etrue\u003c/code\u003e.\n     * \u003cli\u003eInner class fields are not appened.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param field\n     *            The Field to test.\n     * @return Whether or not to append the given \u003ccode\u003eField\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.appendFieldsIn(java.lang.Class\u003c?\u003e)",
      "begin_line": 525,
      "end_line": 549,
      "comment": "\n     * \u003cp\u003e\n     * Appends the fields and values defined by the given object of the given Class.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If a cycle is detected as an object is \u0026quot;toString()\u0027ed\u0026quot;, such an object is rendered as if\n     * \u003ccode\u003eObject.toString()\u003c/code\u003e had been called and not implemented by the object.\n     * \u003c/p\u003e\n     * \n     * @param clazz\n     *            The class of object parameter\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 530,col 51)",
        "(line 531,col 9)-(line 531,col 53)",
        "(line 532,col 9)-(line 548,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.getExcludeFieldNames()",
      "begin_line": 554,
      "end_line": 556,
      "comment": "\n     * @return Returns the excludeFieldNames.\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.getUpToClass()",
      "begin_line": 565,
      "end_line": 567,
      "comment": "\n     * \u003cp\u003e\n     * Gets the last super class to stop appending fields for.\n     * \u003c/p\u003e\n     * \n     * @return The last super class to stop appending fields for.\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.getValue(java.lang.reflect.Field)",
      "begin_line": 585,
      "end_line": 587,
      "comment": "\n     * \u003cp\u003e\n     * Calls \u003ccode\u003ejava.lang.reflect.Field.get(Object)\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param field\n     *            The Field to query.\n     * @return The Object from the given Field.\n     * \n     * @throws IllegalArgumentException\n     *             see {@link java.lang.reflect.Field#get(Object)}\n     * @throws IllegalAccessException\n     *             see {@link java.lang.reflect.Field#get(Object)}\n     * \n     * @see java.lang.reflect.Field#get(Object)\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.isAppendStatics()",
      "begin_line": 597,
      "end_line": 599,
      "comment": "\n     * \u003cp\u003e\n     * Gets whether or not to append static fields.\n     * \u003c/p\u003e\n     * \n     * @return Whether or not to append static fields.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.isAppendTransients()",
      "begin_line": 608,
      "end_line": 610,
      "comment": "\n     * \u003cp\u003e\n     * Gets whether or not to append transient fields.\n     * \u003c/p\u003e\n     * \n     * @return Whether or not to append transient fields.\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.reflectionAppendArray(java.lang.Object)",
      "begin_line": 621,
      "end_line": 624,
      "comment": "\n     * \u003cp\u003e\n     * Append to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 89)",
        "(line 623,col 9)-(line 623,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.setAppendStatics(boolean)",
      "begin_line": 635,
      "end_line": 637,
      "comment": "\n     * \u003cp\u003e\n     * Sets whether or not to append static fields.\n     * \u003c/p\u003e\n     * \n     * @param appendStatics\n     *            Whether or not to append static fields.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.setAppendTransients(boolean)",
      "begin_line": 647,
      "end_line": 649,
      "comment": "\n     * \u003cp\u003e\n     * Sets whether or not to append transient fields.\n     * \u003c/p\u003e\n     * \n     * @param appendTransients\n     *            Whether or not to append transient fields.\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.setExcludeFieldNames(java.lang.String[])",
      "begin_line": 658,
      "end_line": 666,
      "comment": "\n     * Sets the field names to exclude.\n     * \n     * @param excludeFieldNamesParam\n     *            The excludeFieldNames to excluding from toString or \u003ccode\u003enull\u003c/code\u003e.\n     * @return \u003ccode\u003ethis\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 665,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.setUpToClass(java.lang.Class\u003c?\u003e)",
      "begin_line": 676,
      "end_line": 684,
      "comment": "\n     * \u003cp\u003e\n     * Sets the last super class to stop appending fields for.\n     * \u003c/p\u003e\n     * \n     * @param clazz\n     *            The last super class to stop appending fields for.\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 682,col 9)",
        "(line 683,col 9)-(line 683,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString()",
      "begin_line": 693,
      "end_line": 705,
      "comment": "\n     * \u003cp\u003e\n     * Gets the String built by this builder.\n     * \u003c/p\u003e\n     * \n     * @return the built string\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 698,col 53)",
        "(line 699,col 9)-(line 699,col 35)",
        "(line 700,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 704,col 32)"
      ]
    }
  ]
}