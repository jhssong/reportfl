{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/builder/HashCodeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeBuilder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.Builder\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 100,
      "end_line": 961,
      "comment": "\n * \u003cp\u003e\n * Assists in implementing {@link Object#hashCode()} methods.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * This class enables a good \u003ccode\u003ehashCode\u003c/code\u003e method to be built for any class. It follows the rules laid out in\n * the book \u003ca href\u003d\"http://java.sun.com/docs/books/effective/index.html\"\u003eEffective Java\u003c/a\u003e by Joshua Bloch. Writing a\n * good \u003ccode\u003ehashCode\u003c/code\u003e method is actually quite difficult. This class aims to simplify the process.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * The following is the approach taken. When appending a data field, the current total is multiplied by the\n * multiplier then a relevant value\n * for that data type is added. For example, if the current hashCode is 17, and the multiplier is 37, then\n * appending the integer 45 will create a hashcode of 674, namely 17 * 37 + 45.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * All relevant fields from the object should be included in the \u003ccode\u003ehashCode\u003c/code\u003e method. Derived fields may be\n * excluded. In general, any field used in the \u003ccode\u003eequals\u003c/code\u003e method must be used in the \u003ccode\u003ehashCode\u003c/code\u003e\n * method.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * To use this class write code as follows:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * public class Person {\n *   String name;\n *   int age;\n *   boolean smoker;\n *   ...\n *\n *   public int hashCode() {\n *     // you pick a hard-coded, randomly chosen, non-zero, odd number\n *     // ideally different for each class\n *     return new HashCodeBuilder(17, 37).\n *       append(name).\n *       append(age).\n *       append(smoker).\n *       toHashCode();\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\n * If required, the superclass \u003ccode\u003ehashCode()\u003c/code\u003e can be added using {@link #appendSuper}.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * Alternatively, there is a method that uses reflection to determine the fields to test. Because these fields are\n * usually private, the method, \u003ccode\u003ereflectionHashCode\u003c/code\u003e, uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n * to change the visibility of the fields. This will fail under a security manager, unless the appropriate permissions\n * are set up correctly. It is also slower than testing explicitly.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * A typical invocation for this method would look like:\n * \u003c/p\u003e\n *\n * \u003cpre\u003e\n * public int hashCode() {\n *   return HashCodeBuilder.reflectionHashCode(this);\n * }\n * \u003c/pre\u003e\n *\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "REGISTRY"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * \u003cp\u003e\n     * A registry of objects used by reflection methods to detect cyclical object references and avoid infinite loops.\n     * \u003c/p\u003e\n     *\n     * @since 2.3\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.getRegistry()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * \u003cp\u003e\n     * Returns the registry of objects being traversed by the reflection methods in the current thread.\n     * \u003c/p\u003e\n     *\n     * @return Set the registry of objects being traversed\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.isRegistered(java.lang.Object)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given object. Used by the reflection methods to avoid\n     * infinite loops.\n     * \u003c/p\u003e\n     *\n     * @param value\n     *            The object to lookup in the registry.\n     * @return boolean \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given object.\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 44)",
        "(line 152,col 9)-(line 152,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(java.lang.Object, java.lang.Class\u003c?\u003e, org.apache.commons.lang3.builder.HashCodeBuilder, boolean, java.lang.String[])",
      "begin_line": 171,
      "end_line": 198,
      "comment": "\n     * \u003cp\u003e\n     * Appends the fields and values defined by the given object of the given \u003ccode\u003eClass\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @param object\n     *            the object to append details of\n     * @param clazz\n     *            the class to append details of\n     * @param builder\n     *            the builder to append to\n     * @param useTransients\n     *            whether to use transient fields\n     * @param excludeFields\n     *            Collection of String field names to exclude from use in calculation of hash code\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 197,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int, int, java.lang.Object)",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the\n     * \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital. Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     *\n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int, int, java.lang.Object, boolean)",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * If the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient members will be tested, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital. Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     *\n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients\n     *            whether to include transient fields\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 117)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int, int, T, boolean, java.lang.Class\u003c? super T\u003e, java.lang.String...)",
      "begin_line": 332,
      "end_line": 346,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * If the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient members will be tested, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Static fields will not be included. Superclass fields will be included up to and including the specified\n     * superclass. A null superclass is treated as java.lang.Object.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital. Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     *\n     * @param \u003cT\u003e\n     *            the type of the object involved\n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients\n     *            whether to include transient fields\n     * @param reflectUpToClass\n     *            the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param excludeFields\n     *            array of field names to exclude from use in calculation of hash code\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 107)",
        "(line 339,col 9)-(line 339,col 43)",
        "(line 340,col 9)-(line 340,col 80)",
        "(line 341,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object, boolean)",
      "begin_line": 380,
      "end_line": 382,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * This constructor uses two hard coded choices for the constants needed to build a hash code.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     *\n     * \u003cP\u003e\n     * If the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient members will be tested, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     *\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients\n     *            whether to include transient fields\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object, java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 416,
      "end_line": 418,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * This constructor uses two hard coded choices for the constants needed to build a hash code.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the\n     * \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     *\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param excludeFields\n     *            Collection of String field names to exclude from use in calculation of hash code\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object, java.lang.String...)",
      "begin_line": 454,
      "end_line": 456,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * This constructor uses two hard coded choices for the constants needed to build a hash code.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the\n     * \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     *\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param excludeFields\n     *            array of field names to exclude from use in calculation of hash code\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.register(java.lang.Object)",
      "begin_line": 466,
      "end_line": 473,
      "comment": "\n     * \u003cp\u003e\n     * Registers the given object. Used by the reflection methods to avoid infinite loops.\n     * \u003c/p\u003e\n     *\n     * @param value\n     *            The object to register.\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.unregister(java.lang.Object)",
      "begin_line": 487,
      "end_line": 499,
      "comment": "\n     * \u003cp\u003e\n     * Unregisters the given object.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Used by the reflection methods to avoid infinite loops.\n     *\n     * @param value\n     *            The object to unregister.\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 44)",
        "(line 489,col 9)-(line 498,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "iConstant"
      ],
      "begin_line": 504,
      "end_line": 504,
      "comment": "\n     * Constant to use in building the hashCode.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iTotal"
      ],
      "begin_line": 509,
      "end_line": 509,
      "comment": "\n     * Running total of the hashCode.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.HashCodeBuilder()",
      "begin_line": 516,
      "end_line": 519,
      "comment": "\n     * \u003cp\u003e\n     * Uses two hard coded choices for the constants needed to build a \u003ccode\u003ehashCode\u003c/code\u003e.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 23)",
        "(line 518,col 9)-(line 518,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.HashCodeBuilder(int, int)",
      "begin_line": 538,
      "end_line": 553,
      "comment": "\n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     *\n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 47)",
        "(line 552,col 9)-(line 552,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(boolean)",
      "begin_line": 576,
      "end_line": 579,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eboolean\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This adds \u003ccode\u003e1\u003c/code\u003e when true, and \u003ccode\u003e0\u003c/code\u003e when false to the \u003ccode\u003ehashCode\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This is in contrast to the standard \u003ccode\u003ejava.lang.Boolean.hashCode\u003c/code\u003e handling, which computes\n     * a \u003ccode\u003ehashCode\u003c/code\u003e value of \u003ccode\u003e1231\u003c/code\u003e for \u003ccode\u003ejava.lang.Boolean\u003c/code\u003e instances\n     * that represent \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003e1237\u003c/code\u003e for \u003ccode\u003ejava.lang.Boolean\u003c/code\u003e instances\n     * that represent \u003ccode\u003efalse\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This is in accordance with the \u003cquote\u003eEffective Java\u003c/quote\u003e design.\n     * \u003c/p\u003e\n     *\n     * @param value\n     *            the boolean to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 54)",
        "(line 578,col 9)-(line 578,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(boolean[])",
      "begin_line": 590,
      "end_line": 599,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eboolean\u003c/code\u003e array.\n     * \u003c/p\u003e\n     *\n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 597,col 9)",
        "(line 598,col 9)-(line 598,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(byte)",
      "begin_line": 612,
      "end_line": 615,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003ebyte\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @param value\n     *            the byte to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 44)",
        "(line 614,col 9)-(line 614,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(byte[])",
      "begin_line": 628,
      "end_line": 637,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003ebyte\u003c/code\u003e array.\n     * \u003c/p\u003e\n     *\n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 636,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(char)",
      "begin_line": 648,
      "end_line": 651,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003echar\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @param value\n     *            the char to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 44)",
        "(line 650,col 9)-(line 650,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(char[])",
      "begin_line": 662,
      "end_line": 671,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003echar\u003c/code\u003e array.\n     * \u003c/p\u003e\n     *\n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(double)",
      "begin_line": 682,
      "end_line": 684,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003edouble\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @param value\n     *            the double to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(double[])",
      "begin_line": 695,
      "end_line": 704,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003edouble\u003c/code\u003e array.\n     * \u003c/p\u003e\n     *\n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 703,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(float)",
      "begin_line": 715,
      "end_line": 718,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003efloat\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @param value\n     *            the float to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 66)",
        "(line 717,col 9)-(line 717,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(float[])",
      "begin_line": 729,
      "end_line": 738,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003efloat\u003c/code\u003e array.\n     * \u003c/p\u003e\n     *\n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 736,col 9)",
        "(line 737,col 9)-(line 737,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(int)",
      "begin_line": 749,
      "end_line": 752,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eint\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @param value\n     *            the int to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 44)",
        "(line 751,col 9)-(line 751,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(int[])",
      "begin_line": 763,
      "end_line": 772,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eint\u003c/code\u003e array.\n     * \u003c/p\u003e\n     *\n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 770,col 9)",
        "(line 771,col 9)-(line 771,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(long)",
      "begin_line": 787,
      "end_line": 790,
      "comment": "       that will have to wait for the time being. cf LANG-342.",
      "child_ranges": [
        "(line 788,col 9)-(line 788,col 70)",
        "(line 789,col 9)-(line 789,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(long[])",
      "begin_line": 801,
      "end_line": 810,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003elong\u003c/code\u003e array.\n     * \u003c/p\u003e\n     *\n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 802,col 9)-(line 808,col 9)",
        "(line 809,col 9)-(line 809,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(java.lang.Object)",
      "begin_line": 821,
      "end_line": 854,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @param object\n     *            the Object to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 822,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 853,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(java.lang.Object[])",
      "begin_line": 865,
      "end_line": 874,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eObject\u003c/code\u003e array.\n     * \u003c/p\u003e\n     *\n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 866,col 9)-(line 872,col 9)",
        "(line 873,col 9)-(line 873,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(short)",
      "begin_line": 885,
      "end_line": 888,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eshort\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @param value\n     *            the short to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 886,col 9)-(line 886,col 44)",
        "(line 887,col 9)-(line 887,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(short[])",
      "begin_line": 899,
      "end_line": 908,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eshort\u003c/code\u003e array.\n     * \u003c/p\u003e\n     *\n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 900,col 9)-(line 906,col 9)",
        "(line 907,col 9)-(line 907,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.appendSuper(int)",
      "begin_line": 920,
      "end_line": 923,
      "comment": "\n     * \u003cp\u003e\n     * Adds the result of super.hashCode() to this builder.\n     * \u003c/p\u003e\n     *\n     * @param superHashCode\n     *            the result of calling \u003ccode\u003esuper.hashCode()\u003c/code\u003e\n     * @return this HashCodeBuilder, used to chain calls.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 52)",
        "(line 922,col 9)-(line 922,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.toHashCode()",
      "begin_line": 932,
      "end_line": 934,
      "comment": "\n     * \u003cp\u003e\n     * Return the computed \u003ccode\u003ehashCode\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @return \u003ccode\u003ehashCode\u003c/code\u003e based on the fields appended\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.build()",
      "begin_line": 943,
      "end_line": 945,
      "comment": "\n     * Returns the computed \u003ccode\u003ehashCode\u003c/code\u003e.\n     *\n     * @return \u003ccode\u003ehashCode\u003c/code\u003e based on the fields appended\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.hashCode()",
      "begin_line": 956,
      "end_line": 959,
      "comment": "\n     * \u003cp\u003e\n     * The computed \u003ccode\u003ehashCode\u003c/code\u003e from toHashCode() is returned due to the likelihood\n     * of bugs in mis-calling toHashCode() and the unlikeliness of it mattering what the hashCode for\n     * HashCodeBuilder itself is.\u003c/p\u003e\n     *\n     * @return \u003ccode\u003ehashCode\u003c/code\u003e based on the fields appended\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 958,col 9)-(line 958,col 28)"
      ]
    }
  ]
}