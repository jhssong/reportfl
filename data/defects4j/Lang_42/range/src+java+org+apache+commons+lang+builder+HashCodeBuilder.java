{
  "filepath": "/tmp/Lang-42b/src/java/org/apache/commons/lang/builder/HashCodeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 99,
      "end_line": 974,
      "comment": "\n * \u003cp\u003e\n * Assists in implementing {@link Object#hashCode()} methods.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * This class enables a good \u003ccode\u003ehashCode\u003c/code\u003e method to be built for any class. It follows the rules laid out in\n * the book \u003ca href\u003d\"http://java.sun.com/docs/books/effective/index.html\"\u003eEffective Java\u003c/a\u003e by Joshua Bloch. Writing a\n * good \u003ccode\u003ehashCode\u003c/code\u003e method is actually quite difficult. This class aims to simplify the process.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * All relevant fields from the object should be included in the \u003ccode\u003ehashCode\u003c/code\u003e method. Derived fields may be\n * excluded. In general, any field used in the \u003ccode\u003eequals\u003c/code\u003e method must be used in the \u003ccode\u003ehashCode\u003c/code\u003e\n * method.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * To use this class write code as follows:\n * \u003c/p\u003e\n * \n * \u003cpre\u003e\n * public class Person {\n *   String name;\n *   int age;\n *   boolean smoker;\n *   ...\n *\n *   public int hashCode() {\n *     // you pick a hard-coded, randomly chosen, non-zero, odd number\n *     // ideally different for each class\n *     return new HashCodeBuilder(17, 37).\n *       append(name).\n *       append(age).\n *       append(smoker).\n *       toHashCode();\n *   }\n * }\n * \u003c/pre\u003e\n * \n * \u003cp\u003e\n * If required, the superclass \u003ccode\u003ehashCode()\u003c/code\u003e can be added using {@link #appendSuper}.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * Alternatively, there is a method that uses reflection to determine the fields to test. Because these fields are\n * usually private, the method, \u003ccode\u003ereflectionHashCode\u003c/code\u003e, uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e\n * to change the visibility of the fields. This will fail under a security manager, unless the appropriate permissions\n * are set up correctly. It is also slower than testing explicitly.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * A typical invocation for this method would look like:\n * \u003c/p\u003e\n * \n * \u003cpre\u003e\n * public int hashCode() {\n *   return HashCodeBuilder.reflectionHashCode(this);\n * }\n * \u003c/pre\u003e\n * \n * @author Stephen Colebourne\n * @author Gary Gregory\n * @author Pete Gieser\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 107,
      "end_line": 113,
      "comment": "\n     * \u003cp\u003e\n     * A registry of objects used by reflection methods to detect cyclical object references and avoid infinite loops.\n     * \u003c/p\u003e\n     * \n     * @since 2.3\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.Anonymous-68b21d5a-d008-4da0-b4d2-f43f21bae8d8.initialValue()",
      "begin_line": 108,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.getRegistry()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * \u003cp\u003e\n     * Returns the registry of objects being traversed by the reflection methods in the current thread.\n     * \u003c/p\u003e\n     * \n     * @return Set the registry of objects being traversed\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.isRegistered(java.lang.Object)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given object. Used by the reflection methods to avoid\n     * infinite loops.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            The object to lookup in the registry.\n     * @return boolean \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given object.\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.reflectionAppend(java.lang.Object, java.lang.Class, org.apache.commons.lang.builder.HashCodeBuilder, boolean, java.lang.String[])",
      "begin_line": 175,
      "end_line": 204,
      "comment": "\n     * \u003cp\u003e\n     * Appends the fields and values defined by the given object of the given \u003ccode\u003eClass\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the object to append details of\n     * @param clazz\n     *            the class to append details of\n     * @param builder\n     *            the builder to append to\n     * @param useTransients\n     *            whether to use transient fields\n     * @param excludeFields\n     *            Collection of String field names to exclude from use in calculation of hash code\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 203,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(int, int, java.lang.Object)",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the\n     * \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital. Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(int, int, java.lang.Object, boolean)",
      "begin_line": 286,
      "end_line": 290,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient members will be tested, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital. Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients\n     *            whether to include transient fields\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 289,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(int, int, java.lang.Object, boolean, java.lang.Class)",
      "begin_line": 308,
      "end_line": 312,
      "comment": "\n     * Calls {@link #reflectionHashCode(int, int, Object, boolean, Class, String[])} with excludeFields set to\n     * \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients\n     *            whether to include transient fields\n     * @param reflectUpToClass\n     *            the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return int hash code\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 311,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(int, int, java.lang.Object, boolean, java.lang.Class, java.lang.String[])",
      "begin_line": 359,
      "end_line": 373,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient members will be tested, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be included. Superclass fields will be included up to and including the specified\n     * superclass. A null superclass is treated as java.lang.Object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital. Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients\n     *            whether to include transient fields\n     * @param reflectUpToClass\n     *            the superclass to reflect up to (inclusive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param excludeFields\n     *            array of field names to exclude from use in calculation of hash code\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 107)",
        "(line 366,col 9)-(line 366,col 40)",
        "(line 367,col 9)-(line 367,col 80)",
        "(line 368,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object)",
      "begin_line": 405,
      "end_line": 407,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor uses two hard coded choices for the constants needed to build a hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the\n     * \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object, boolean)",
      "begin_line": 441,
      "end_line": 443,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor uses two hard coded choices for the constants needed to build a hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cP\u003e\n     * If the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient members will be tested, otherwise they\n     * are ignored, as they are likely derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients\n     *            whether to include transient fields\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object, java.util.Collection)",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor uses two hard coded choices for the constants needed to build a hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the\n     * \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param excludeFields\n     *            Collection of String field names to exclude from use in calculation of hash code\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object, java.lang.String[])",
      "begin_line": 515,
      "end_line": 517,
      "comment": "\n     * \u003cp\u003e\n     * This method uses reflection to build a valid hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor uses two hard coded choices for the constants needed to build a hash code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private fields. This means that it will\n     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the\n     * \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Static fields will not be tested. Superclass fields will be included.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param excludeFields\n     *            array of field names to exclude from use in calculation of hash code\n     * @return int hash code\n     * @throws IllegalArgumentException\n     *             if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.register(java.lang.Object)",
      "begin_line": 527,
      "end_line": 529,
      "comment": "\n     * \u003cp\u003e\n     * Registers the given object. Used by the reflection methods to avoid infinite loops.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            The object to register.\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.unregister(java.lang.Object)",
      "begin_line": 543,
      "end_line": 545,
      "comment": "\n     * \u003cp\u003e\n     * Unregisters the given object.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Used by the reflection methods to avoid infinite loops.\n     * \n     * @param value\n     *            The object to unregister.\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 47)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "iConstant"
      ],
      "begin_line": 550,
      "end_line": 550,
      "comment": "\n     * Constant to use in building the hashCode.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iTotal"
      ],
      "begin_line": 555,
      "end_line": 555,
      "comment": "\n     * Running total of the hashCode.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.HashCodeBuilder()",
      "begin_line": 562,
      "end_line": 565,
      "comment": "\n     * \u003cp\u003e\n     * Uses two hard coded choices for the constants needed to build a \u003ccode\u003ehashCode\u003c/code\u003e.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 23)",
        "(line 564,col 9)-(line 564,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.HashCodeBuilder(int, int)",
      "begin_line": 584,
      "end_line": 599,
      "comment": "\n     * \u003cp\u003e\n     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,\n     * however this is not vital.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Prime numbers are preferred, especially for the multiplier.\n     * \u003c/p\u003e\n     * \n     * @param initialNonZeroOddNumber\n     *            a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber\n     *            a non-zero, odd number used as the multiplier\n     * @throws IllegalArgumentException\n     *             if the number is zero or even\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 593,col 9)",
        "(line 594,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 597,col 47)",
        "(line 598,col 9)-(line 598,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(boolean)",
      "begin_line": 615,
      "end_line": 618,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eboolean\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This adds \u003ccode\u003eiConstant * 1\u003c/code\u003e to the \u003ccode\u003ehashCode\u003c/code\u003e and not a \u003ccode\u003e1231\u003c/code\u003e or\n     * \u003ccode\u003e1237\u003c/code\u003e as done in java.lang.Boolean. This is in accordance with the \u003cquote\u003eEffective Java\u003c/quote\u003e\n     * design.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the boolean to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 54)",
        "(line 617,col 9)-(line 617,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(boolean[])",
      "begin_line": 629,
      "end_line": 638,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eboolean\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 636,col 9)",
        "(line 637,col 9)-(line 637,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(byte)",
      "begin_line": 651,
      "end_line": 654,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003ebyte\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the byte to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 44)",
        "(line 653,col 9)-(line 653,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(byte[])",
      "begin_line": 667,
      "end_line": 676,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003ebyte\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 674,col 9)",
        "(line 675,col 9)-(line 675,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(char)",
      "begin_line": 687,
      "end_line": 690,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003echar\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the char to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 44)",
        "(line 689,col 9)-(line 689,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(char[])",
      "begin_line": 701,
      "end_line": 710,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003echar\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 702,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 709,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(double)",
      "begin_line": 721,
      "end_line": 723,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003edouble\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the double to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(double[])",
      "begin_line": 734,
      "end_line": 743,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003edouble\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 742,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(float)",
      "begin_line": 754,
      "end_line": 757,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003efloat\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the float to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 66)",
        "(line 756,col 9)-(line 756,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(float[])",
      "begin_line": 768,
      "end_line": 777,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003efloat\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 769,col 9)-(line 775,col 9)",
        "(line 776,col 9)-(line 776,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(int)",
      "begin_line": 788,
      "end_line": 791,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eint\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the int to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 44)",
        "(line 790,col 9)-(line 790,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(int[])",
      "begin_line": 802,
      "end_line": 811,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eint\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 809,col 9)",
        "(line 810,col 9)-(line 810,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(long)",
      "begin_line": 827,
      "end_line": 830,
      "comment": "       that will have to wait for the time being. cf LANG-342.",
      "child_ranges": [
        "(line 828,col 9)-(line 828,col 70)",
        "(line 829,col 9)-(line 829,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(long[])",
      "begin_line": 841,
      "end_line": 850,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003elong\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 842,col 9)-(line 848,col 9)",
        "(line 849,col 9)-(line 849,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(java.lang.Object)",
      "begin_line": 861,
      "end_line": 892,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eObject\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the Object to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 890,col 9)",
        "(line 891,col 9)-(line 891,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(java.lang.Object[])",
      "begin_line": 903,
      "end_line": 912,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eObject\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 910,col 9)",
        "(line 911,col 9)-(line 911,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(short)",
      "begin_line": 923,
      "end_line": 926,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eshort\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the short to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 924,col 9)-(line 924,col 44)",
        "(line 925,col 9)-(line 925,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(short[])",
      "begin_line": 937,
      "end_line": 946,
      "comment": "\n     * \u003cp\u003e\n     * Append a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eshort\u003c/code\u003e array.\n     * \u003c/p\u003e\n     * \n     * @param array\n     *            the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 938,col 9)-(line 944,col 9)",
        "(line 945,col 9)-(line 945,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.appendSuper(int)",
      "begin_line": 958,
      "end_line": 961,
      "comment": "\n     * \u003cp\u003e\n     * Adds the result of super.hashCode() to this builder.\n     * \u003c/p\u003e\n     * \n     * @param superHashCode\n     *            the result of calling \u003ccode\u003esuper.hashCode()\u003c/code\u003e\n     * @return this HashCodeBuilder, used to chain calls.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 959,col 9)-(line 959,col 52)",
        "(line 960,col 9)-(line 960,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.toHashCode()",
      "begin_line": 970,
      "end_line": 972,
      "comment": "\n     * \u003cp\u003e\n     * Return the computed \u003ccode\u003ehashCode\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @return \u003ccode\u003ehashCode\u003c/code\u003e based on the fields appended\n     ",
      "child_ranges": [
        "(line 971,col 9)-(line 971,col 22)"
      ]
    }
  ]
}