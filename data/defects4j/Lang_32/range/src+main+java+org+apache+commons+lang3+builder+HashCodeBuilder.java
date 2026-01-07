{
  "filepath": "/tmp/Lang-32b/src/main/java/org/apache/commons/lang3/builder/HashCodeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 96,
      "end_line": 982,
      "comment": "\n * \u003cp\u003e\n * Assists in implementing {@link Object#hashCode()} methods.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * This class enables a good \u003ccode\u003ehashCode\u003c/code\u003e method to be built for any class. It follows the rules laid out in\n * the book \u003ca href\u003d\"http://java.sun.com/docs/books/effective/index.html\"\u003eEffective Java\u003c/a\u003e by Joshua Bloch. Writing a\n * good \u003ccode\u003ehashCode\u003c/code\u003e method is actually quite difficult. This class aims to simplify the process.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * All relevant fields from the object should be included in the \u003ccode\u003ehashCode\u003c/code\u003e method. Derived fields may be\n * excluded. In general, any field used in the \u003ccode\u003eequals\u003c/code\u003e method must be used in the \u003ccode\u003ehashCode\u003c/code\u003e\n * method.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * To use this class write code as follows:\n * \u003c/p\u003e\n * \n * \u003cpre\u003e\n * public class Person {\n *   String name;\n *   int age;\n *   boolean smoker;\n *   ...\n *\n *   public int hashCode() {\n *     // you pick a hard-coded, randomly chosen, non-zero, odd number\n *     // ideally different for each class\n *     return new HashCodeBuilder(17, 37).\n *       append(name).\n *       append(age).\n *       append(smoker).\n *       toHashCode();\n *   }\n * }\n * \u003c/pre\u003e\n * \n * \u003cp\u003e\n * If required, the superclass \u003ccode\u003ehashCode()\u003c/code\u003e can be added using {@link #appendSuper}.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * Alternatively, there is a method that uses reflection to determine the fields to test. Because these fields are\n * usually private, the method, \u003ccode\u003ereflectionHashCode\u003c/code\u003e, uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n * to change the visibility of the fields. This will fail under a security manager, unless the appropriate permissions\n * are set up correctly. It is also slower than testing explicitly.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * A typical invocation for this method would look like:\n * \u003c/p\u003e\n * \n * \u003cpre\u003e\n * public int hashCode() {\n *   return HashCodeBuilder.reflectionHashCode(this);\n * }\n * \u003c/pre\u003e\n * \n * @author Apache Software Foundation\n * @author Gary Gregory\n * @author Pete Gieser\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "REGISTRY"
      ],
      "begin_line": 104,
      "end_line": 109,
      "comment": "\n     * \u003cp\u003e\n     * A registry of objects used by reflection methods to detect cyclical object references and avoid infinite loops.\n     * \u003c/p\u003e\n     * \n     * @since 2.3\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.Anonymous-267cb8b1-4e81-4031-80d9-694aa9404ac4.initialValue()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 13)-(line 107,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.getRegistry()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * \u003cp\u003e\n     * Returns the registry of objects being traversed by the reflection methods in the current thread.\n     * \u003c/p\u003e\n     * \n     * @return Set the registry of objects being traversed\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.isRegistered(java.lang.Object)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given object. Used by the reflection methods to avoid\n     * infinite loops.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            The object to lookup in the registry.\n     * @return boolean \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given object.\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionAppend(java.lang.Object, java.lang.Class\u003c?\u003e, org.apache.commons.lang3.builder.HashCodeBuilder, boolean, java.lang.String[])",
      "begin_line": 171,
      "end_line": 198,
      "comment": "\n     * \u003cp\u003e\n     * Appends the fields and values defined by the given object of the given \u003ccode\u003eClass\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the object to append details of\n     * @param clazz\n     *            the class to append details of\n     * @param builder\n     *            the builder to append to\n     * @param useTransients\n     *            whether to use transient fields\n     * @param excludeFields\n     *            Collection of String field names to exclude from use in calculation of hash code\n     ",
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
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the\n     * \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital. Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int, int, java.lang.Object, boolean)",
      "begin_line": 280,
      "end_line": 284,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient members will be tested, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital. Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients\n     *            whether to include transient fields\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 283,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int, int, T, boolean, java.lang.Class\u003c? super T\u003e)",
      "begin_line": 302,
      "end_line": 306,
      "comment": "\n     * Calls {@link #reflectionHashCode(int, int, Object, boolean, Class, String[])} with excludeFields set to\n     * \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients\n     *            whether to include transient fields\n     * @param reflectUpToClass\n     *            the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return int hash code\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 305,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(int, int, T, boolean, java.lang.Class\u003c? super T\u003e, java.lang.String[])",
      "begin_line": 353,
      "end_line": 367,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient members will be tested, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be included. Superclass fields will be included up to and including the specified\n     * superclass. A null superclass is treated as java.lang.Object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital. Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients\n     *            whether to include transient fields\n     * @param reflectUpToClass\n     *            the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param excludeFields\n     *            array of field names to exclude from use in calculation of hash code\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 107)",
        "(line 360,col 9)-(line 360,col 43)",
        "(line 361,col 9)-(line 361,col 80)",
        "(line 362,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object)",
      "begin_line": 399,
      "end_line": 401,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor uses two hard coded choices for the constants needed to build a hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the\n     * \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object, boolean)",
      "begin_line": 435,
      "end_line": 437,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor uses two hard coded choices for the constants needed to build a hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cP\u003e\n     * If the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient members will be tested, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients\n     *            whether to include transient fields\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object, java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 471,
      "end_line": 473,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor uses two hard coded choices for the constants needed to build a hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the\n     * \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param excludeFields\n     *            Collection of String field names to exclude from use in calculation of hash code\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object, java.lang.String[])",
      "begin_line": 509,
      "end_line": 511,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor uses two hard coded choices for the constants needed to build a hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the\n     * \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param excludeFields\n     *            array of field names to exclude from use in calculation of hash code\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.register(java.lang.Object)",
      "begin_line": 521,
      "end_line": 523,
      "comment": "\n     * \u003cp\u003e\n     * Registers the given object. Used by the reflection methods to avoid infinite loops.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            The object to register.\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.unregister(java.lang.Object)",
      "begin_line": 537,
      "end_line": 539,
      "comment": "\n     * \u003cp\u003e\n     * Unregisters the given object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Used by the reflection methods to avoid infinite loops.\n     * \n     * @param value\n     *            The object to unregister.\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 47)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "iConstant"
      ],
      "begin_line": 544,
      "end_line": 544,
      "comment": "\n     * Constant to use in building the hashCode.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iTotal"
      ],
      "begin_line": 549,
      "end_line": 549,
      "comment": "\n     * Running total of the hashCode.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.HashCodeBuilder()",
      "begin_line": 556,
      "end_line": 559,
      "comment": "\n     * \u003cp\u003e\n     * Uses two hard coded choices for the constants needed to build a \u003ccode\u003ehashCode\u003c/code\u003e.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 23)",
        "(line 558,col 9)-(line 558,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.HashCodeBuilder(int, int)",
      "begin_line": 578,
      "end_line": 593,
      "comment": "\n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 584,col 9)",
        "(line 585,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 591,col 47)",
        "(line 592,col 9)-(line 592,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(boolean)",
      "begin_line": 609,
      "end_line": 612,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eboolean\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This adds \u003ccode\u003eiConstant * 1\u003c/code\u003e to the \u003ccode\u003ehashCode\u003c/code\u003e and not a \u003ccode\u003e1231\u003c/code\u003e or\n     * \u003ccode\u003e1237\u003c/code\u003e as done in java.lang.Boolean. This is in accordance with the \u003cquote\u003eEffective Java\u003c/quote\u003e\n     * design.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the boolean to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 54)",
        "(line 611,col 9)-(line 611,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(boolean[])",
      "begin_line": 623,
      "end_line": 632,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eboolean\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 631,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(byte)",
      "begin_line": 645,
      "end_line": 648,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003ebyte\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the byte to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 44)",
        "(line 647,col 9)-(line 647,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(byte[])",
      "begin_line": 661,
      "end_line": 670,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003ebyte\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 669,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(char)",
      "begin_line": 681,
      "end_line": 684,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003echar\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the char to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 44)",
        "(line 683,col 9)-(line 683,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(char[])",
      "begin_line": 695,
      "end_line": 704,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003echar\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 703,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(double)",
      "begin_line": 715,
      "end_line": 717,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003edouble\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the double to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(double[])",
      "begin_line": 728,
      "end_line": 737,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003edouble\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 735,col 9)",
        "(line 736,col 9)-(line 736,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(float)",
      "begin_line": 748,
      "end_line": 751,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003efloat\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the float to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 66)",
        "(line 750,col 9)-(line 750,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(float[])",
      "begin_line": 762,
      "end_line": 771,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003efloat\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 769,col 9)",
        "(line 770,col 9)-(line 770,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(int)",
      "begin_line": 782,
      "end_line": 785,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eint\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the int to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 44)",
        "(line 784,col 9)-(line 784,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(int[])",
      "begin_line": 796,
      "end_line": 805,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eint\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 797,col 9)-(line 803,col 9)",
        "(line 804,col 9)-(line 804,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(long)",
      "begin_line": 820,
      "end_line": 823,
      "comment": "       that will have to wait for the time being. cf LANG-342.",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 70)",
        "(line 822,col 9)-(line 822,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(long[])",
      "begin_line": 834,
      "end_line": 843,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003elong\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 835,col 9)-(line 841,col 9)",
        "(line 842,col 9)-(line 842,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(java.lang.Object)",
      "begin_line": 854,
      "end_line": 887,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 885,col 9)",
        "(line 886,col 9)-(line 886,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(java.lang.Object[])",
      "begin_line": 898,
      "end_line": 907,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eObject\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 899,col 9)-(line 905,col 9)",
        "(line 906,col 9)-(line 906,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(short)",
      "begin_line": 918,
      "end_line": 921,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eshort\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the short to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 919,col 9)-(line 919,col 44)",
        "(line 920,col 9)-(line 920,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.append(short[])",
      "begin_line": 932,
      "end_line": 941,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eshort\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 939,col 9)",
        "(line 940,col 9)-(line 940,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.appendSuper(int)",
      "begin_line": 953,
      "end_line": 956,
      "comment": "\n     * \u003cp\u003e\n     * Adds the result of super.hashCode() to this builder.\n     * \u003c/p\u003e\n     * \n     * @param superHashCode\n     *            the result of calling \u003ccode\u003esuper.hashCode()\u003c/code\u003e\n     * @return this HashCodeBuilder, used to chain calls.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 954,col 9)-(line 954,col 52)",
        "(line 955,col 9)-(line 955,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.toHashCode()",
      "begin_line": 965,
      "end_line": 967,
      "comment": "\n     * \u003cp\u003e\n     * Return the computed \u003ccode\u003ehashCode\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @return \u003ccode\u003ehashCode\u003c/code\u003e based on the fields appended\n     ",
      "child_ranges": [
        "(line 966,col 9)-(line 966,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.HashCodeBuilder.hashCode()",
      "begin_line": 977,
      "end_line": 980,
      "comment": "\n     * \u003cp\u003e\n     * The computed \u003ccode\u003ehashCode\u003c/code\u003e from toHashCode() is returned due to the likelyhood \n     * of bugs in mis-calling toHashCode() and the unlikelyness of it mattering what the hashCode for \n     * HashCodeBuilder itself is.\n     * \n     * @return \u003ccode\u003ehashCode\u003c/code\u003e based on the fields appended\n     ",
      "child_ranges": [
        "(line 979,col 9)-(line 979,col 28)"
      ]
    }
  ]
}