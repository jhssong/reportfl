{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EqualsBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 85,
      "end_line": 848,
      "comment": "\n * \u003cp\u003eAssists in implementing {@link Object#equals(Object)} methods.\u003c/p\u003e\n *\n * \u003cp\u003e This class provides methods to build a good equals method for any\n * class. It follows rules laid out in\n * \u003ca href\u003d\"http://java.sun.com/docs/books/effective/index.html\"\u003eEffective Java\u003c/a\u003e\n * , by Joshua Bloch. In particular the rule for comparing \u003ccode\u003edoubles\u003c/code\u003e,\n * \u003ccode\u003efloats\u003c/code\u003e, and arrays can be tricky. Also, making sure that\n * \u003ccode\u003eequals()\u003c/code\u003e and \u003ccode\u003ehashCode()\u003c/code\u003e are consistent can be\n * difficult.\u003c/p\u003e\n *\n * \u003cp\u003eTwo Objects that compare as equals must generate the same hash code,\n * but two Objects with the same hash code do not have to be equal.\u003c/p\u003e\n *\n * \u003cp\u003eAll relevant fields should be included in the calculation of equals.\n * Derived fields may be ignored. In particular, any field used in\n * generating a hash code must be used in the equals method, and vice\n * versa.\u003c/p\u003e\n *\n * \u003cp\u003eTypical use for the code is as follows:\u003c/p\u003e\n * \u003cpre\u003e\n * public boolean equals(Object obj) {\n *   if (obj \u003d\u003d null) { return false; }\n *   if (obj \u003d\u003d this) { return true; }\n *   if (obj.getClass() !\u003d getClass()) {\n *     return false;\n *   }\n *   MyClass rhs \u003d (MyClass) obj;\n *   return new EqualsBuilder()\n *                 .appendSuper(super.equals(obj))\n *                 .append(field1, rhs.field1)\n *                 .append(field2, rhs.field2)\n *                 .append(field3, rhs.field3)\n *                 .isEquals();\n *  }\n * \u003c/pre\u003e\n *\n * \u003cp\u003e Alternatively, there is a method that uses reflection to determine\n * the fields to test. Because these fields are usually private, the method,\n * \u003ccode\u003ereflectionEquals\u003c/code\u003e, uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to\n * change the visibility of the fields. This will fail under a security\n * manager, unless the appropriate permissions are set up correctly. It is\n * also slower than testing explicitly.\u003c/p\u003e\n *\n * \u003cp\u003e A typical invocation for this method would look like:\u003c/p\u003e\n * \u003cpre\u003e\n * public boolean equals(Object obj) {\n *   return EqualsBuilder.reflectionEquals(this, obj);\n * }\n * \u003c/pre\u003e\n *\n * @author Apache Software Foundation\n * @author \u003ca href\u003d\"mailto:steve.downey@netfolio.com\"\u003eSteve Downey\u003c/a\u003e\n * @author Gary Gregory\n * @author Pete Gieser\n * @author Arun Mammen Thomas\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "isEquals"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * If the fields tested are equals.\n     * The default value is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.EqualsBuilder()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * \u003cp\u003eConstructor for EqualsBuilder.\u003c/p\u003e\n     *\n     * \u003cp\u003eStarts off assuming that equals is \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     * @see Object#equals(Object)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eTransient members will be not be tested, as they are likely derived\n     * fields, and not part of the value of the Object.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eTransient members will be not be tested, as they are likely derived\n     * fields, and not part of the value of the Object.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param excludeFields  Collection of String field names to exclude from testing\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, java.lang.String[])",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eTransient members will be not be tested, as they are likely derived\n     * fields, and not part of the value of the Object.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param excludeFields  array of field names to exclude from testing\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, boolean)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient\n     * members will be tested, otherwise they are ignored, as they are likely\n     * derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param testTransients  whether to include transient fields\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, boolean, java.lang.Class\u003c?\u003e)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the testTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient\n     * members will be tested, otherwise they are ignored, as they are likely\n     * derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be included. Superclass fields will be appended\n     * up to and including the specified superclass. A null superclass is treated\n     * as java.lang.Object.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param testTransients  whether to include transient fields\n     * @param reflectUpToClass  the superclass to reflect up to (inclusive),\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, boolean, java.lang.Class\u003c?\u003e, java.lang.String[])",
      "begin_line": 252,
      "end_line": 299,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the testTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient\n     * members will be tested, otherwise they are ignored, as they are likely\n     * derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be included. Superclass fields will be appended\n     * up to and including the specified superclass. A null superclass is treated\n     * as java.lang.Object.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param testTransients  whether to include transient fields\n     * @param reflectUpToClass  the superclass to reflect up to (inclusive),\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param excludeFields  array of field names to exclude from testing\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 264,col 9)-(line 264,col 43)",
        "(line 265,col 9)-(line 265,col 43)",
        "(line 266,col 9)-(line 266,col 27)",
        "(line 267,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 58)",
        "(line 284,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionAppend(java.lang.Object, java.lang.Object, java.lang.Class\u003c?\u003e, org.apache.commons.lang3.builder.EqualsBuilder, boolean, java.lang.String[])",
      "begin_line": 312,
      "end_line": 336,
      "comment": "\n     * \u003cp\u003eAppends the fields and values defined by the given object of the\n     * given Class.\u003c/p\u003e\n     * \n     * @param lhs  the left hand object\n     * @param rhs  the right hand object\n     * @param clazz  the class to append details of\n     * @param builder  the builder to append to\n     * @param useTransients  whether to test transient fields\n     * @param excludeFields  array of field names to exclude from testing\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 51)",
        "(line 320,col 9)-(line 320,col 53)",
        "(line 321,col 9)-(line 335,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.appendSuper(boolean)",
      "begin_line": 347,
      "end_line": 353,
      "comment": "\n     * \u003cp\u003eAdds the result of \u003ccode\u003esuper.equals()\u003c/code\u003e to this builder.\u003c/p\u003e\n     *\n     * @param superEquals  the result of calling \u003ccode\u003esuper.equals()\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 31)",
        "(line 352,col 9)-(line 352,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(java.lang.Object, java.lang.Object)",
      "begin_line": 365,
      "end_line": 407,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003eObject\u003c/code\u003es are equal using their\n     * \u003ccode\u003eequals\u003c/code\u003e method.\u003c/p\u003e\n     *\n     * @param lhs  the left hand object\n     * @param rhs  the right hand object\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 43)",
        "(line 377,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(long, long)",
      "begin_line": 420,
      "end_line": 426,
      "comment": "\n     * \u003cp\u003e\n     * Test if two \u003ccode\u003elong\u003c/code\u003e s are equal.\n     * \u003c/p\u003e\n     * \n     * @param lhs\n     *                  the left hand \u003ccode\u003elong\u003c/code\u003e\n     * @param rhs\n     *                  the right hand \u003ccode\u003elong\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 32)",
        "(line 425,col 9)-(line 425,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(int, int)",
      "begin_line": 435,
      "end_line": 441,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003eint\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eint\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eint\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 32)",
        "(line 440,col 9)-(line 440,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(short, short)",
      "begin_line": 450,
      "end_line": 456,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003eshort\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eshort\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eshort\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 454,col 32)",
        "(line 455,col 9)-(line 455,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(char, char)",
      "begin_line": 465,
      "end_line": 471,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003echar\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003echar\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003echar\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 469,col 32)",
        "(line 470,col 9)-(line 470,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(byte, byte)",
      "begin_line": 480,
      "end_line": 486,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003ebyte\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003ebyte\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003ebyte\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 484,col 32)",
        "(line 485,col 9)-(line 485,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(double, double)",
      "begin_line": 501,
      "end_line": 506,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003edouble\u003c/code\u003es are equal by testing that the\n     * pattern of bits returned by \u003ccode\u003edoubleToLong\u003c/code\u003e are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis handles NaNs, Infinities, and \u003ccode\u003e-0.0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt is compatible with the hash code generated by\n     * \u003ccode\u003eHashCodeBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003edouble\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003edouble\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 505,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(float, float)",
      "begin_line": 521,
      "end_line": 526,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003efloat\u003c/code\u003es are equal byt testing that the\n     * pattern of bits returned by doubleToLong are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis handles NaNs, Infinities, and \u003ccode\u003e-0.0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt is compatible with the hash code generated by\n     * \u003ccode\u003eHashCodeBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003efloat\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003efloat\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 525,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(boolean, boolean)",
      "begin_line": 535,
      "end_line": 541,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003ebooleans\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eboolean\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eboolean\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n      ",
      "child_ranges": [
        "(line 536,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 539,col 32)",
        "(line 540,col 9)-(line 540,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(java.lang.Object[], java.lang.Object[])",
      "begin_line": 553,
      "end_line": 572,
      "comment": "\n     * \u003cp\u003ePerforms a deep comparison of two \u003ccode\u003eObject\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis also will be called for the top level of\n     * multi-dimensional, ragged, and multi-typed arrays.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eObject[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eObject[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 563,col 9)",
        "(line 564,col 9)-(line 567,col 9)",
        "(line 568,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 571,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(long[], long[])",
      "begin_line": 584,
      "end_line": 603,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003elong\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(long, long)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003elong[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003elong[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 602,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(int[], int[])",
      "begin_line": 615,
      "end_line": 634,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003eint\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(int, int)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eint[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eint[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 618,col 9)",
        "(line 619,col 9)-(line 621,col 9)",
        "(line 622,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 633,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(short[], short[])",
      "begin_line": 646,
      "end_line": 665,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003eshort\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(short, short)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eshort[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eshort[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 649,col 9)",
        "(line 650,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 656,col 9)",
        "(line 657,col 9)-(line 660,col 9)",
        "(line 661,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 664,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(char[], char[])",
      "begin_line": 677,
      "end_line": 696,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003echar\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(char, char)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003echar[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003echar[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 687,col 9)",
        "(line 688,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 694,col 9)",
        "(line 695,col 9)-(line 695,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(byte[], byte[])",
      "begin_line": 708,
      "end_line": 727,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003ebyte\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(byte, byte)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003ebyte[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003ebyte[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 711,col 9)",
        "(line 712,col 9)-(line 714,col 9)",
        "(line 715,col 9)-(line 718,col 9)",
        "(line 719,col 9)-(line 722,col 9)",
        "(line 723,col 9)-(line 725,col 9)",
        "(line 726,col 9)-(line 726,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(double[], double[])",
      "begin_line": 739,
      "end_line": 758,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003edouble\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(double, double)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003edouble[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003edouble[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 742,col 9)",
        "(line 743,col 9)-(line 745,col 9)",
        "(line 746,col 9)-(line 749,col 9)",
        "(line 750,col 9)-(line 753,col 9)",
        "(line 754,col 9)-(line 756,col 9)",
        "(line 757,col 9)-(line 757,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(float[], float[])",
      "begin_line": 770,
      "end_line": 789,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003efloat\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(float, float)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003efloat[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003efloat[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 776,col 9)",
        "(line 777,col 9)-(line 780,col 9)",
        "(line 781,col 9)-(line 784,col 9)",
        "(line 785,col 9)-(line 787,col 9)",
        "(line 788,col 9)-(line 788,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(boolean[], boolean[])",
      "begin_line": 801,
      "end_line": 820,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003eboolean\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(boolean, boolean)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eboolean[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eboolean[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 802,col 9)-(line 804,col 9)",
        "(line 805,col 9)-(line 807,col 9)",
        "(line 808,col 9)-(line 811,col 9)",
        "(line 812,col 9)-(line 815,col 9)",
        "(line 816,col 9)-(line 818,col 9)",
        "(line 819,col 9)-(line 819,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.isEquals()",
      "begin_line": 828,
      "end_line": 830,
      "comment": "\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if the fields that have been checked\n     * are all equal.\u003c/p\u003e\n     *\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 829,col 9)-(line 829,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.setEquals(boolean)",
      "begin_line": 838,
      "end_line": 840,
      "comment": "\n     * Sets the \u003ccode\u003eisEquals\u003c/code\u003e value.\n     * \n     * @param isEquals The value to set.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reset()",
      "begin_line": 845,
      "end_line": 847,
      "comment": "\n     * Reset the EqualsBuilder so you can use the same object again\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 29)"
      ]
    }
  ]
}