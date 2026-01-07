{
  "filepath": "/tmp/Lang-26b/src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EqualsBuilder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.Builder\u003cjava.lang.Boolean\u003e"
      ],
      "begin_line": 89,
      "end_line": 1001,
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
        "(line 143,col 9)-(line 143,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.isRegistered(java.lang.Object, java.lang.Object)",
      "begin_line": 159,
      "end_line": 166,
      "comment": "\n     * \u003cp\u003e\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given object pair.\n     * Used by the reflection methods to avoid infinite loops.\n     * Objects might be swapped therefore a check is needed if the object pair\n     * is registered in given or swapped order.\n     * \u003c/p\u003e\n     * \n     * @param lhs \u003ccode\u003ethis\u003c/code\u003e object to lookup in registry\n     * @param rhs the other object to lookup on registry\n     * @return boolean \u003ccode\u003etrue\u003c/code\u003e if the registry contains the given object.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 57)",
        "(line 161,col 9)-(line 161,col 60)",
        "(line 162,col 9)-(line 162,col 72)",
        "(line 164,col 9)-(line 165,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.register(java.lang.Object, java.lang.Object)",
      "begin_line": 177,
      "end_line": 187,
      "comment": "\n     * \u003cp\u003e\n     * Registers the given object pair.\n     * Used by the reflection methods to avoid infinite loops.\n     * \u003c/p\u003e\n     * \n     * @param lhs \u003ccode\u003ethis\u003c/code\u003e object to register\n     * @param rhs the other object to register\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 182,col 9)",
        "(line 184,col 9)-(line 184,col 57)",
        "(line 185,col 9)-(line 185,col 60)",
        "(line 186,col 9)-(line 186,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.unregister(java.lang.Object, java.lang.Object)",
      "begin_line": 201,
      "end_line": 214,
      "comment": "\n     * \u003cp\u003e\n     * Unregisters the given object pair.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Used by the reflection methods to avoid infinite loops.\n     * \n     * @param lhs \u003ccode\u003ethis\u003c/code\u003e object to unregister\n     * @param rhs the other object to unregister\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 57)",
        "(line 203,col 9)-(line 213,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "isEquals"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": "\n     * If the fields tested are equals.\n     * The default value is \u003ccode\u003etrue\u003c/code\u003e.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.EqualsBuilder()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * \u003cp\u003eConstructor for EqualsBuilder.\u003c/p\u003e\n     *\n     * \u003cp\u003eStarts off assuming that equals is \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     * @see Object#equals(Object)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object)",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eTransient members will be not be tested, as they are likely derived\n     * fields, and not part of the value of the Object.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eTransient members will be not be tested, as they are likely derived\n     * fields, and not part of the value of the Object.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param excludeFields  Collection of String field names to exclude from testing\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, java.lang.String[])",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eTransient members will be not be tested, as they are likely derived\n     * fields, and not part of the value of the Object.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param excludeFields  array of field names to exclude from testing\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, boolean)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the TestTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient\n     * members will be tested, otherwise they are ignored, as they are likely\n     * derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be tested. Superclass fields will be included.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param testTransients  whether to include transient fields\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, boolean, java.lang.Class\u003c?\u003e)",
      "begin_line": 351,
      "end_line": 353,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the testTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient\n     * members will be tested, otherwise they are ignored, as they are likely\n     * derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be included. Superclass fields will be appended\n     * up to and including the specified superclass. A null superclass is treated\n     * as java.lang.Object.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param testTransients  whether to include transient fields\n     * @param reflectUpToClass  the superclass to reflect up to (inclusive),\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(java.lang.Object, java.lang.Object, boolean, java.lang.Class\u003c?\u003e, java.lang.String[])",
      "begin_line": 381,
      "end_line": 428,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to determine if the two \u003ccode\u003eObject\u003c/code\u003es\n     * are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run under\n     * a security manager, if the permissions are not set up correctly. It is also\n     * not as efficient as testing explicitly.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the testTransients parameter is set to \u003ccode\u003etrue\u003c/code\u003e, transient\n     * members will be tested, otherwise they are ignored, as they are likely\n     * derived fields, and not part of the value of the \u003ccode\u003eObject\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eStatic fields will not be included. Superclass fields will be appended\n     * up to and including the specified superclass. A null superclass is treated\n     * as java.lang.Object.\u003c/p\u003e\n     *\n     * @param lhs  \u003ccode\u003ethis\u003c/code\u003e object\n     * @param rhs  the other object\n     * @param testTransients  whether to include transient fields\n     * @param reflectUpToClass  the superclass to reflect up to (inclusive),\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param excludeFields  array of field names to exclude from testing\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the two Objects have tested equals.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 388,col 9)",
        "(line 393,col 9)-(line 393,col 43)",
        "(line 394,col 9)-(line 394,col 43)",
        "(line 395,col 9)-(line 395,col 27)",
        "(line 396,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 58)",
        "(line 413,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reflectionAppend(java.lang.Object, java.lang.Object, java.lang.Class\u003c?\u003e, org.apache.commons.lang3.builder.EqualsBuilder, boolean, java.lang.String[])",
      "begin_line": 441,
      "end_line": 475,
      "comment": "\n     * \u003cp\u003eAppends the fields and values defined by the given object of the\n     * given Class.\u003c/p\u003e\n     * \n     * @param lhs  the left hand object\n     * @param rhs  the right hand object\n     * @param clazz  the class to append details of\n     * @param builder  the builder to append to\n     * @param useTransients  whether to test transient fields\n     * @param excludeFields  array of field names to exclude from testing\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 451,col 9)",
        "(line 453,col 9)-(line 474,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.appendSuper(boolean)",
      "begin_line": 486,
      "end_line": 492,
      "comment": "\n     * \u003cp\u003eAdds the result of \u003ccode\u003esuper.equals()\u003c/code\u003e to this builder.\u003c/p\u003e\n     *\n     * @param superEquals  the result of calling \u003ccode\u003esuper.equals()\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 31)",
        "(line 491,col 9)-(line 491,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(java.lang.Object, java.lang.Object)",
      "begin_line": 504,
      "end_line": 546,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003eObject\u003c/code\u003es are equal using their\n     * \u003ccode\u003eequals\u003c/code\u003e method.\u003c/p\u003e\n     *\n     * @param lhs  the left hand object\n     * @param rhs  the right hand object\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 43)",
        "(line 516,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 545,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(long, long)",
      "begin_line": 559,
      "end_line": 565,
      "comment": "\n     * \u003cp\u003e\n     * Test if two \u003ccode\u003elong\u003c/code\u003e s are equal.\n     * \u003c/p\u003e\n     * \n     * @param lhs\n     *                  the left hand \u003ccode\u003elong\u003c/code\u003e\n     * @param rhs\n     *                  the right hand \u003ccode\u003elong\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 563,col 32)",
        "(line 564,col 9)-(line 564,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(int, int)",
      "begin_line": 574,
      "end_line": 580,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003eint\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eint\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eint\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 32)",
        "(line 579,col 9)-(line 579,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(short, short)",
      "begin_line": 589,
      "end_line": 595,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003eshort\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eshort\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eshort\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 593,col 32)",
        "(line 594,col 9)-(line 594,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(char, char)",
      "begin_line": 604,
      "end_line": 610,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003echar\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003echar\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003echar\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 607,col 9)",
        "(line 608,col 9)-(line 608,col 32)",
        "(line 609,col 9)-(line 609,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(byte, byte)",
      "begin_line": 619,
      "end_line": 625,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003ebyte\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003ebyte\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003ebyte\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 623,col 32)",
        "(line 624,col 9)-(line 624,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(double, double)",
      "begin_line": 640,
      "end_line": 645,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003edouble\u003c/code\u003es are equal by testing that the\n     * pattern of bits returned by \u003ccode\u003edoubleToLong\u003c/code\u003e are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis handles NaNs, Infinities, and \u003ccode\u003e-0.0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt is compatible with the hash code generated by\n     * \u003ccode\u003eHashCodeBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003edouble\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003edouble\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 643,col 9)",
        "(line 644,col 9)-(line 644,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(float, float)",
      "begin_line": 660,
      "end_line": 665,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003efloat\u003c/code\u003es are equal byt testing that the\n     * pattern of bits returned by doubleToLong are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis handles NaNs, Infinities, and \u003ccode\u003e-0.0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt is compatible with the hash code generated by\n     * \u003ccode\u003eHashCodeBuilder\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003efloat\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003efloat\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 664,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(boolean, boolean)",
      "begin_line": 674,
      "end_line": 680,
      "comment": "\n     * \u003cp\u003eTest if two \u003ccode\u003ebooleans\u003c/code\u003es are equal.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eboolean\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eboolean\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n      ",
      "child_ranges": [
        "(line 675,col 9)-(line 677,col 9)",
        "(line 678,col 9)-(line 678,col 32)",
        "(line 679,col 9)-(line 679,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(java.lang.Object[], java.lang.Object[])",
      "begin_line": 692,
      "end_line": 711,
      "comment": "\n     * \u003cp\u003ePerforms a deep comparison of two \u003ccode\u003eObject\u003c/code\u003e arrays.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis also will be called for the top level of\n     * multi-dimensional, ragged, and multi-typed arrays.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eObject[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eObject[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 698,col 9)",
        "(line 699,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 706,col 9)",
        "(line 707,col 9)-(line 709,col 9)",
        "(line 710,col 9)-(line 710,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(long[], long[])",
      "begin_line": 723,
      "end_line": 742,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003elong\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(long, long)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003elong[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003elong[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 724,col 9)-(line 726,col 9)",
        "(line 727,col 9)-(line 729,col 9)",
        "(line 730,col 9)-(line 733,col 9)",
        "(line 734,col 9)-(line 737,col 9)",
        "(line 738,col 9)-(line 740,col 9)",
        "(line 741,col 9)-(line 741,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(int[], int[])",
      "begin_line": 754,
      "end_line": 773,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003eint\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(int, int)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eint[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eint[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 757,col 9)",
        "(line 758,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 764,col 9)",
        "(line 765,col 9)-(line 768,col 9)",
        "(line 769,col 9)-(line 771,col 9)",
        "(line 772,col 9)-(line 772,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(short[], short[])",
      "begin_line": 785,
      "end_line": 804,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003eshort\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(short, short)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eshort[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eshort[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 786,col 9)-(line 788,col 9)",
        "(line 789,col 9)-(line 791,col 9)",
        "(line 792,col 9)-(line 795,col 9)",
        "(line 796,col 9)-(line 799,col 9)",
        "(line 800,col 9)-(line 802,col 9)",
        "(line 803,col 9)-(line 803,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(char[], char[])",
      "begin_line": 816,
      "end_line": 835,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003echar\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(char, char)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003echar[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003echar[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 819,col 9)",
        "(line 820,col 9)-(line 822,col 9)",
        "(line 823,col 9)-(line 826,col 9)",
        "(line 827,col 9)-(line 830,col 9)",
        "(line 831,col 9)-(line 833,col 9)",
        "(line 834,col 9)-(line 834,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(byte[], byte[])",
      "begin_line": 847,
      "end_line": 866,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003ebyte\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(byte, byte)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003ebyte[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003ebyte[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 848,col 9)-(line 850,col 9)",
        "(line 851,col 9)-(line 853,col 9)",
        "(line 854,col 9)-(line 857,col 9)",
        "(line 858,col 9)-(line 861,col 9)",
        "(line 862,col 9)-(line 864,col 9)",
        "(line 865,col 9)-(line 865,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(double[], double[])",
      "begin_line": 878,
      "end_line": 897,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003edouble\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(double, double)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003edouble[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003edouble[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 879,col 9)-(line 881,col 9)",
        "(line 882,col 9)-(line 884,col 9)",
        "(line 885,col 9)-(line 888,col 9)",
        "(line 889,col 9)-(line 892,col 9)",
        "(line 893,col 9)-(line 895,col 9)",
        "(line 896,col 9)-(line 896,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(float[], float[])",
      "begin_line": 909,
      "end_line": 928,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003efloat\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(float, float)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003efloat[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003efloat[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 912,col 9)",
        "(line 913,col 9)-(line 915,col 9)",
        "(line 916,col 9)-(line 919,col 9)",
        "(line 920,col 9)-(line 923,col 9)",
        "(line 924,col 9)-(line 926,col 9)",
        "(line 927,col 9)-(line 927,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.append(boolean[], boolean[])",
      "begin_line": 940,
      "end_line": 959,
      "comment": "\n     * \u003cp\u003eDeep comparison of array of \u003ccode\u003eboolean\u003c/code\u003e. Length and all\n     * values are compared.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe method {@link #append(boolean, boolean)} is used.\u003c/p\u003e\n     *\n     * @param lhs  the left hand \u003ccode\u003eboolean[]\u003c/code\u003e\n     * @param rhs  the right hand \u003ccode\u003eboolean[]\u003c/code\u003e\n     * @return EqualsBuilder - used to chain calls.\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 943,col 9)",
        "(line 944,col 9)-(line 946,col 9)",
        "(line 947,col 9)-(line 950,col 9)",
        "(line 951,col 9)-(line 954,col 9)",
        "(line 955,col 9)-(line 957,col 9)",
        "(line 958,col 9)-(line 958,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.isEquals()",
      "begin_line": 967,
      "end_line": 969,
      "comment": "\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if the fields that have been checked\n     * are all equal.\u003c/p\u003e\n     *\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 968,col 9)-(line 968,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.build()",
      "begin_line": 980,
      "end_line": 982,
      "comment": "\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if the fields that have been checked\n     * are all equal.\u003c/p\u003e\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if all of the fields that have been checked\n     *         are equal, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *         \n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 981,col 9)-(line 981,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.setEquals(boolean)",
      "begin_line": 990,
      "end_line": 992,
      "comment": "\n     * Sets the \u003ccode\u003eisEquals\u003c/code\u003e value.\n     * \n     * @param isEquals The value to set.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 991,col 9)-(line 991,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilder.reset()",
      "begin_line": 998,
      "end_line": 1000,
      "comment": "\n     * Reset the EqualsBuilder so you can use the same object again\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 999,col 9)-(line 999,col 29)"
      ]
    }
  ]
}