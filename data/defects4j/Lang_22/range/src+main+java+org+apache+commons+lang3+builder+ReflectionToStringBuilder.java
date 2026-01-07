{
  "filepath": "/tmp/Lang-22b/src/main/java/org/apache/commons/lang3/builder/ReflectionToStringBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReflectionToStringBuilder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringBuilder"
      ],
      "begin_line": 97,
      "end_line": 706,
      "comment": "\n * \u003cp\u003e\n * Assists in implementing {@link Object#toString()} methods using reflection.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * This class uses reflection to determine the fields to append. Because these fields are usually private, the class\n * uses {@link java.lang.reflect.AccessibleObject#setAccessible(java.lang.reflect.AccessibleObject[], boolean)} to\n * change the visibility of the fields. This will fail under a security manager, unless the appropriate permissions are\n * set up correctly.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * A typical invocation for this method would look like:\n * \u003c/p\u003e\n * \n * \u003cpre\u003e\n * public String toString() {\n *   return ReflectionToStringBuilder.toString(this);\n * }\u003c/pre\u003e\n * \n * \n * \n * \u003cp\u003e\n * You can also use the builder to debug 3rd party objects:\n * \u003c/p\u003e\n * \n * \u003cpre\u003e\n * System.out.println(\"An object: \" + ReflectionToStringBuilder.toString(anObject));\u003c/pre\u003e\n * \n * \n * \n * \u003cp\u003e\n * A subclass can control field output by overriding the methods:\n * \u003cul\u003e\n * \u003cli\u003e{@link #accept(java.lang.reflect.Field)}\u003c/li\u003e\n * \u003cli\u003e{@link #getValue(java.lang.reflect.Field)}\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * For example, this method does \u003ci\u003enot\u003c/i\u003e include the \u003ccode\u003epassword\u003c/code\u003e field in the returned\n * \u003ccode\u003eString\u003c/code\u003e:\n * \u003c/p\u003e\n * \n * \u003cpre\u003e\n * public String toString() {\n *     return (new ReflectionToStringBuilder(this) {\n *         protected boolean accept(Field f) {\n *             return super.accept(f) \u0026\u0026 !f.getName().equals(\"password\");\n *         }\n *     }).toString();\n * }\u003c/pre\u003e\n * \n * \n * \n * \u003cp\u003e\n * The exact format of the \u003ccode\u003etoString\u003c/code\u003e is determined by the {@link ToStringStyle} passed into the\n * constructor.\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @author Gary Gregory\n * @author Pete Gieser\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(java.lang.Object)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value using the default \u003ccode\u003eToStringStyle\u003c/code\u003e through reflection.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be included, as they are likely derived. Static fields will not be included.\n     * Superclass fields will be appended.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to be output\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value through reflection.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be included, as they are likely derived. Static fields will not be included.\n     * Superclass fields will be appended.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to be output\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object or \u003ccode\u003eToStringStyle\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle, boolean)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value through reflection.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, transient members will be output, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the Object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be included. Superclass fields will be appended.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to be output\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients\n     *            whether to include transient fields\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle, boolean, boolean)",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value through reflection.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, transient fields will be output, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the Object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputStatics\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, static fields will be output, otherwise they are\n     * ignored.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be included. Superclass fields will be appended.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to be output\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients\n     *            whether to include transient fields\n     * @param outputStatics\n     *            whether to include transient fields\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(T, org.apache.commons.lang3.builder.ToStringStyle, boolean, boolean, java.lang.Class\u003c? super T\u003e)",
      "begin_line": 286,
      "end_line": 291,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value through reflection.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, transient fields will be output, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the Object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputStatics\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, static fields will be output, otherwise they are\n     * ignored.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Superclass fields will be appended up to and including the specified superclass. A null superclass is treated as\n     * \u003ccode\u003ejava.lang.Object\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to be output\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients\n     *            whether to include transient fields\n     * @param outputStatics\n     *            whether to include static fields\n     * @param reflectUpToClass\n     *            the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 290,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(java.lang.Object, java.lang.String)",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * Builds a String for a toString method excluding the given field name.\n     * \n     * @param object\n     *            The object to \"toString\".\n     * @param excludeFieldName\n     *            The field name to exclude\n     * @return The toString value.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(java.lang.Object, java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 315,
      "end_line": 317,
      "comment": "\n     * Builds a String for a toString method excluding the given field names.\n     * \n     * @param object\n     *            The object to \"toString\".\n     * @param excludeFieldNames\n     *            The field names to exclude. Null excludes nothing.\n     * @return The toString value.\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 328,
      "end_line": 333,
      "comment": "\n     * Converts the given Collection into an array of Strings. The returned array does not contain \u003ccode\u003enull\u003c/code\u003e\n     * entries. Note that {@link Arrays#sort(Object[])} will throw an {@link NullPointerException} if an array element \n     * is \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @param collection\n     *            The collection to convert\n     * @return A new array of Strings.\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(java.lang.Object[])",
      "begin_line": 344,
      "end_line": 352,
      "comment": "\n     * Returns a new array of Strings without null elements. Internal method used to normalize exclude lists\n     * (arrays and collections). Note that {@link Arrays#sort(Object[])} will throw an {@link NullPointerException} \n     * if an array element is \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @param array\n     *            The array to check\n     * @return The given array or a new array without null.\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 64)",
        "(line 346,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(java.lang.Object, java.lang.String[])",
      "begin_line": 364,
      "end_line": 366,
      "comment": "\n     * Builds a String for a toString method excluding the given field names.\n     * \n     * @param object\n     *            The object to \"toString\".\n     * @param excludeFieldNames\n     *            The field names to exclude\n     * @return The toString value.\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 104)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "appendStatics"
      ],
      "begin_line": 371,
      "end_line": 371,
      "comment": "\n     * Whether or not to append static fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "appendTransients"
      ],
      "begin_line": 376,
      "end_line": 376,
      "comment": "\n     * Whether or not to append transient fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "excludeFieldNames"
      ],
      "begin_line": 381,
      "end_line": 381,
      "comment": "\n     * Which field names to exclude from output. Intended for fields like \u003ccode\u003e\"password\"\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "upToClass"
      ],
      "begin_line": 386,
      "end_line": 386,
      "comment": "\n     * The last super class to stop appending fields for.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.ReflectionToStringBuilder(java.lang.Object)",
      "begin_line": 402,
      "end_line": 404,
      "comment": "\n     * \u003cp\u003e\n     * Constructor.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor outputs using the default style set with \u003ccode\u003esetDefaultStyle\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to build a \u003ccode\u003etoString\u003c/code\u003e for, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the Object passed in is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.ReflectionToStringBuilder(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle)",
      "begin_line": 422,
      "end_line": 424,
      "comment": "\n     * \u003cp\u003e\n     * Constructor.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default style is used.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to build a \u003ccode\u003etoString\u003c/code\u003e for, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the Object passed in is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.ReflectionToStringBuilder(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle, java.lang.StringBuffer)",
      "begin_line": 448,
      "end_line": 450,
      "comment": "\n     * \u003cp\u003e\n     * Constructor.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default style is used.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the buffer is \u003ccode\u003enull\u003c/code\u003e, a new one is created.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to build a \u003ccode\u003etoString\u003c/code\u003e for\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param buffer\n     *            the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate, may be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the Object passed in is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.ReflectionToStringBuilder(T, org.apache.commons.lang3.builder.ToStringStyle, java.lang.StringBuffer, java.lang.Class\u003c? super T\u003e, boolean, boolean)",
      "begin_line": 469,
      "end_line": 476,
      "comment": "\n     * Constructor.\n     * \n     * @param object\n     *            the Object to build a \u003ccode\u003etoString\u003c/code\u003e for\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param buffer\n     *            the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param reflectUpToClass\n     *            the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients\n     *            whether to include transient fields\n     * @param outputStatics\n     *            whether to include static fields\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 37)",
        "(line 473,col 9)-(line 473,col 44)",
        "(line 474,col 9)-(line 474,col 51)",
        "(line 475,col 9)-(line 475,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.accept(java.lang.reflect.Field)",
      "begin_line": 490,
      "end_line": 509,
      "comment": "\n     * Returns whether or not to append the given \u003ccode\u003eField\u003c/code\u003e.\n     * \u003cul\u003e\n     * \u003cli\u003eTransient fields are appended only if {@link #isAppendTransients()} returns \u003ccode\u003etrue\u003c/code\u003e.\n     * \u003cli\u003eStatic fields are appended only if {@link #isAppendStatics()} returns \u003ccode\u003etrue\u003c/code\u003e.\n     * \u003cli\u003eInner class fields are not appened.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param field\n     *            The Field to test.\n     * @return Whether or not to append the given \u003ccode\u003eField\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 508,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.appendFieldsIn(java.lang.Class\u003c?\u003e)",
      "begin_line": 524,
      "end_line": 548,
      "comment": "\n     * \u003cp\u003e\n     * Appends the fields and values defined by the given object of the given Class.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If a cycle is detected as an object is \u0026quot;toString()\u0027ed\u0026quot;, such an object is rendered as if\n     * \u003ccode\u003eObject.toString()\u003c/code\u003e had been called and not implemented by the object.\n     * \u003c/p\u003e\n     * \n     * @param clazz\n     *            The class of object parameter\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 51)",
        "(line 530,col 9)-(line 530,col 53)",
        "(line 531,col 9)-(line 547,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.getExcludeFieldNames()",
      "begin_line": 553,
      "end_line": 555,
      "comment": "\n     * @return Returns the excludeFieldNames.\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.getUpToClass()",
      "begin_line": 564,
      "end_line": 566,
      "comment": "\n     * \u003cp\u003e\n     * Gets the last super class to stop appending fields for.\n     * \u003c/p\u003e\n     * \n     * @return The last super class to stop appending fields for.\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.getValue(java.lang.reflect.Field)",
      "begin_line": 584,
      "end_line": 586,
      "comment": "\n     * \u003cp\u003e\n     * Calls \u003ccode\u003ejava.lang.reflect.Field.get(Object)\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param field\n     *            The Field to query.\n     * @return The Object from the given Field.\n     * \n     * @throws IllegalArgumentException\n     *             see {@link java.lang.reflect.Field#get(Object)}\n     * @throws IllegalAccessException\n     *             see {@link java.lang.reflect.Field#get(Object)}\n     * \n     * @see java.lang.reflect.Field#get(Object)\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.isAppendStatics()",
      "begin_line": 596,
      "end_line": 598,
      "comment": "\n     * \u003cp\u003e\n     * Gets whether or not to append static fields.\n     * \u003c/p\u003e\n     * \n     * @return Whether or not to append static fields.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.isAppendTransients()",
      "begin_line": 607,
      "end_line": 609,
      "comment": "\n     * \u003cp\u003e\n     * Gets whether or not to append transient fields.\n     * \u003c/p\u003e\n     * \n     * @return Whether or not to append transient fields.\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.reflectionAppendArray(java.lang.Object)",
      "begin_line": 620,
      "end_line": 623,
      "comment": "\n     * \u003cp\u003e\n     * Append to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 89)",
        "(line 622,col 9)-(line 622,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.setAppendStatics(boolean)",
      "begin_line": 634,
      "end_line": 636,
      "comment": "\n     * \u003cp\u003e\n     * Sets whether or not to append static fields.\n     * \u003c/p\u003e\n     * \n     * @param appendStatics\n     *            Whether or not to append static fields.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.setAppendTransients(boolean)",
      "begin_line": 646,
      "end_line": 648,
      "comment": "\n     * \u003cp\u003e\n     * Sets whether or not to append transient fields.\n     * \u003c/p\u003e\n     * \n     * @param appendTransients\n     *            Whether or not to append transient fields.\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.setExcludeFieldNames(java.lang.String[])",
      "begin_line": 657,
      "end_line": 665,
      "comment": "\n     * Sets the field names to exclude.\n     * \n     * @param excludeFieldNamesParam\n     *            The excludeFieldNames to excluding from toString or \u003ccode\u003enull\u003c/code\u003e.\n     * @return \u003ccode\u003ethis\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 664,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.setUpToClass(java.lang.Class\u003c?\u003e)",
      "begin_line": 675,
      "end_line": 683,
      "comment": "\n     * \u003cp\u003e\n     * Sets the last super class to stop appending fields for.\n     * \u003c/p\u003e\n     * \n     * @param clazz\n     *            The last super class to stop appending fields for.\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 682,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString()",
      "begin_line": 692,
      "end_line": 704,
      "comment": "\n     * \u003cp\u003e\n     * Gets the String built by this builder.\n     * \u003c/p\u003e\n     * \n     * @return the built string\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 697,col 53)",
        "(line 698,col 9)-(line 698,col 35)",
        "(line 699,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 703,col 32)"
      ]
    }
  ]
}