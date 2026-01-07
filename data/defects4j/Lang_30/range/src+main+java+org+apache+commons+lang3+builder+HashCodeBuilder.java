{
  "filepath": "/tmp/Lang-30b/src/main/java/org/apache/commons/lang3/builder/HashCodeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 96,
      "end_line": 994,
      "comment": "\n * \u003cp\u003e\n * Assists in implementing {@link Object#hashCode()} methods.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * This class enables a good \u003ccode\u003ehashCode\u003c/code\u003e method to be built for any class. It follows the rules laid out in\n * the book \u003ca href\u003d\"http://java.sun.com/docs/books/effective/index.html\"\u003eEffective Java\u003c/a\u003e by Joshua Bloch. Writing a\n * good \u003ccode\u003ehashCode\u003c/code\u003e method is actually quite difficult. This class aims to simplify the process.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * All relevant fields from the object should be included in the \u003ccode\u003ehashCode\u003c/code\u003e method. Derived fields may be\n * excluded. In general, any field used in the \u003ccode\u003eequals\u003c/code\u003e method must be used in the \u003ccode\u003ehashCode\u003c/code\u003e\n * method.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * To use this class write code as follows:\n * \u003c/p\u003e\n * \n * \u003cpre\u003e\n * public class Person {\n *   String name;\n *   int age;\n *   boolean smoker;\n *   ...\n *\n *   public int hashCode() {\n *     // you pick a hard-coded, randomly chosen, non-zero, odd number\n *     // ideally different for each class\n *     return new HashCodeBuilder(17, 37).\n *       append(name).\n *       append(age).\n *       append(smoker).\n *       toHashCode();\n *   }\n * }\n * \u003c/pre\u003e\n * \n * \u003cp\u003e\n * If required, the superclass \u003ccode\u003ehashCode()\u003c/code\u003e can be added using {@link #appendSuper}.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * Alternatively, there is a method that uses reflection to determine the fields to test. Because these fields are\n * usually private, the method, \u003ccode\u003ereflectionHashCode\u003c/code\u003e, uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n * to change the visibility of the fields. This will fail under a security manager, unless the appropriate permissions\n * are set up correctly. It is also slower than testing explicitly.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * A typical invocation for this method would look like:\n * \u003c/p\u003e\n * \n * \u003cpre\u003e\n * public int hashCode() {\n *   return HashCodeBuilder.reflectionHashCode(this);\n * }\n * \u003c/pre\u003e\n * \n * @author Apache Software Foundation\n * @author Gary Gregory\n * @author Pete Gieser\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "REGISTRY"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * \u003cp\u003e\n     * A registry of objects used by reflection methods to detect cyclical object references and avoid infinite loops.\n     * \u003c/p\u003e\n     * \n     * @since 2.3\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.getRegistry()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * \u003cp\u003e\n     * Returns the registry of objects being traversed by the reflection methods in the current thread.\n     * \u003c/p\u003e\n     * \n     * @return Set the registry of objects being traversed\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.isRegistered(java.lang.Object)",
      "begin_line": 146,
      "end_line": 149,
      "comment": "\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given object. Used by the reflection methods to avoid\n     * infinite loops.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            The object to lookup in the registry.\n     * @return boolean \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given object.\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 44)",
        "(line 148,col 9)-(line 148,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(java.lang.Object, java.lang.Class\u003c?\u003e, org.apache.commons.lang3.builder.HashCodeBuilder, boolean, java.lang.String[])",
      "begin_line": 167,
      "end_line": 194,
      "comment": "\n     * \u003cp\u003e\n     * Appends the fields and values defined by the given object of the given \u003ccode\u003eClass\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the object to append details of\n     * @param clazz\n     *            the class to append details of\n     * @param builder\n     *            the builder to append to\n     * @param useTransients\n     *            whether to use transient fields\n     * @param excludeFields\n     *            Collection of String field names to exclude from use in calculation of hash code\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int, int, java.lang.Object)",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the\n     * \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital. Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int, int, java.lang.Object, boolean)",
      "begin_line": 276,
      "end_line": 280,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient members will be tested, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital. Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients\n     *            whether to include transient fields\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 279,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int, int, T, boolean, java.lang.Class\u003c? super T\u003e)",
      "begin_line": 298,
      "end_line": 302,
      "comment": "\n     * Calls {@link #reflectionHashCode(int, int, Object, boolean, Class, String[])} with excludeFields set to\n     * \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients\n     *            whether to include transient fields\n     * @param reflectUpToClass\n     *            the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return int hash code\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 301,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int, int, T, boolean, java.lang.Class\u003c? super T\u003e, java.lang.String[])",
      "begin_line": 349,
      "end_line": 363,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient members will be tested, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be included. Superclass fields will be included up to and including the specified\n     * superclass. A null superclass is treated as java.lang.Object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital. Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients\n     *            whether to include transient fields\n     * @param reflectUpToClass\n     *            the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param excludeFields\n     *            array of field names to exclude from use in calculation of hash code\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 107)",
        "(line 356,col 9)-(line 356,col 43)",
        "(line 357,col 9)-(line 357,col 80)",
        "(line 358,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object)",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor uses two hard coded choices for the constants needed to build a hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the\n     * \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object, boolean)",
      "begin_line": 431,
      "end_line": 433,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor uses two hard coded choices for the constants needed to build a hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cP\u003e\n     * If the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient members will be tested, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients\n     *            whether to include transient fields\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object, java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor uses two hard coded choices for the constants needed to build a hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the\n     * \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param excludeFields\n     *            Collection of String field names to exclude from use in calculation of hash code\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object, java.lang.String[])",
      "begin_line": 505,
      "end_line": 507,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor uses two hard coded choices for the constants needed to build a hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the\n     * \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param excludeFields\n     *            array of field names to exclude from use in calculation of hash code\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.register(java.lang.Object)",
      "begin_line": 517,
      "end_line": 524,
      "comment": "\n     * \u003cp\u003e\n     * Registers the given object. Used by the reflection methods to avoid infinite loops.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            The object to register.\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.unregister(java.lang.Object)",
      "begin_line": 538,
      "end_line": 550,
      "comment": "\n     * \u003cp\u003e\n     * Unregisters the given object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Used by the reflection methods to avoid infinite loops.\n     * \n     * @param value\n     *            The object to unregister.\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 44)",
        "(line 540,col 9)-(line 549,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "iConstant"
      ],
      "begin_line": 555,
      "end_line": 555,
      "comment": "\n     * Constant to use in building the hashCode.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iTotal"
      ],
      "begin_line": 560,
      "end_line": 560,
      "comment": "\n     * Running total of the hashCode.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.HashCodeBuilder()",
      "begin_line": 567,
      "end_line": 570,
      "comment": "\n     * \u003cp\u003e\n     * Uses two hard coded choices for the constants needed to build a \u003ccode\u003ehashCode\u003c/code\u003e.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 23)",
        "(line 569,col 9)-(line 569,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.HashCodeBuilder(int, int)",
      "begin_line": 589,
      "end_line": 604,
      "comment": "\n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 602,col 47)",
        "(line 603,col 9)-(line 603,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(boolean)",
      "begin_line": 620,
      "end_line": 623,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eboolean\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This adds \u003ccode\u003eiConstant * 1\u003c/code\u003e to the \u003ccode\u003ehashCode\u003c/code\u003e and not a \u003ccode\u003e1231\u003c/code\u003e or\n     * \u003ccode\u003e1237\u003c/code\u003e as done in java.lang.Boolean. This is in accordance with the \u003cquote\u003eEffective Java\u003c/quote\u003e\n     * design.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the boolean to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 54)",
        "(line 622,col 9)-(line 622,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(boolean[])",
      "begin_line": 634,
      "end_line": 643,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eboolean\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 641,col 9)",
        "(line 642,col 9)-(line 642,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(byte)",
      "begin_line": 656,
      "end_line": 659,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003ebyte\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the byte to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 44)",
        "(line 658,col 9)-(line 658,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(byte[])",
      "begin_line": 672,
      "end_line": 681,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003ebyte\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 680,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(char)",
      "begin_line": 692,
      "end_line": 695,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003echar\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the char to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 44)",
        "(line 694,col 9)-(line 694,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(char[])",
      "begin_line": 706,
      "end_line": 715,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003echar\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 707,col 9)-(line 713,col 9)",
        "(line 714,col 9)-(line 714,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(double)",
      "begin_line": 726,
      "end_line": 728,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003edouble\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the double to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 727,col 9)-(line 727,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(double[])",
      "begin_line": 739,
      "end_line": 748,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003edouble\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 746,col 9)",
        "(line 747,col 9)-(line 747,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(float)",
      "begin_line": 759,
      "end_line": 762,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003efloat\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the float to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 66)",
        "(line 761,col 9)-(line 761,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(float[])",
      "begin_line": 773,
      "end_line": 782,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003efloat\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 774,col 9)-(line 780,col 9)",
        "(line 781,col 9)-(line 781,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(int)",
      "begin_line": 793,
      "end_line": 796,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eint\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the int to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 44)",
        "(line 795,col 9)-(line 795,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(int[])",
      "begin_line": 807,
      "end_line": 816,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eint\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 814,col 9)",
        "(line 815,col 9)-(line 815,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(long)",
      "begin_line": 831,
      "end_line": 834,
      "comment": "       that will have to wait for the time being. cf LANG-342.",
      "child_ranges": [
        "(line 832,col 9)-(line 832,col 70)",
        "(line 833,col 9)-(line 833,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(long[])",
      "begin_line": 845,
      "end_line": 854,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003elong\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 853,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(java.lang.Object)",
      "begin_line": 865,
      "end_line": 898,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 866,col 9)-(line 896,col 9)",
        "(line 897,col 9)-(line 897,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(java.lang.Object[])",
      "begin_line": 909,
      "end_line": 918,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eObject\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 916,col 9)",
        "(line 917,col 9)-(line 917,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(short)",
      "begin_line": 929,
      "end_line": 932,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eshort\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the short to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 930,col 9)-(line 930,col 44)",
        "(line 931,col 9)-(line 931,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(short[])",
      "begin_line": 943,
      "end_line": 952,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eshort\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 950,col 9)",
        "(line 951,col 9)-(line 951,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.appendSuper(int)",
      "begin_line": 964,
      "end_line": 967,
      "comment": "\n     * \u003cp\u003e\n     * Adds the result of super.hashCode() to this builder.\n     * \u003c/p\u003e\n     * \n     * @param superHashCode\n     *            the result of calling \u003ccode\u003esuper.hashCode()\u003c/code\u003e\n     * @return this HashCodeBuilder, used to chain calls.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 965,col 9)-(line 965,col 52)",
        "(line 966,col 9)-(line 966,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.toHashCode()",
      "begin_line": 976,
      "end_line": 978,
      "comment": "\n     * \u003cp\u003e\n     * Return the computed \u003ccode\u003ehashCode\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @return \u003ccode\u003ehashCode\u003c/code\u003e based on the fields appended\n     ",
      "child_ranges": [
        "(line 977,col 9)-(line 977,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.hashCode()",
      "begin_line": 989,
      "end_line": 992,
      "comment": "\n     * \u003cp\u003e\n     * The computed \u003ccode\u003ehashCode\u003c/code\u003e from toHashCode() is returned due to the likelyhood \n     * of bugs in mis-calling toHashCode() and the unlikelyness of it mattering what the hashCode for \n     * HashCodeBuilder itself is.\n     * \n     * @return \u003ccode\u003ehashCode\u003c/code\u003e based on the fields appended\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 991,col 9)-(line 991,col 28)"
      ]
    }
  ]
}