{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/builder/EqualsBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EqualsBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 86,
      "end_line": 847,
      "comment": "\n * \u003cp\u003eAssists in implementing {@link Object#equals(Object)} methods.\u003c/p\u003e\n *\n * \u003cp\u003e This class provides methods to build a good equals method for any\n * class. It follows rules laid out in\n * \u003ca href\u003d\"http://java.sun.com/docs/books/effective/index.html\"\u003eEffective Java\u003c/a\u003e\n * , by Joshua Bloch. In particular the rule for comparing \u003ccode\u003edoubles\u003c/code\u003e,\n * \u003ccode\u003efloats\u003c/code\u003e, and arrays can be tricky. Also, making sure that\n * \u003ccode\u003eequals()\u003c/code\u003e and \u003ccode\u003ehashCode()\u003c/code\u003e are consistent can be\n * difficult.\u003c/p\u003e\n *\n * \u003cp\u003eTwo Objects that compare as equals must generate the same hash code,\n * but two Objects with the same hash code do not have to be equal.\u003c/p\u003e\n *\n * \u003cp\u003eAll relevant fields should be included in the calculation of equals.\n * Derived fields may be ignored. In particular, any field used in\n * generating a hash code must be used in the equals method, and vice\n * versa.\u003c/p\u003e\n *\n * \u003cp\u003eTypical use for the code is as follows:\u003c/p\u003e\n * \u003cpre\u003e\n * public boolean equals(Object obj) {\n *   if (obj \u003d\u003d null) { return false; }\n *   if (obj \u003d\u003d this) { return true; }\n *   if (obj.getClass() !\u003d getClass()) {\n *     return false;\n *   }\n *   MyClass rhs \u003d (MyClass) obj;\n *   return new EqualsBuilder()\n *                 .appendSuper(super.equals(obj))\n *                 .append(field1, rhs.field1)\n *                 .append(field2, rhs.field2)\n *                 .append(field3, rhs.field3)\n *                 .isEquals();\n *  }\n * \u003c/pre\u003e\n *\n * \u003cp\u003e Alternatively, there is a method that uses reflection to determine\n * the fields to test. Because these fields are usually private, the method,\n * \u003ccode\u003ereflectionEquals\u003c/code\u003e, uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to\n * change the visibility of the fields. This will fail under a security\n * manager, unless the appropriate permissions are set up correctly. It is\n * also slower than testing explicitly.\u003c/p\u003e\n *\n * \u003cp\u003e A typical invocation for this method would look like:\u003c/p\u003e\n * \u003cpre\u003e\n * public boolean equals(Object obj) {\n *   return EqualsBuilder.reflectionEquals(this, obj);\n * }\n * \u003c/pre\u003e\n *\n * @author \u003ca href\u003d\"mailto:steve.downey@netfolio.com\"\u003eSteve Downey\u003c/a\u003e\n * @author Stephen Colebourne\n * @author Gary Gregory\n * @author Pete Gieser\n * @author Arun Mammen Thomas\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "isEquals"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * If the fields tested are equals.\n     * The default value is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.EqualsBuilder()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * \u003cp\u003eConstructor for EqualsBuilder.\u003c/p\u003e\n     *\n     * \u003cp\u003eStarts off assuming that equals is \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     * @see Object#equals(Object)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eTransient members will be not be tested, as they are likely derived\n     * fields, and not part of the value of the Object.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, java.util.Collection)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eTransient members will be not be tested, as they are likely derived\n     * fields, and not part of the value of the Object.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param excludeFields  Collection of String field names to exclude from testing\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, java.lang.String[])",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eTransient members will be not be tested, as they are likely derived\n     * fields, and not part of the value of the Object.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param excludeFields  array of field names to exclude from testing\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, boolean)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient\n     * members will be tested, otherwise they are ignored, as they are likely\n     * derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param testTransients  whether to include transient fields\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, boolean, java.lang.Class)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the testTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient\n     * members will be tested, otherwise they are ignored, as they are likely\n     * derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be included. Superclass fields will be appended\n     * up to and including the specified superclass. A null superclass is treated\n     * as java.lang.Object.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param testTransients  whether to include transient fields\n     * @param reflectUpToClass  the superclass to reflect up to (inclusive),\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, boolean, java.lang.Class, java.lang.String[])",
      "begin_line": 253,
      "end_line": 300,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the testTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient\n     * members will be tested, otherwise they are ignored, as they are likely\n     * derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be included. Superclass fields will be appended\n     * up to and including the specified superclass. A null superclass is treated\n     * as java.lang.Object.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param testTransients  whether to include transient fields\n     * @param reflectUpToClass  the superclass to reflect up to (inclusive),\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param excludeFields  array of field names to exclude from testing\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 265,col 9)-(line 265,col 40)",
        "(line 266,col 9)-(line 266,col 40)",
        "(line 267,col 9)-(line 267,col 24)",
        "(line 268,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 58)",
        "(line 285,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.reflectionAppend(java.lang.Object, java.lang.Object, java.lang.Class, org.apache.commons.lang.builder.EqualsBuilder, boolean, java.lang.String[])",
      "begin_line": 313,
      "end_line": 338,
      "comment": "\n     * \u003cp\u003eAppends the fields and values defined by the given object of the\n     * given Class.\u003c/p\u003e\n     * \n     * @param lhs  the left hand object\n     * @param rhs  the right hand object\n     * @param clazz  the class to append details of\n     * @param builder  the builder to append to\n     * @param useTransients  whether to test transient fields\n     * @param excludeFields  array of field names to exclude from testing\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 51)",
        "(line 321,col 9)-(line 321,col 111)",
        "(line 322,col 9)-(line 322,col 53)",
        "(line 323,col 9)-(line 337,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.appendSuper(boolean)",
      "begin_line": 349,
      "end_line": 355,
      "comment": "\n     * \u003cp\u003eAdds the result of \u003ccode\u003esuper.equals()\u003c/code\u003e to this builder.\u003c/p\u003e\n     *\n     * @param superEquals  the result of calling \u003ccode\u003esuper.equals()\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 31)",
        "(line 354,col 9)-(line 354,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.append(java.lang.Object, java.lang.Object)",
      "begin_line": 367,
      "end_line": 413,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003eObject\u003c/code\u003es are equal using their\n     * \u003ccode\u003eequals\u003c/code\u003e method.\u003c/p\u003e\n     *\n     * @param lhs  the left hand object\n     * @param rhs  the right hand object\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 40)",
        "(line 379,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.append(long, long)",
      "begin_line": 426,
      "end_line": 432,
      "comment": "\n     * \u003cp\u003e\n     * Test if two \u003ccode\u003elong\u003c/code\u003e s are equal.\n     * \u003c/p\u003e\n     * \n     * @param lhs\n     *                  the left hand \u003ccode\u003elong\u003c/code\u003e\n     * @param rhs\n     *                  the right hand \u003ccode\u003elong\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 32)",
        "(line 431,col 9)-(line 431,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.append(int, int)",
      "begin_line": 441,
      "end_line": 447,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003eint\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eint\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eint\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 32)",
        "(line 446,col 9)-(line 446,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.append(short, short)",
      "begin_line": 456,
      "end_line": 462,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003eshort\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eshort\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eshort\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 32)",
        "(line 461,col 9)-(line 461,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.append(char, char)",
      "begin_line": 471,
      "end_line": 477,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003echar\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003echar\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003echar\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 475,col 32)",
        "(line 476,col 9)-(line 476,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.append(byte, byte)",
      "begin_line": 486,
      "end_line": 492,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003ebyte\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003ebyte\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003ebyte\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 32)",
        "(line 491,col 9)-(line 491,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.append(double, double)",
      "begin_line": 507,
      "end_line": 512,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003edouble\u003c/code\u003es are equal by testing that the\n     * pattern of bits returned by \u003ccode\u003edoubleToLong\u003c/code\u003e are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis handles NaNs, Infinities, and \u003ccode\u003e-0.0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt is compatible with the hash code generated by\n     * \u003ccode\u003eHashCodeBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003edouble\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003edouble\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 511,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.append(float, float)",
      "begin_line": 527,
      "end_line": 532,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003efloat\u003c/code\u003es are equal byt testing that the\n     * pattern of bits returned by doubleToLong are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis handles NaNs, Infinities, and \u003ccode\u003e-0.0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt is compatible with the hash code generated by\n     * \u003ccode\u003eHashCodeBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003efloat\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003efloat\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 530,col 9)",
        "(line 531,col 9)-(line 531,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.append(boolean, boolean)",
      "begin_line": 541,
      "end_line": 547,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003ebooleans\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eboolean\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eboolean\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n      ",
      "child_ranges": [
        "(line 542,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 545,col 32)",
        "(line 546,col 9)-(line 546,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.append(java.lang.Object[], java.lang.Object[])",
      "begin_line": 559,
      "end_line": 578,
      "comment": "\n     * \u003cp\u003ePerforms a deep comparison of two \u003ccode\u003eObject\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis also will be called for the top level of\n     * multi-dimensional, ragged, and multi-typed arrays.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eObject[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eObject[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 577,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.append(long[], long[])",
      "begin_line": 590,
      "end_line": 609,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003elong\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(long, long)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003elong[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003elong[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 593,col 9)",
        "(line 594,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 600,col 9)",
        "(line 601,col 9)-(line 604,col 9)",
        "(line 605,col 9)-(line 607,col 9)",
        "(line 608,col 9)-(line 608,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.append(int[], int[])",
      "begin_line": 621,
      "end_line": 640,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003eint\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(int, int)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eint[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eint[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 624,col 9)",
        "(line 625,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 631,col 9)",
        "(line 632,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 639,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.append(short[], short[])",
      "begin_line": 652,
      "end_line": 671,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003eshort\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(short, short)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eshort[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eshort[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 658,col 9)",
        "(line 659,col 9)-(line 662,col 9)",
        "(line 663,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.append(char[], char[])",
      "begin_line": 683,
      "end_line": 702,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003echar\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(char, char)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003echar[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003echar[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 684,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 689,col 9)",
        "(line 690,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 701,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.append(byte[], byte[])",
      "begin_line": 714,
      "end_line": 733,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003ebyte\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(byte, byte)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003ebyte[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003ebyte[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 717,col 9)",
        "(line 718,col 9)-(line 720,col 9)",
        "(line 721,col 9)-(line 724,col 9)",
        "(line 725,col 9)-(line 728,col 9)",
        "(line 729,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 732,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.append(double[], double[])",
      "begin_line": 745,
      "end_line": 764,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003edouble\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(double, double)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003edouble[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003edouble[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 748,col 9)",
        "(line 749,col 9)-(line 751,col 9)",
        "(line 752,col 9)-(line 755,col 9)",
        "(line 756,col 9)-(line 759,col 9)",
        "(line 760,col 9)-(line 762,col 9)",
        "(line 763,col 9)-(line 763,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.append(float[], float[])",
      "begin_line": 776,
      "end_line": 795,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003efloat\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(float, float)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003efloat[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003efloat[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 779,col 9)",
        "(line 780,col 9)-(line 782,col 9)",
        "(line 783,col 9)-(line 786,col 9)",
        "(line 787,col 9)-(line 790,col 9)",
        "(line 791,col 9)-(line 793,col 9)",
        "(line 794,col 9)-(line 794,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.append(boolean[], boolean[])",
      "begin_line": 807,
      "end_line": 826,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003eboolean\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(boolean, boolean)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eboolean[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eboolean[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 810,col 9)",
        "(line 811,col 9)-(line 813,col 9)",
        "(line 814,col 9)-(line 817,col 9)",
        "(line 818,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 824,col 9)",
        "(line 825,col 9)-(line 825,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.isEquals()",
      "begin_line": 834,
      "end_line": 836,
      "comment": "\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if the fields that have been checked\n     * are all equal.\u003c/p\u003e\n     *\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 835,col 9)-(line 835,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilder.setEquals(boolean)",
      "begin_line": 844,
      "end_line": 846,
      "comment": "\n     * Sets the \u003ccode\u003eisEquals\u003c/code\u003e value.\n     * \n     * @param isEquals The value to set.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 33)"
      ]
    }
  ]
}