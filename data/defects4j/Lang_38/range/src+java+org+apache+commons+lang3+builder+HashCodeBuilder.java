{
  "filepath": "/tmp/Lang-38b/src/java/org/apache/commons/lang3/builder/HashCodeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 97,
      "end_line": 985,
      "comment": "\n * \u003cp\u003e\n * Assists in implementing {@link Object#hashCode()} methods.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * This class enables a good \u003ccode\u003ehashCode\u003c/code\u003e method to be built for any class. It follows the rules laid out in\n * the book \u003ca href\u003d\"http://java.sun.com/docs/books/effective/index.html\"\u003eEffective Java\u003c/a\u003e by Joshua Bloch. Writing a\n * good \u003ccode\u003ehashCode\u003c/code\u003e method is actually quite difficult. This class aims to simplify the process.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * All relevant fields from the object should be included in the \u003ccode\u003ehashCode\u003c/code\u003e method. Derived fields may be\n * excluded. In general, any field used in the \u003ccode\u003eequals\u003c/code\u003e method must be used in the \u003ccode\u003ehashCode\u003c/code\u003e\n * method.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * To use this class write code as follows:\n * \u003c/p\u003e\n * \n * \u003cpre\u003e\n * public class Person {\n *   String name;\n *   int age;\n *   boolean smoker;\n *   ...\n *\n *   public int hashCode() {\n *     // you pick a hard-coded, randomly chosen, non-zero, odd number\n *     // ideally different for each class\n *     return new HashCodeBuilder(17, 37).\n *       append(name).\n *       append(age).\n *       append(smoker).\n *       toHashCode();\n *   }\n * }\n * \u003c/pre\u003e\n * \n * \u003cp\u003e\n * If required, the superclass \u003ccode\u003ehashCode()\u003c/code\u003e can be added using {@link #appendSuper}.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * Alternatively, there is a method that uses reflection to determine the fields to test. Because these fields are\n * usually private, the method, \u003ccode\u003ereflectionHashCode\u003c/code\u003e, uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n * to change the visibility of the fields. This will fail under a security manager, unless the appropriate permissions\n * are set up correctly. It is also slower than testing explicitly.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * A typical invocation for this method would look like:\n * \u003c/p\u003e\n * \n * \u003cpre\u003e\n * public int hashCode() {\n *   return HashCodeBuilder.reflectionHashCode(this);\n * }\n * \u003c/pre\u003e\n * \n * @author Apache Software Foundation\n * @author Gary Gregory\n * @author Pete Gieser\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 105,
      "end_line": 112,
      "comment": "\n     * \u003cp\u003e\n     * A registry of objects used by reflection methods to detect cyclical object references and avoid infinite loops.\n     * \u003c/p\u003e\n     * \n     * @since 2.3\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.Anonymous-b3e86fd9-2652-465d-b401-42a05fd9a2ad.initialValue()",
      "begin_line": 106,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 13)-(line 110,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.getRegistry()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * \u003cp\u003e\n     * Returns the registry of objects being traversed by the reflection methods in the current thread.\n     * \u003c/p\u003e\n     * \n     * @return Set the registry of objects being traversed\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.isRegistered(java.lang.Object)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given object. Used by the reflection methods to avoid\n     * infinite loops.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            The object to lookup in the registry.\n     * @return boolean \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given object.\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(java.lang.Object, java.lang.Class\u003c?\u003e, org.apache.commons.lang3.builder.HashCodeBuilder, boolean, java.lang.String[])",
      "begin_line": 174,
      "end_line": 202,
      "comment": "\n     * \u003cp\u003e\n     * Appends the fields and values defined by the given object of the given \u003ccode\u003eClass\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the object to append details of\n     * @param clazz\n     *            the class to append details of\n     * @param builder\n     *            the builder to append to\n     * @param useTransients\n     *            whether to use transient fields\n     * @param excludeFields\n     *            Collection of String field names to exclude from use in calculation of hash code\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 201,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int, int, java.lang.Object)",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the\n     * \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital. Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int, int, java.lang.Object, boolean)",
      "begin_line": 284,
      "end_line": 288,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient members will be tested, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital. Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients\n     *            whether to include transient fields\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 287,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int, int, T, boolean, java.lang.Class\u003c? super T\u003e)",
      "begin_line": 306,
      "end_line": 310,
      "comment": "\n     * Calls {@link #reflectionHashCode(int, int, Object, boolean, Class, String[])} with excludeFields set to\n     * \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients\n     *            whether to include transient fields\n     * @param reflectUpToClass\n     *            the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return int hash code\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 309,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int, int, T, boolean, java.lang.Class\u003c? super T\u003e, java.lang.String[])",
      "begin_line": 357,
      "end_line": 371,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient members will be tested, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be included. Superclass fields will be included up to and including the specified\n     * superclass. A null superclass is treated as java.lang.Object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital. Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients\n     *            whether to include transient fields\n     * @param reflectUpToClass\n     *            the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param excludeFields\n     *            array of field names to exclude from use in calculation of hash code\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 107)",
        "(line 364,col 9)-(line 364,col 43)",
        "(line 365,col 9)-(line 365,col 80)",
        "(line 366,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object)",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor uses two hard coded choices for the constants needed to build a hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the\n     * \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object, boolean)",
      "begin_line": 439,
      "end_line": 441,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor uses two hard coded choices for the constants needed to build a hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cP\u003e\n     * If the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient members will be tested, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients\n     *            whether to include transient fields\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object, java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor uses two hard coded choices for the constants needed to build a hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the\n     * \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param excludeFields\n     *            Collection of String field names to exclude from use in calculation of hash code\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object, java.lang.String[])",
      "begin_line": 513,
      "end_line": 515,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor uses two hard coded choices for the constants needed to build a hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the\n     * \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param excludeFields\n     *            array of field names to exclude from use in calculation of hash code\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.register(java.lang.Object)",
      "begin_line": 525,
      "end_line": 527,
      "comment": "\n     * \u003cp\u003e\n     * Registers the given object. Used by the reflection methods to avoid infinite loops.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            The object to register.\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.unregister(java.lang.Object)",
      "begin_line": 541,
      "end_line": 543,
      "comment": "\n     * \u003cp\u003e\n     * Unregisters the given object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Used by the reflection methods to avoid infinite loops.\n     * \n     * @param value\n     *            The object to unregister.\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 47)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "iConstant"
      ],
      "begin_line": 548,
      "end_line": 548,
      "comment": "\n     * Constant to use in building the hashCode.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iTotal"
      ],
      "begin_line": 553,
      "end_line": 553,
      "comment": "\n     * Running total of the hashCode.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.HashCodeBuilder()",
      "begin_line": 560,
      "end_line": 563,
      "comment": "\n     * \u003cp\u003e\n     * Uses two hard coded choices for the constants needed to build a \u003ccode\u003ehashCode\u003c/code\u003e.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 23)",
        "(line 562,col 9)-(line 562,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.HashCodeBuilder(int, int)",
      "begin_line": 582,
      "end_line": 597,
      "comment": "\n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 591,col 9)",
        "(line 592,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 595,col 47)",
        "(line 596,col 9)-(line 596,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(boolean)",
      "begin_line": 613,
      "end_line": 616,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eboolean\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This adds \u003ccode\u003eiConstant * 1\u003c/code\u003e to the \u003ccode\u003ehashCode\u003c/code\u003e and not a \u003ccode\u003e1231\u003c/code\u003e or\n     * \u003ccode\u003e1237\u003c/code\u003e as done in java.lang.Boolean. This is in accordance with the \u003cquote\u003eEffective Java\u003c/quote\u003e\n     * design.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the boolean to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 54)",
        "(line 615,col 9)-(line 615,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(boolean[])",
      "begin_line": 627,
      "end_line": 636,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eboolean\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 634,col 9)",
        "(line 635,col 9)-(line 635,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(byte)",
      "begin_line": 649,
      "end_line": 652,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003ebyte\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the byte to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 650,col 44)",
        "(line 651,col 9)-(line 651,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(byte[])",
      "begin_line": 665,
      "end_line": 674,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003ebyte\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 666,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 673,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(char)",
      "begin_line": 685,
      "end_line": 688,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003echar\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the char to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 44)",
        "(line 687,col 9)-(line 687,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(char[])",
      "begin_line": 699,
      "end_line": 708,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003echar\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 706,col 9)",
        "(line 707,col 9)-(line 707,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(double)",
      "begin_line": 719,
      "end_line": 721,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003edouble\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the double to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(double[])",
      "begin_line": 732,
      "end_line": 741,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003edouble\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 740,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(float)",
      "begin_line": 752,
      "end_line": 755,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003efloat\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the float to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 753,col 9)-(line 753,col 66)",
        "(line 754,col 9)-(line 754,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(float[])",
      "begin_line": 766,
      "end_line": 775,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003efloat\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 774,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(int)",
      "begin_line": 786,
      "end_line": 789,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eint\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the int to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 787,col 44)",
        "(line 788,col 9)-(line 788,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(int[])",
      "begin_line": 800,
      "end_line": 809,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eint\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 807,col 9)",
        "(line 808,col 9)-(line 808,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(long)",
      "begin_line": 825,
      "end_line": 828,
      "comment": "       that will have to wait for the time being. cf LANG-342.",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 70)",
        "(line 827,col 9)-(line 827,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(long[])",
      "begin_line": 839,
      "end_line": 848,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003elong\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 840,col 9)-(line 846,col 9)",
        "(line 847,col 9)-(line 847,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(java.lang.Object)",
      "begin_line": 859,
      "end_line": 890,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 888,col 9)",
        "(line 889,col 9)-(line 889,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(java.lang.Object[])",
      "begin_line": 901,
      "end_line": 910,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eObject\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 902,col 9)-(line 908,col 9)",
        "(line 909,col 9)-(line 909,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(short)",
      "begin_line": 921,
      "end_line": 924,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eshort\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the short to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 922,col 9)-(line 922,col 44)",
        "(line 923,col 9)-(line 923,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(short[])",
      "begin_line": 935,
      "end_line": 944,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eshort\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 936,col 9)-(line 942,col 9)",
        "(line 943,col 9)-(line 943,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.appendSuper(int)",
      "begin_line": 956,
      "end_line": 959,
      "comment": "\n     * \u003cp\u003e\n     * Adds the result of super.hashCode() to this builder.\n     * \u003c/p\u003e\n     * \n     * @param superHashCode\n     *            the result of calling \u003ccode\u003esuper.hashCode()\u003c/code\u003e\n     * @return this HashCodeBuilder, used to chain calls.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 957,col 9)-(line 957,col 52)",
        "(line 958,col 9)-(line 958,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.toHashCode()",
      "begin_line": 968,
      "end_line": 970,
      "comment": "\n     * \u003cp\u003e\n     * Return the computed \u003ccode\u003ehashCode\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @return \u003ccode\u003ehashCode\u003c/code\u003e based on the fields appended\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 969,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.hashCode()",
      "begin_line": 980,
      "end_line": 983,
      "comment": "\n     * \u003cp\u003e\n     * The computed \u003ccode\u003ehashCode\u003c/code\u003e from toHashCode() is returned due to the likelyhood \n     * of bugs in mis-calling toHashCode() and the unlikelyness of it mattering what the hashCode for \n     * HashCodeBuilder itself is.\n     * \n     * @return \u003ccode\u003ehashCode\u003c/code\u003e based on the fields appended\n     ",
      "child_ranges": [
        "(line 982,col 9)-(line 982,col 28)"
      ]
    }
  ]
}