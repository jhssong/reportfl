{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/builder/ReflectionToStringBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReflectionToStringBuilder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringBuilder"
      ],
      "begin_line": 94,
      "end_line": 697,
      "comment": "\n * \u003cp\u003e\n * Assists in implementing {@link Object#toString()} methods using reflection.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * This class uses reflection to determine the fields to append. Because these fields are usually private, the class\n * uses {@link java.lang.reflect.AccessibleObject#setAccessible(java.lang.reflect.AccessibleObject[], boolean)} to\n * change the visibility of the fields. This will fail under a security manager, unless the appropriate permissions are\n * set up correctly.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * A typical invocation for this method would look like:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * public String toString() {\n *   return ReflectionToStringBuilder.toString(this);\n * }\u003c/pre\u003e\n *\n *\n *\n * \u003cp\u003e\n * You can also use the builder to debug 3rd party objects:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * System.out.println(\"An object: \" + ReflectionToStringBuilder.toString(anObject));\u003c/pre\u003e\n *\n *\n *\n * \u003cp\u003e\n * A subclass can control field output by overriding the methods:\n * \u003cul\u003e\n * \u003cli\u003e{@link #accept(java.lang.reflect.Field)}\u003c/li\u003e\n * \u003cli\u003e{@link #getValue(java.lang.reflect.Field)}\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * For example, this method does \u003ci\u003enot\u003c/i\u003e include the \u003ccode\u003epassword\u003c/code\u003e field in the returned\n * \u003ccode\u003eString\u003c/code\u003e:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * public String toString() {\n *     return (new ReflectionToStringBuilder(this) {\n *         protected boolean accept(Field f) {\n *             return super.accept(f) \u0026\u0026 !f.getName().equals(\"password\");\n *         }\n *     }).toString();\n * }\u003c/pre\u003e\n *\n *\n *\n * \u003cp\u003e\n * The exact format of the \u003ccode\u003etoString\u003c/code\u003e is determined by the {@link ToStringStyle} passed into the\n * constructor.\n * \u003c/p\u003e\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(java.lang.Object)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value using the default \u003ccode\u003eToStringStyle\u003c/code\u003e through reflection.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Transient members will be not be included, as they are likely derived. Static fields will not be included.\n     * Superclass fields will be appended.\n     * \u003c/p\u003e\n     *\n     * @param object\n     *            the Object to be output\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle)",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value through reflection.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Transient members will be not be included, as they are likely derived. Static fields will not be included.\n     * Superclass fields will be appended.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\n     * \u003c/p\u003e\n     *\n     * @param object\n     *            the Object to be output\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object or \u003ccode\u003eToStringStyle\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle, boolean)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value through reflection.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, transient members will be output, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the Object.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Static fields will not be included. Superclass fields will be appended.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\n     * \u003c/p\u003e\n     *\n     * @param object\n     *            the Object to be output\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients\n     *            whether to include transient fields\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle, boolean, boolean)",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value through reflection.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, transient fields will be output, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the Object.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputStatics\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, static fields will be output, otherwise they are\n     * ignored.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Static fields will not be included. Superclass fields will be appended.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\n     * \u003c/p\u003e\n     *\n     * @param object\n     *            the Object to be output\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients\n     *            whether to include transient fields\n     * @param outputStatics\n     *            whether to include transient fields\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(T, org.apache.commons.lang3.builder.ToStringStyle, boolean, boolean, java.lang.Class\u003c? super T\u003e)",
      "begin_line": 285,
      "end_line": 290,
      "comment": "\n     * \u003cp\u003e\n     * Builds a \u003ccode\u003etoString\u003c/code\u003e value through reflection.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputTransients\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, transient fields will be output, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the Object.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * If the \u003ccode\u003eoutputStatics\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e, static fields will be output, otherwise they are\n     * ignored.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Superclass fields will be appended up to and including the specified superclass. A null superclass is treated as\n     * \u003ccode\u003ejava.lang.Object\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\n     * \u003c/p\u003e\n     *\n     * @param \u003cT\u003e\n     *            the type of the object\n     * @param object\n     *            the Object to be output\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients\n     *            whether to include transient fields\n     * @param outputStatics\n     *            whether to include static fields\n     * @param reflectUpToClass\n     *            the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the String result\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 289,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(java.lang.Object, java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\n     * Builds a String for a toString method excluding the given field names.\n     *\n     * @param object\n     *            The object to \"toString\".\n     * @param excludeFieldNames\n     *            The field names to exclude. Null excludes nothing.\n     * @return The toString value.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 314,
      "end_line": 319,
      "comment": "\n     * Converts the given Collection into an array of Strings. The returned array does not contain \u003ccode\u003enull\u003c/code\u003e\n     * entries. Note that {@link Arrays#sort(Object[])} will throw an {@link NullPointerException} if an array element\n     * is \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param collection\n     *            The collection to convert\n     * @return A new array of Strings.\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(java.lang.Object[])",
      "begin_line": 330,
      "end_line": 338,
      "comment": "\n     * Returns a new array of Strings without null elements. Internal method used to normalize exclude lists\n     * (arrays and collections). Note that {@link Arrays#sort(Object[])} will throw an {@link NullPointerException}\n     * if an array element is \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param array\n     *            The array to check\n     * @return The given array or a new array without null.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 64)",
        "(line 332,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(java.lang.Object, java.lang.String...)",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\n     * Builds a String for a toString method excluding the given field names.\n     *\n     * @param object\n     *            The object to \"toString\".\n     * @param excludeFieldNames\n     *            The field names to exclude\n     * @return The toString value.\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 104)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "appendStatics"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": "\n     * Whether or not to append static fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "appendTransients"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": "\n     * Whether or not to append transient fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "excludeFieldNames"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": "\n     * Which field names to exclude from output. Intended for fields like \u003ccode\u003e\"password\"\u003c/code\u003e.\n     *\n     * @since 3.0 this is protected instead of private\n     "
    },
    {
      "type": "field",
      "varNames": [
        "upToClass"
      ],
      "begin_line": 374,
      "end_line": 374,
      "comment": "\n     * The last super class to stop appending fields for.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.ReflectionToStringBuilder(java.lang.Object)",
      "begin_line": 390,
      "end_line": 392,
      "comment": "\n     * \u003cp\u003e\n     * Constructor.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * This constructor outputs using the default style set with \u003ccode\u003esetDefaultStyle\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @param object\n     *            the Object to build a \u003ccode\u003etoString\u003c/code\u003e for, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the Object passed in is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.ReflectionToStringBuilder(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle)",
      "begin_line": 410,
      "end_line": 412,
      "comment": "\n     * \u003cp\u003e\n     * Constructor.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default style is used.\n     * \u003c/p\u003e\n     *\n     * @param object\n     *            the Object to build a \u003ccode\u003etoString\u003c/code\u003e for, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the Object passed in is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.ReflectionToStringBuilder(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle, java.lang.StringBuffer)",
      "begin_line": 436,
      "end_line": 438,
      "comment": "\n     * \u003cp\u003e\n     * Constructor.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * If the style is \u003ccode\u003enull\u003c/code\u003e, the default style is used.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * If the buffer is \u003ccode\u003enull\u003c/code\u003e, a new one is created.\n     * \u003c/p\u003e\n     *\n     * @param object\n     *            the Object to build a \u003ccode\u003etoString\u003c/code\u003e for\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param buffer\n     *            the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate, may be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the Object passed in is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.ReflectionToStringBuilder(T, org.apache.commons.lang3.builder.ToStringStyle, java.lang.StringBuffer, java.lang.Class\u003c? super T\u003e, boolean, boolean)",
      "begin_line": 459,
      "end_line": 466,
      "comment": "\n     * Constructor.\n     *\n     * @param \u003cT\u003e\n     *            the type of the object\n     * @param object\n     *            the Object to build a \u003ccode\u003etoString\u003c/code\u003e for\n     * @param style\n     *            the style of the \u003ccode\u003etoString\u003c/code\u003e to create, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param buffer\n     *            the \u003ccode\u003eStringBuffer\u003c/code\u003e to populate, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param reflectUpToClass\n     *            the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param outputTransients\n     *            whether to include transient fields\n     * @param outputStatics\n     *            whether to include static fields\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 37)",
        "(line 463,col 9)-(line 463,col 44)",
        "(line 464,col 9)-(line 464,col 51)",
        "(line 465,col 9)-(line 465,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.accept(java.lang.reflect.Field)",
      "begin_line": 480,
      "end_line": 499,
      "comment": "\n     * Returns whether or not to append the given \u003ccode\u003eField\u003c/code\u003e.\n     * \u003cul\u003e\n     * \u003cli\u003eTransient fields are appended only if {@link #isAppendTransients()} returns \u003ccode\u003etrue\u003c/code\u003e.\n     * \u003cli\u003eStatic fields are appended only if {@link #isAppendStatics()} returns \u003ccode\u003etrue\u003c/code\u003e.\n     * \u003cli\u003eInner class fields are not appened.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param field\n     *            The Field to test.\n     * @return Whether or not to append the given \u003ccode\u003eField\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.appendFieldsIn(java.lang.Class\u003c?\u003e)",
      "begin_line": 514,
      "end_line": 538,
      "comment": "\n     * \u003cp\u003e\n     * Appends the fields and values defined by the given object of the given Class.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * If a cycle is detected as an object is \u0026quot;toString()\u0027ed\u0026quot;, such an object is rendered as if\n     * \u003ccode\u003eObject.toString()\u003c/code\u003e had been called and not implemented by the object.\n     * \u003c/p\u003e\n     *\n     * @param clazz\n     *            The class of object parameter\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 519,col 51)",
        "(line 520,col 9)-(line 520,col 53)",
        "(line 521,col 9)-(line 537,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.getExcludeFieldNames()",
      "begin_line": 543,
      "end_line": 545,
      "comment": "\n     * @return Returns the excludeFieldNames.\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.getUpToClass()",
      "begin_line": 554,
      "end_line": 556,
      "comment": "\n     * \u003cp\u003e\n     * Gets the last super class to stop appending fields for.\n     * \u003c/p\u003e\n     *\n     * @return The last super class to stop appending fields for.\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.getValue(java.lang.reflect.Field)",
      "begin_line": 574,
      "end_line": 576,
      "comment": "\n     * \u003cp\u003e\n     * Calls \u003ccode\u003ejava.lang.reflect.Field.get(Object)\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @param field\n     *            The Field to query.\n     * @return The Object from the given Field.\n     *\n     * @throws IllegalArgumentException\n     *             see {@link java.lang.reflect.Field#get(Object)}\n     * @throws IllegalAccessException\n     *             see {@link java.lang.reflect.Field#get(Object)}\n     *\n     * @see java.lang.reflect.Field#get(Object)\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.isAppendStatics()",
      "begin_line": 586,
      "end_line": 588,
      "comment": "\n     * \u003cp\u003e\n     * Gets whether or not to append static fields.\n     * \u003c/p\u003e\n     *\n     * @return Whether or not to append static fields.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.isAppendTransients()",
      "begin_line": 597,
      "end_line": 599,
      "comment": "\n     * \u003cp\u003e\n     * Gets whether or not to append transient fields.\n     * \u003c/p\u003e\n     *\n     * @return Whether or not to append transient fields.\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.reflectionAppendArray(java.lang.Object)",
      "begin_line": 610,
      "end_line": 613,
      "comment": "\n     * \u003cp\u003e\n     * Append to the \u003ccode\u003etoString\u003c/code\u003e an \u003ccode\u003eObject\u003c/code\u003e array.\n     * \u003c/p\u003e\n     *\n     * @param array\n     *            the array to add to the \u003ccode\u003etoString\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 89)",
        "(line 612,col 9)-(line 612,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.setAppendStatics(boolean)",
      "begin_line": 624,
      "end_line": 626,
      "comment": "\n     * \u003cp\u003e\n     * Sets whether or not to append static fields.\n     * \u003c/p\u003e\n     *\n     * @param appendStatics\n     *            Whether or not to append static fields.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.setAppendTransients(boolean)",
      "begin_line": 636,
      "end_line": 638,
      "comment": "\n     * \u003cp\u003e\n     * Sets whether or not to append transient fields.\n     * \u003c/p\u003e\n     *\n     * @param appendTransients\n     *            Whether or not to append transient fields.\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.setExcludeFieldNames(java.lang.String...)",
      "begin_line": 647,
      "end_line": 656,
      "comment": "\n     * Sets the field names to exclude.\n     *\n     * @param excludeFieldNamesParam\n     *            The excludeFieldNames to excluding from toString or \u003ccode\u003enull\u003c/code\u003e.\n     * @return \u003ccode\u003ethis\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 655,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.setUpToClass(java.lang.Class\u003c?\u003e)",
      "begin_line": 666,
      "end_line": 674,
      "comment": "\n     * \u003cp\u003e\n     * Sets the last super class to stop appending fields for.\n     * \u003c/p\u003e\n     *\n     * @param clazz\n     *            The last super class to stop appending fields for.\n     ",
      "child_ranges": [
        "(line 667,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 673,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString()",
      "begin_line": 683,
      "end_line": 695,
      "comment": "\n     * \u003cp\u003e\n     * Gets the String built by this builder.\n     * \u003c/p\u003e\n     *\n     * @return the built string\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 687,col 9)",
        "(line 688,col 9)-(line 688,col 53)",
        "(line 689,col 9)-(line 689,col 35)",
        "(line 690,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 694,col 32)"
      ]
    }
  ]
}