{
  "filepath": "/tmp/Lang-28b/src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EqualsBuilder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.Builder\u003cjava.lang.Boolean\u003e"
      ],
      "begin_line": 89,
      "end_line": 1002,
      "comment": "\n * \u003cp\u003eAssists in implementing {@link Object#equals(Object)} methods.\u003c/p\u003e\n *\n * \u003cp\u003e This class provides methods to build a good equals method for any\n * class. It follows rules laid out in\n * \u003ca href\u003d\"http://java.sun.com/docs/books/effective/index.html\"\u003eEffective Java\u003c/a\u003e\n * , by Joshua Bloch. In particular the rule for comparing \u003ccode\u003edoubles\u003c/code\u003e,\n * \u003ccode\u003efloats\u003c/code\u003e, and arrays can be tricky. Also, making sure that\n * \u003ccode\u003eequals()\u003c/code\u003e and \u003ccode\u003ehashCode()\u003c/code\u003e are consistent can be\n * difficult.\u003c/p\u003e\n *\n * \u003cp\u003eTwo Objects that compare as equals must generate the same hash code,\n * but two Objects with the same hash code do not have to be equal.\u003c/p\u003e\n *\n * \u003cp\u003eAll relevant fields should be included in the calculation of equals.\n * Derived fields may be ignored. In particular, any field used in\n * generating a hash code must be used in the equals method, and vice\n * versa.\u003c/p\u003e\n *\n * \u003cp\u003eTypical use for the code is as follows:\u003c/p\u003e\n * \u003cpre\u003e\n * public boolean equals(Object obj) {\n *   if (obj \u003d\u003d null) { return false; }\n *   if (obj \u003d\u003d this) { return true; }\n *   if (obj.getClass() !\u003d getClass()) {\n *     return false;\n *   }\n *   MyClass rhs \u003d (MyClass) obj;\n *   return new EqualsBuilder()\n *                 .appendSuper(super.equals(obj))\n *                 .append(field1, rhs.field1)\n *                 .append(field2, rhs.field2)\n *                 .append(field3, rhs.field3)\n *                 .isEquals();\n *  }\n * \u003c/pre\u003e\n *\n * \u003cp\u003e Alternatively, there is a method that uses reflection to determine\n * the fields to test. Because these fields are usually private, the method,\n * \u003ccode\u003ereflectionEquals\u003c/code\u003e, uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to\n * change the visibility of the fields. This will fail under a security\n * manager, unless the appropriate permissions are set up correctly. It is\n * also slower than testing explicitly.\u003c/p\u003e\n *\n * \u003cp\u003e A typical invocation for this method would look like:\u003c/p\u003e\n * \u003cpre\u003e\n * public boolean equals(Object obj) {\n *   return EqualsBuilder.reflectionEquals(this, obj);\n * }\n * \u003c/pre\u003e\n *\n * @author Apache Software Foundation\n * @author \u003ca href\u003d\"mailto:steve.downey@netfolio.com\"\u003eSteve Downey\u003c/a\u003e\n * @author Gary Gregory\n * @author Pete Gieser\n * @author Arun Mammen Thomas\n * @author Oliver Sauder\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "REGISTRY"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * \u003cp\u003e\n     * A registry of objects used by reflection methods to detect cyclical object references and avoid infinite loops.\n     * \u003c/p\u003e\n     * \n     * @since 3.0\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.getRegistry()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * \u003cp\u003e\n     * Returns the registry of object pairs being traversed by the reflection\n     * methods in the current thread.\n     * \u003c/p\u003e\n     * \n     * @return Set the registry of objects being traversed\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.getRegisterPair(java.lang.Object, java.lang.Object)",
      "begin_line": 140,
      "end_line": 144,
      "comment": "\n     * \u003cp\u003e\n     * Converters value pair into a register pair.\n     * \u003c/p\u003e\n     * \n     * @param lhs \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs the other object\n     * \n     * @return\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 36)",
        "(line 142,col 9)-(line 142,col 37)",
        "(line 143,col 9)-(line 143,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.isRegistered(java.lang.Object, java.lang.Object)",
      "begin_line": 159,
      "end_line": 167,
      "comment": "\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given object pair.\n     * Used by the reflection methods to avoid infinite loops.\n     * Objects might be swapped therefore a check is needed if the object pair\n     * is registered in given or swapped order.\n     * \u003c/p\u003e\n     * \n     * @param lhs \u003ccode\u003ethis\u003c/code\u003e object to lookup in registry\n     * @param rhs the other object to lookup on registry\n     * @return boolean \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given object.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 57)",
        "(line 161,col 9)-(line 161,col 60)",
        "(line 162,col 9)-(line 163,col 27)",
        "(line 165,col 9)-(line 166,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.register(java.lang.Object, java.lang.Object)",
      "begin_line": 178,
      "end_line": 188,
      "comment": "\n     * \u003cp\u003e\n     * Registers the given object pair.\n     * Used by the reflection methods to avoid infinite loops.\n     * \u003c/p\u003e\n     * \n     * @param lhs \u003ccode\u003ethis\u003c/code\u003e object to register\n     * @param rhs the other object to register\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 185,col 57)",
        "(line 186,col 9)-(line 186,col 60)",
        "(line 187,col 9)-(line 187,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.unregister(java.lang.Object, java.lang.Object)",
      "begin_line": 202,
      "end_line": 215,
      "comment": "\n     * \u003cp\u003e\n     * Unregisters the given object pair.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Used by the reflection methods to avoid infinite loops.\n     * \n     * @param lhs \u003ccode\u003ethis\u003c/code\u003e object to unregister\n     * @param rhs the other object to unregister\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 57)",
        "(line 204,col 9)-(line 214,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "isEquals"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": "\n     * If the fields tested are equals.\n     * The default value is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.EqualsBuilder()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * \u003cp\u003eConstructor for EqualsBuilder.\u003c/p\u003e\n     *\n     * \u003cp\u003eStarts off assuming that equals is \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     * @see Object#equals(Object)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object)",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eTransient members will be not be tested, as they are likely derived\n     * fields, and not part of the value of the Object.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eTransient members will be not be tested, as they are likely derived\n     * fields, and not part of the value of the Object.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param excludeFields  Collection of String field names to exclude from testing\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, java.lang.String[])",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eTransient members will be not be tested, as they are likely derived\n     * fields, and not part of the value of the Object.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param excludeFields  array of field names to exclude from testing\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, boolean)",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient\n     * members will be tested, otherwise they are ignored, as they are likely\n     * derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param testTransients  whether to include transient fields\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, boolean, java.lang.Class\u003c?\u003e)",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the testTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient\n     * members will be tested, otherwise they are ignored, as they are likely\n     * derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be included. Superclass fields will be appended\n     * up to and including the specified superclass. A null superclass is treated\n     * as java.lang.Object.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param testTransients  whether to include transient fields\n     * @param reflectUpToClass  the superclass to reflect up to (inclusive),\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, boolean, java.lang.Class\u003c?\u003e, java.lang.String[])",
      "begin_line": 382,
      "end_line": 429,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the testTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient\n     * members will be tested, otherwise they are ignored, as they are likely\n     * derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be included. Superclass fields will be appended\n     * up to and including the specified superclass. A null superclass is treated\n     * as java.lang.Object.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param testTransients  whether to include transient fields\n     * @param reflectUpToClass  the superclass to reflect up to (inclusive),\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param excludeFields  array of field names to exclude from testing\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 389,col 9)",
        "(line 394,col 9)-(line 394,col 43)",
        "(line 395,col 9)-(line 395,col 43)",
        "(line 396,col 9)-(line 396,col 27)",
        "(line 397,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 413,col 58)",
        "(line 414,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionAppend(java.lang.Object, java.lang.Object, java.lang.Class\u003c?\u003e, org.apache.commons.lang3.builder.EqualsBuilder, boolean, java.lang.String[])",
      "begin_line": 442,
      "end_line": 476,
      "comment": "\n     * \u003cp\u003eAppends the fields and values defined by the given object of the\n     * given Class.\u003c/p\u003e\n     * \n     * @param lhs  the left hand object\n     * @param rhs  the right hand object\n     * @param clazz  the class to append details of\n     * @param builder  the builder to append to\n     * @param useTransients  whether to test transient fields\n     * @param excludeFields  array of field names to exclude from testing\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 475,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.appendSuper(boolean)",
      "begin_line": 487,
      "end_line": 493,
      "comment": "\n     * \u003cp\u003eAdds the result of \u003ccode\u003esuper.equals()\u003c/code\u003e to this builder.\u003c/p\u003e\n     *\n     * @param superEquals  the result of calling \u003ccode\u003esuper.equals()\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 491,col 31)",
        "(line 492,col 9)-(line 492,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(java.lang.Object, java.lang.Object)",
      "begin_line": 505,
      "end_line": 547,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003eObject\u003c/code\u003es are equal using their\n     * \u003ccode\u003eequals\u003c/code\u003e method.\u003c/p\u003e\n     *\n     * @param lhs  the left hand object\n     * @param rhs  the right hand object\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 516,col 43)",
        "(line 517,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(long, long)",
      "begin_line": 560,
      "end_line": 566,
      "comment": "\n     * \u003cp\u003e\n     * Test if two \u003ccode\u003elong\u003c/code\u003e s are equal.\n     * \u003c/p\u003e\n     * \n     * @param lhs\n     *                  the left hand \u003ccode\u003elong\u003c/code\u003e\n     * @param rhs\n     *                  the right hand \u003ccode\u003elong\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 563,col 9)",
        "(line 564,col 9)-(line 564,col 32)",
        "(line 565,col 9)-(line 565,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(int, int)",
      "begin_line": 575,
      "end_line": 581,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003eint\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eint\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eint\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 578,col 9)",
        "(line 579,col 9)-(line 579,col 32)",
        "(line 580,col 9)-(line 580,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(short, short)",
      "begin_line": 590,
      "end_line": 596,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003eshort\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eshort\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eshort\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 593,col 9)",
        "(line 594,col 9)-(line 594,col 32)",
        "(line 595,col 9)-(line 595,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(char, char)",
      "begin_line": 605,
      "end_line": 611,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003echar\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003echar\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003echar\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 608,col 9)",
        "(line 609,col 9)-(line 609,col 32)",
        "(line 610,col 9)-(line 610,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(byte, byte)",
      "begin_line": 620,
      "end_line": 626,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003ebyte\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003ebyte\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003ebyte\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 624,col 32)",
        "(line 625,col 9)-(line 625,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(double, double)",
      "begin_line": 641,
      "end_line": 646,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003edouble\u003c/code\u003es are equal by testing that the\n     * pattern of bits returned by \u003ccode\u003edoubleToLong\u003c/code\u003e are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis handles NaNs, Infinities, and \u003ccode\u003e-0.0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt is compatible with the hash code generated by\n     * \u003ccode\u003eHashCodeBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003edouble\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003edouble\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 644,col 9)",
        "(line 645,col 9)-(line 645,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(float, float)",
      "begin_line": 661,
      "end_line": 666,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003efloat\u003c/code\u003es are equal byt testing that the\n     * pattern of bits returned by doubleToLong are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis handles NaNs, Infinities, and \u003ccode\u003e-0.0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt is compatible with the hash code generated by\n     * \u003ccode\u003eHashCodeBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003efloat\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003efloat\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 665,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(boolean, boolean)",
      "begin_line": 675,
      "end_line": 681,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003ebooleans\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eboolean\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eboolean\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n      ",
      "child_ranges": [
        "(line 676,col 9)-(line 678,col 9)",
        "(line 679,col 9)-(line 679,col 32)",
        "(line 680,col 9)-(line 680,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(java.lang.Object[], java.lang.Object[])",
      "begin_line": 693,
      "end_line": 712,
      "comment": "\n     * \u003cp\u003ePerforms a deep comparison of two \u003ccode\u003eObject\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis also will be called for the top level of\n     * multi-dimensional, ragged, and multi-typed arrays.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eObject[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eObject[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 699,col 9)",
        "(line 700,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 711,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(long[], long[])",
      "begin_line": 724,
      "end_line": 743,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003elong\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(long, long)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003elong[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003elong[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 727,col 9)",
        "(line 728,col 9)-(line 730,col 9)",
        "(line 731,col 9)-(line 734,col 9)",
        "(line 735,col 9)-(line 738,col 9)",
        "(line 739,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 742,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(int[], int[])",
      "begin_line": 755,
      "end_line": 774,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003eint\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(int, int)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eint[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eint[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 758,col 9)",
        "(line 759,col 9)-(line 761,col 9)",
        "(line 762,col 9)-(line 765,col 9)",
        "(line 766,col 9)-(line 769,col 9)",
        "(line 770,col 9)-(line 772,col 9)",
        "(line 773,col 9)-(line 773,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(short[], short[])",
      "begin_line": 786,
      "end_line": 805,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003eshort\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(short, short)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eshort[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eshort[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 789,col 9)",
        "(line 790,col 9)-(line 792,col 9)",
        "(line 793,col 9)-(line 796,col 9)",
        "(line 797,col 9)-(line 800,col 9)",
        "(line 801,col 9)-(line 803,col 9)",
        "(line 804,col 9)-(line 804,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(char[], char[])",
      "begin_line": 817,
      "end_line": 836,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003echar\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(char, char)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003echar[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003echar[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 820,col 9)",
        "(line 821,col 9)-(line 823,col 9)",
        "(line 824,col 9)-(line 827,col 9)",
        "(line 828,col 9)-(line 831,col 9)",
        "(line 832,col 9)-(line 834,col 9)",
        "(line 835,col 9)-(line 835,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(byte[], byte[])",
      "begin_line": 848,
      "end_line": 867,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003ebyte\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(byte, byte)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003ebyte[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003ebyte[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 851,col 9)",
        "(line 852,col 9)-(line 854,col 9)",
        "(line 855,col 9)-(line 858,col 9)",
        "(line 859,col 9)-(line 862,col 9)",
        "(line 863,col 9)-(line 865,col 9)",
        "(line 866,col 9)-(line 866,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(double[], double[])",
      "begin_line": 879,
      "end_line": 898,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003edouble\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(double, double)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003edouble[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003edouble[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 880,col 9)-(line 882,col 9)",
        "(line 883,col 9)-(line 885,col 9)",
        "(line 886,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 893,col 9)",
        "(line 894,col 9)-(line 896,col 9)",
        "(line 897,col 9)-(line 897,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(float[], float[])",
      "begin_line": 910,
      "end_line": 929,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003efloat\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(float, float)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003efloat[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003efloat[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 911,col 9)-(line 913,col 9)",
        "(line 914,col 9)-(line 916,col 9)",
        "(line 917,col 9)-(line 920,col 9)",
        "(line 921,col 9)-(line 924,col 9)",
        "(line 925,col 9)-(line 927,col 9)",
        "(line 928,col 9)-(line 928,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(boolean[], boolean[])",
      "begin_line": 941,
      "end_line": 960,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003eboolean\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(boolean, boolean)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eboolean[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eboolean[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 944,col 9)",
        "(line 945,col 9)-(line 947,col 9)",
        "(line 948,col 9)-(line 951,col 9)",
        "(line 952,col 9)-(line 955,col 9)",
        "(line 956,col 9)-(line 958,col 9)",
        "(line 959,col 9)-(line 959,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.isEquals()",
      "begin_line": 968,
      "end_line": 970,
      "comment": "\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if the fields that have been checked\n     * are all equal.\u003c/p\u003e\n     *\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 969,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.build()",
      "begin_line": 981,
      "end_line": 983,
      "comment": "\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if the fields that have been checked\n     * are all equal.\u003c/p\u003e\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if all of the fields that have been checked\n     *         are equal, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *         \n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 982,col 9)-(line 982,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.setEquals(boolean)",
      "begin_line": 991,
      "end_line": 993,
      "comment": "\n     * Sets the \u003ccode\u003eisEquals\u003c/code\u003e value.\n     * \n     * @param isEquals The value to set.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 992,col 9)-(line 992,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reset()",
      "begin_line": 999,
      "end_line": 1001,
      "comment": "\n     * Reset the EqualsBuilder so you can use the same object again\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 1000,col 9)-(line 1000,col 29)"
      ]
    }
  ]
}