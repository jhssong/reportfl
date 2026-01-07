{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/builder/HashCodeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 83,
      "end_line": 696,
      "comment": "\n * \u003cp\u003eAssists in implementing {@link Object#hashCode()} methods.\u003c/p\u003e\n *\n * \u003cp\u003e This class enables a good \u003ccode\u003ehashCode\u003c/code\u003e method to be built for any class. It\n * follows the rules laid out in the book\n * \u003ca href\u003d\"http://java.sun.com/docs/books/effective/index.html\"\u003eEffective Java\u003c/a\u003e\n * by Joshua Bloch. Writing a good \u003ccode\u003ehashCode\u003c/code\u003e method is actually quite\n * difficult. This class aims to simplify the process.\u003c/p\u003e\n *\n * \u003cp\u003eAll relevant fields from the object should be included in the\n * \u003ccode\u003ehashCode\u003c/code\u003e method. Derived fields may be excluded. In general, any\n * field used in the \u003ccode\u003eequals\u003c/code\u003e method must be used in the \u003ccode\u003ehashCode\u003c/code\u003e\n * method.\u003c/p\u003e\n *\n * \u003cp\u003eTo use this class write code as follows:\u003c/p\u003e\n * \u003cpre\u003e\n * public class Person {\n *   String name;\n *   int age;\n *   boolean smoker;\n *   ...\n *\n *   public int hashCode() {\n *     // you pick a hard-coded, randomly chosen, non-zero, odd number\n *     // ideally different for each class\n *     return new HashCodeBuilder(17, 37).\n *       append(name).\n *       append(age).\n *       append(smoker).\n *       toHashCode();\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eIf required, the superclass \u003ccode\u003ehashCode()\u003c/code\u003e can be added\n * using {@link #appendSuper}.\u003c/p\u003e\n *\n * \u003cp\u003eAlternatively, there is a method that uses reflection to determine\n * the fields to test. Because these fields are usually private, the method,\n * \u003ccode\u003ereflectionHashCode\u003c/code\u003e, uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to\n * change the visibility of the fields. This will fail under a security manager,\n * unless the appropriate permissions are set up correctly. It is also slower\n * than testing explicitly.\u003c/p\u003e\n *\n * \u003cp\u003eA typical invocation for this method would look like:\u003c/p\u003e\n * \u003cpre\u003e\n * public int hashCode() {\n *   return HashCodeBuilder.reflectionHashCode(this);\n * }\n * \u003c/pre\u003e\n *\n * @author Stephen Colebourne\n * @author Gary Gregory\n * @author Pete Gieser\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "iConstant"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Constant to use in building the hashCode.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iTotal"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * Running total of the hashCode.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.HashCodeBuilder()",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * \u003cp\u003eUses two hard coded choices for the constants\n     * needed to build a \u003ccode\u003ehashCode\u003c/code\u003e.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 23)",
        "(line 100,col 9)-(line 100,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.HashCodeBuilder(int, int)",
      "begin_line": 114,
      "end_line": 129,
      "comment": "\n     * \u003cp\u003eTwo randomly chosen, non-zero, odd numbers must be passed in.\n     * Ideally these should be different for each class, however this is\n     * not vital.\u003c/p\u003e\n     *\n     * \u003cp\u003ePrime numbers are preferred, especially for the multiplier.\u003c/p\u003e\n     *\n     * @param initialNonZeroOddNumber  a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber  a non-zero, odd number used as the multiplier\n     * @throws IllegalArgumentException if the number is zero or even\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 47)",
        "(line 128,col 9)-(line 128,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to build a valid hash code.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor uses two hard coded choices for the constants\n     * needed to build a hash code.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eTransient members will be not be used, as they are likely derived\n     * fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param object  the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @return int hash code\n     * @throws IllegalArgumentException if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object, java.util.Collection)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to build a valid hash code.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor uses two hard coded choices for the constants\n     * needed to build a hash code.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eTransient members will be not be used, as they are likely derived\n     * fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param object  the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param excludeFields  Collection of String field names to exclude from use in calculation of hash code\n     * @return int hash code\n     * @throws IllegalArgumentException if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object, java.lang.String[])",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to build a valid hash code.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor uses two hard coded choices for the constants\n     * needed to build a hash code.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eTransient members will be not be used, as they are likely derived\n     * fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param object  the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param excludeFields  array of field names to exclude from use in calculation of hash code\n     * @return int hash code\n     * @throws IllegalArgumentException if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(java.lang.Object, boolean)",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to build a valid hash code.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor uses two hard coded choices for the constants needed\n     * to build a hash code.\u003c/p\u003e\n     *\n     * \u003cp\u003e It uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cP\u003eIf the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient\n     * members will be tested, otherwise they are ignored, as they are likely\n     * derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param object  the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients  whether to include transient fields\n     * @return int hash code\n     * @throws IllegalArgumentException if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(int, int, java.lang.Object)",
      "begin_line": 257,
      "end_line": 260,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to build a valid hash code.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is\n     * also not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eTransient members will be not be used, as they are likely derived\n     * fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * \u003cp\u003eTwo randomly chosen, non-zero, odd numbers must be passed in. Ideally\n     * these should be different for each class, however this is not vital.\n     * Prime numbers are preferred, especially for the multiplier.\u003c/p\u003e\n     *\n     * @param initialNonZeroOddNumber  a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber  a non-zero, odd number used as the multiplier\n     * @param object  the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @return int hash code\n     * @throws IllegalArgumentException if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the number is zero or even\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(int, int, java.lang.Object, boolean)",
      "begin_line": 288,
      "end_line": 294,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to build a valid hash code.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient\n     * members will be tested, otherwise they are ignored, as they are likely\n     * derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * \u003cp\u003eTwo randomly chosen, non-zero, odd numbers must be passed in. Ideally\n     * these should be different for each class, however this is not vital.\n     * Prime numbers are preferred, especially for the multiplier.\u003c/p\u003e\n     *\n     * @param initialNonZeroOddNumber  a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber  a non-zero, odd number used as the multiplier\n     * @param object  the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients  whether to include transient fields\n     * @return int hash code\n     * @throws IllegalArgumentException if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the number is zero or even\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 293,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(int, int, java.lang.Object, boolean, java.lang.Class, java.lang.String[])",
      "begin_line": 328,
      "end_line": 347,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to build a valid hash code.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient\n     * members will be tested, otherwise they are ignored, as they are likely\n     * derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be included. Superclass fields will be included\n     * up to and including the specified superclass. A null superclass is treated\n     * as java.lang.Object.\u003c/p\u003e\n     *\n     * \u003cp\u003eTwo randomly chosen, non-zero, odd numbers must be passed in. Ideally\n     * these should be different for each class, however this is not vital.\n     * Prime numbers are preferred, especially for the multiplier.\u003c/p\u003e\n     *\n     * @param initialNonZeroOddNumber  a non-zero, odd number used as the initial value\n     * @param multiplierNonZeroOddNumber  a non-zero, odd number used as the multiplier\n     * @param object  the Object to create a \u003ccode\u003ehashCode\u003c/code\u003e for\n     * @param testTransients  whether to include transient fields\n     * @param reflectUpToClass  the superclass to reflect up to (inclusive),\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param excludeFields  array of field names to exclude from use in calculation of hash code\n     * @return int hash code\n     * @throws IllegalArgumentException if the Object is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the number is zero or even\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 107)",
        "(line 340,col 9)-(line 340,col 40)",
        "(line 341,col 9)-(line 341,col 80)",
        "(line 342,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.reflectionAppend(java.lang.Object, java.lang.Class, org.apache.commons.lang.builder.HashCodeBuilder, boolean, java.lang.String[])",
      "begin_line": 359,
      "end_line": 383,
      "comment": "\n     * \u003cp\u003eAppends the fields and values defined by the given object of the\n     * given \u003ccode\u003eClass\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param object  the object to append details of\n     * @param clazz  the class to append details of\n     * @param builder  the builder to append to\n     * @param useTransients  whether to use transient fields\n     * @param excludeFields  Collection of String field names to exclude from use in calculation of hash code\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 51)",
        "(line 366,col 9)-(line 366,col 111)",
        "(line 367,col 9)-(line 367,col 53)",
        "(line 368,col 9)-(line 382,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.appendSuper(int)",
      "begin_line": 394,
      "end_line": 397,
      "comment": "\n     * \u003cp\u003eAdds the result of super.hashCode() to this builder.\u003c/p\u003e\n     *\n     * @param superHashCode  the result of calling \u003ccode\u003esuper.hashCode()\u003c/code\u003e\n     * @return this HashCodeBuilder, used to chain calls.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 52)",
        "(line 396,col 9)-(line 396,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(java.lang.Object)",
      "begin_line": 407,
      "end_line": 442,
      "comment": "\n     * \u003cp\u003eAppend a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param object  the Object to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 441,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(long)",
      "begin_line": 450,
      "end_line": 453,
      "comment": "\n     * \u003cp\u003eAppend a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param value  the long to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 70)",
        "(line 452,col 9)-(line 452,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(int)",
      "begin_line": 461,
      "end_line": 464,
      "comment": "\n     * \u003cp\u003eAppend a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param value  the int to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 44)",
        "(line 463,col 9)-(line 463,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(short)",
      "begin_line": 472,
      "end_line": 475,
      "comment": "\n     * \u003cp\u003eAppend a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eshort\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param value  the short to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 44)",
        "(line 474,col 9)-(line 474,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(char)",
      "begin_line": 483,
      "end_line": 486,
      "comment": "\n     * \u003cp\u003eAppend a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003echar\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param value  the char to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 44)",
        "(line 485,col 9)-(line 485,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(byte)",
      "begin_line": 494,
      "end_line": 497,
      "comment": "\n     * \u003cp\u003eAppend a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003ebyte\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param value  the byte to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 44)",
        "(line 496,col 9)-(line 496,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(double)",
      "begin_line": 505,
      "end_line": 507,
      "comment": "\n     * \u003cp\u003eAppend a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param value  the double to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(float)",
      "begin_line": 515,
      "end_line": 518,
      "comment": "\n     * \u003cp\u003eAppend a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param value  the float to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 66)",
        "(line 517,col 9)-(line 517,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(boolean)",
      "begin_line": 529,
      "end_line": 532,
      "comment": "\n     * \u003cp\u003eAppend a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eboolean\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003eThis adds \u003ccode\u003eiConstant * 1\u003c/code\u003e to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * and not a \u003ccode\u003e1231\u003c/code\u003e or \u003ccode\u003e1237\u003c/code\u003e as done in java.lang.Boolean. \n     * This is in accordance with the \u003cquote\u003eEffective Java\u003c/quote\u003e design. \u003c/p\u003e\n     *\n     * @param value  the boolean to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 54)",
        "(line 531,col 9)-(line 531,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(java.lang.Object[])",
      "begin_line": 540,
      "end_line": 549,
      "comment": "\n     * \u003cp\u003eAppend a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eObject\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 548,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(long[])",
      "begin_line": 557,
      "end_line": 566,
      "comment": "\n     * \u003cp\u003eAppend a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003elong\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 565,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(int[])",
      "begin_line": 574,
      "end_line": 583,
      "comment": "\n     * \u003cp\u003eAppend a \u003ccode\u003ehashCode\u003c/code\u003e for an \u003ccode\u003eint\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 582,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(short[])",
      "begin_line": 591,
      "end_line": 600,
      "comment": "\n     * \u003cp\u003eAppend a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eshort\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 599,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(char[])",
      "begin_line": 608,
      "end_line": 617,
      "comment": "\n     * \u003cp\u003eAppend a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003echar\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 615,col 9)",
        "(line 616,col 9)-(line 616,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(byte[])",
      "begin_line": 625,
      "end_line": 634,
      "comment": "\n     * \u003cp\u003eAppend a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003ebyte\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 633,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(double[])",
      "begin_line": 642,
      "end_line": 651,
      "comment": "\n     * \u003cp\u003eAppend a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003edouble\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 649,col 9)",
        "(line 650,col 9)-(line 650,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(float[])",
      "begin_line": 659,
      "end_line": 668,
      "comment": "\n     * \u003cp\u003eAppend a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003efloat\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 667,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.append(boolean[])",
      "begin_line": 676,
      "end_line": 685,
      "comment": "\n     * \u003cp\u003eAppend a \u003ccode\u003ehashCode\u003c/code\u003e for a \u003ccode\u003eboolean\u003c/code\u003e array.\u003c/p\u003e\n     *\n     * @param array  the array to add to the \u003ccode\u003ehashCode\u003c/code\u003e\n     * @return this\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.HashCodeBuilder.toHashCode()",
      "begin_line": 692,
      "end_line": 694,
      "comment": "\n     * \u003cp\u003eReturn the computed \u003ccode\u003ehashCode\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return \u003ccode\u003ehashCode\u003c/code\u003e based on the fields appended\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 22)"
      ]
    }
  ]
}