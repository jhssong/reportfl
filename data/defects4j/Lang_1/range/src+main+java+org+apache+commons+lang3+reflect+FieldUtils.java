{
  "filepath": "/tmp/Lang-1b/src/main/java/org/apache/commons/lang3/reflect/FieldUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 761,
      "comment": "\n * Utilities for working with fields by reflection. Adapted and refactored from the dormant [reflect] Commons sandbox\n * component.\n * \u003cp\u003e\n * The ability is provided to break the scoping restrictions coded by the programmer. This can allow fields to be\n * changed that shouldn\u0027t be. This facility should be used with care.\n * \n * @since 2.5\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.FieldUtils()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * FieldUtils instances should NOT be constructed in standard programming.\n     * \u003cp\u003e\n     * This constructor is public to permit tools that require a JavaBean instance to operate.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.getField(java.lang.Class\u003c?\u003e, java.lang.String)",
      "begin_line": 58,
      "end_line": 62,
      "comment": "\n     * Gets an accessible \u003ccode\u003eField\u003c/code\u003e by name respecting scope. Superclasses/interfaces will be considered.\n     * \n     * @param cls\n     *            the class to reflect, must not be null\n     * @param fieldName\n     *            the field name to obtain\n     * @return the Field object\n     * @throws IllegalArgumentException\n     *             if the class or field name is null\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 60)",
        "(line 60,col 9)-(line 60,col 51)",
        "(line 61,col 9)-(line 61,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.getField(java.lang.Class\u003c?\u003e, java.lang.String, boolean)",
      "begin_line": 79,
      "end_line": 134,
      "comment": "\n     * Gets an accessible \u003ccode\u003eField\u003c/code\u003e by name breaking scope if requested. Superclasses/interfaces will be\n     * considered.\n     * \n     * @param cls\n     *            the class to reflect, must not be null\n     * @param fieldName\n     *            the field name to obtain\n     * @param forceAccess\n     *            whether to break scope restrictions using the \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e\n     *            will only match public fields.\n     * @return the Field object\n     * @throws IllegalArgumentException\n     *             if the class or field name is null\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 100,col 9)-(line 116,col 9)",
        "(line 120,col 9)-(line 120,col 27)",
        "(line 121,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(java.lang.Class\u003c?\u003e, java.lang.String)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * Gets an accessible \u003ccode\u003eField\u003c/code\u003e by name respecting scope. Only the specified class will be considered.\n     * \n     * @param cls\n     *            the class to reflect, must not be null\n     * @param fieldName\n     *            the field name to obtain\n     * @return the Field object\n     * @throws IllegalArgumentException\n     *             if the class or field name is null\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(java.lang.Class\u003c?\u003e, java.lang.String, boolean)",
      "begin_line": 166,
      "end_line": 188,
      "comment": "\n     * Gets an accessible \u003ccode\u003eField\u003c/code\u003e by name breaking scope if requested. Only the specified class will be\n     * considered.\n     * \n     * @param cls\n     *            the class to reflect, must not be null\n     * @param fieldName\n     *            the field name to obtain\n     * @param forceAccess\n     *            whether to break scope restrictions using the \u003ccode\u003esetAccessible\u003c/code\u003e method. False will only\n     *            match public fields.\n     * @return the Field object\n     * @throws IllegalArgumentException\n     *             if the class or field name is null\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.getAllFields(java.lang.Class\u003c?\u003e)",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\n     * Gets all fields of the given class and its parents (if any).\n     * \n     * @param cls\n     *            the class to query\n     * @return an array of Fields (maybe an empty array).\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 64)",
        "(line 200,col 9)-(line 200,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.getAllFieldsList(java.lang.Class\u003c?\u003e)",
      "begin_line": 211,
      "end_line": 225,
      "comment": "\n     * Gets all fields of the given class and its parents (if any).\n     * \n     * @param cls\n     *            the class to query\n     * @return an array of Fields (maybe an empty array).\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 55)",
        "(line 216,col 9)-(line 216,col 36)",
        "(line 217,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.reflect.Field)",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * Reads an accessible static Field.\n     * \n     * @param field\n     *            to read\n     * @return the field value\n     * @throws IllegalArgumentException\n     *             if the field is null or not static\n     * @throws IllegalAccessException\n     *             if the field is not accessible\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.reflect.Field, boolean)",
      "begin_line": 255,
      "end_line": 263,
      "comment": "\n     * Reads a static Field.\n     * \n     * @param field\n     *            to read\n     * @param forceAccess\n     *            whether to break scope restrictions using the \u003ccode\u003esetAccessible\u003c/code\u003e method.\n     * @return the field value\n     * @throws IllegalArgumentException\n     *             if the field is null or not static\n     * @throws IllegalAccessException\n     *             if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.Class\u003c?\u003e, java.lang.String)",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\n     * Reads the named public static field. Superclasses will be considered.\n     * \n     * @param cls\n     *            the class to reflect, must not be null\n     * @param fieldName\n     *            the field name to obtain\n     * @return the value of the field\n     * @throws IllegalArgumentException\n     *             if the class is null, the field name is null or if the field could not be found\n     * @throws IllegalAccessException\n     *             if the field is not accessible\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.Class\u003c?\u003e, java.lang.String, boolean)",
      "begin_line": 298,
      "end_line": 305,
      "comment": "\n     * Reads the named static field. Superclasses will be considered.\n     * \n     * @param cls\n     *            the class to reflect, must not be null\n     * @param fieldName\n     *            the field name to obtain\n     * @param forceAccess\n     *            whether to break scope restrictions using the \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e\n     *            will only match public fields.\n     * @return the Field object\n     * @throws IllegalArgumentException\n     *             if the class is null, the field name is null or if the field could not be found\n     * @throws IllegalAccessException\n     *             if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 66)",
        "(line 300,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 304,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readDeclaredStaticField(java.lang.Class\u003c?\u003e, java.lang.String)",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * Gets a static Field value by name. The field must be public. Only the specified class will be considered.\n     * \n     * @param cls\n     *            the class to reflect, must not be null\n     * @param fieldName\n     *            the field name to obtain\n     * @return the value of the field\n     * @throws IllegalArgumentException\n     *             if the class is null, the field name is null or if the field could not be found\n     * @throws IllegalAccessException\n     *             if the field is not accessible\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readDeclaredStaticField(java.lang.Class\u003c?\u003e, java.lang.String, boolean)",
      "begin_line": 340,
      "end_line": 347,
      "comment": "\n     * Gets a static Field value by name. Only the specified class will be considered.\n     * \n     * @param cls\n     *            the class to reflect, must not be null\n     * @param fieldName\n     *            the field name to obtain\n     * @param forceAccess\n     *            whether to break scope restrictions using the \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e\n     *            will only match public fields.\n     * @return the Field object\n     * @throws IllegalArgumentException\n     *             if the class is null, the field name is null or if the field could not be found\n     * @throws IllegalAccessException\n     *             if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 74)",
        "(line 342,col 9)-(line 344,col 9)",
        "(line 346,col 9)-(line 346,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.reflect.Field, java.lang.Object)",
      "begin_line": 362,
      "end_line": 364,
      "comment": "\n     * Reads an accessible Field.\n     * \n     * @param field\n     *            the field to use\n     * @param target\n     *            the object to call on, may be null for static fields\n     * @return the field value\n     * @throws IllegalArgumentException\n     *             if the field is null\n     * @throws IllegalAccessException\n     *             if the field is not accessible\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.reflect.Field, java.lang.Object, boolean)",
      "begin_line": 381,
      "end_line": 391,
      "comment": "\n     * Reads a Field.\n     * \n     * @param field\n     *            the field to use\n     * @param target\n     *            the object to call on, may be null for static fields\n     * @param forceAccess\n     *            whether to break scope restrictions using the \u003ccode\u003esetAccessible\u003c/code\u003e method.\n     * @return the field value\n     * @throws IllegalArgumentException\n     *             if the field is null\n     * @throws IllegalAccessException\n     *             if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.Object, java.lang.String)",
      "begin_line": 406,
      "end_line": 408,
      "comment": "\n     * Reads the named public field. Superclasses will be considered.\n     * \n     * @param target\n     *            the object to reflect, must not be null\n     * @param fieldName\n     *            the field name to obtain\n     * @return the value of the field\n     * @throws IllegalArgumentException\n     *             if the class or field name is null\n     * @throws IllegalAccessException\n     *             if the named field is not public\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.Object, java.lang.String, boolean)",
      "begin_line": 426,
      "end_line": 437,
      "comment": "\n     * Reads the named field. Superclasses will be considered.\n     * \n     * @param target\n     *            the object to reflect, must not be null\n     * @param fieldName\n     *            the field name to obtain\n     * @param forceAccess\n     *            whether to break scope restrictions using the \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e\n     *            will only match public fields.\n     * @return the field value\n     * @throws IllegalArgumentException\n     *             if the class or field name is null\n     * @throws IllegalAccessException\n     *             if the named field is not made accessible\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 47)",
        "(line 431,col 9)-(line 431,col 66)",
        "(line 432,col 9)-(line 434,col 9)",
        "(line 436,col 9)-(line 436,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(java.lang.Object, java.lang.String)",
      "begin_line": 452,
      "end_line": 454,
      "comment": "\n     * Reads the named public field. Only the class of the specified object will be considered.\n     * \n     * @param target\n     *            the object to reflect, must not be null\n     * @param fieldName\n     *            the field name to obtain\n     * @return the value of the field\n     * @throws IllegalArgumentException\n     *             if the class or field name is null\n     * @throws IllegalAccessException\n     *             if the named field is not public\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(java.lang.Object, java.lang.String, boolean)",
      "begin_line": 472,
      "end_line": 483,
      "comment": "\n     * \u003cp\u003c\u003eGets a Field value by name. Only the class of the specified object will be considered.\n     * \n     * @param target\n     *            the object to reflect, must not be null\n     * @param fieldName\n     *            the field name to obtain\n     * @param forceAccess\n     *            whether to break scope restrictions using the \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e\n     *            will only match public fields.\n     * @return the Field object\n     * @throws IllegalArgumentException\n     *             if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException\n     *             if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 476,col 47)",
        "(line 477,col 9)-(line 477,col 74)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 482,col 9)-(line 482,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.reflect.Field, java.lang.Object)",
      "begin_line": 497,
      "end_line": 499,
      "comment": "\n     * Writes a public static Field.\n     * \n     * @param field\n     *            to write\n     * @param value\n     *            to set\n     * @throws IllegalArgumentException\n     *             if the field is null or not static\n     * @throws IllegalAccessException\n     *             if the field is not public or is final\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.reflect.Field, java.lang.Object, boolean)",
      "begin_line": 516,
      "end_line": 524,
      "comment": "\n     * Writes a static Field.\n     * \n     * @param field\n     *            to write\n     * @param value\n     *            to set\n     * @param forceAccess\n     *            whether to break scope restrictions using the \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e\n     *            will only match public fields.\n     * @throws IllegalArgumentException\n     *             if the field is null or not static\n     * @throws IllegalAccessException\n     *             if the field is not made accessible or is final\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object)",
      "begin_line": 540,
      "end_line": 542,
      "comment": "\n     * Writes a named public static Field. Superclasses will be considered.\n     * \n     * @param cls\n     *            Class on which the Field is to be found\n     * @param fieldName\n     *            to write\n     * @param value\n     *            to set\n     * @throws IllegalArgumentException\n     *             if the field cannot be located or is not static\n     * @throws IllegalAccessException\n     *             if the field is not public or is final\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 561,
      "end_line": 569,
      "comment": "\n     * Writes a named static Field. Superclasses will be considered.\n     * \n     * @param cls\n     *            Class on which the Field is to be found\n     * @param fieldName\n     *            to write\n     * @param value\n     *            to set\n     * @param forceAccess\n     *            whether to break scope restrictions using the \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e\n     *            will only match public fields.\n     * @throws IllegalArgumentException\n     *             if the field cannot be located or is not static\n     * @throws IllegalAccessException\n     *             if the field is not made accessible or is final\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 66)",
        "(line 564,col 9)-(line 566,col 9)",
        "(line 568,col 9)-(line 568,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object)",
      "begin_line": 585,
      "end_line": 587,
      "comment": "\n     * Writes a named public static Field. Only the specified class will be considered.\n     * \n     * @param cls\n     *            Class on which the Field is to be found\n     * @param fieldName\n     *            to write\n     * @param value\n     *            to set\n     * @throws IllegalArgumentException\n     *             if the field cannot be located or is not static\n     * @throws IllegalAccessException\n     *             if the field is not public or is final\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 606,
      "end_line": 614,
      "comment": "\n     * Writes a named static Field. Only the specified class will be considered.\n     * \n     * @param cls\n     *            Class on which the Field is to be found\n     * @param fieldName\n     *            to write\n     * @param value\n     *            to set\n     * @param forceAccess\n     *            whether to break scope restrictions using the \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e\n     *            will only match public fields.\n     * @throws IllegalArgumentException\n     *             if the field cannot be located or is not static\n     * @throws IllegalAccessException\n     *             if the field is not made accessible or is final\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 74)",
        "(line 609,col 9)-(line 611,col 9)",
        "(line 613,col 9)-(line 613,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.reflect.Field, java.lang.Object, java.lang.Object)",
      "begin_line": 630,
      "end_line": 632,
      "comment": "\n     * Writes an accessible field.\n     * \n     * @param field\n     *            to write\n     * @param target\n     *            the object to call on, may be null for static fields\n     * @param value\n     *            to set\n     * @throws IllegalArgumentException\n     *             if the field is null\n     * @throws IllegalAccessException\n     *             if the field is not accessible or is final\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.reflect.Field, java.lang.Object, java.lang.Object, boolean)",
      "begin_line": 651,
      "end_line": 662,
      "comment": "\n     * Writes a field.\n     * \n     * @param field\n     *            to write\n     * @param target\n     *            the object to call on, may be null for static fields\n     * @param value\n     *            to set\n     * @param forceAccess\n     *            whether to break scope restrictions using the \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e\n     *            will only match public fields.\n     * @throws IllegalArgumentException\n     *             if the field is null\n     * @throws IllegalAccessException\n     *             if the field is not made accessible or is final\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 660,col 9)",
        "(line 661,col 9)-(line 661,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.Object, java.lang.String, java.lang.Object)",
      "begin_line": 678,
      "end_line": 680,
      "comment": "\n     * Writes a public field. Superclasses will be considered.\n     * \n     * @param target\n     *            the object to reflect, must not be null\n     * @param fieldName\n     *            the field name to obtain\n     * @param value\n     *            to set\n     * @throws IllegalArgumentException\n     *             if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException\n     *             if the field is not accessible\n     ",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.Object, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 699,
      "end_line": 711,
      "comment": "\n     * Writes a field. Superclasses will be considered.\n     * \n     * @param target\n     *            the object to reflect, must not be null\n     * @param fieldName\n     *            the field name to obtain\n     * @param value\n     *            to set\n     * @param forceAccess\n     *            whether to break scope restrictions using the \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e\n     *            will only match public fields.\n     * @throws IllegalArgumentException\n     *             if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException\n     *             if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 704,col 47)",
        "(line 705,col 9)-(line 705,col 66)",
        "(line 706,col 9)-(line 708,col 9)",
        "(line 710,col 9)-(line 710,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(java.lang.Object, java.lang.String, java.lang.Object)",
      "begin_line": 727,
      "end_line": 729,
      "comment": "\n     * Writes a public field. Only the specified class will be considered.\n     * \n     * @param target\n     *            the object to reflect, must not be null\n     * @param fieldName\n     *            the field name to obtain\n     * @param value\n     *            to set\n     * @throws IllegalArgumentException\n     *             if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException\n     *             if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(java.lang.Object, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 748,
      "end_line": 760,
      "comment": "\n     * Writes a public field. Only the specified class will be considered.\n     * \n     * @param target\n     *            the object to reflect, must not be null\n     * @param fieldName\n     *            the field name to obtain\n     * @param value\n     *            to set\n     * @param forceAccess\n     *            whether to break scope restrictions using the \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e\n     *            will only match public fields.\n     * @throws IllegalArgumentException\n     *             if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException\n     *             if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 752,col 9)",
        "(line 753,col 9)-(line 753,col 47)",
        "(line 754,col 9)-(line 754,col 74)",
        "(line 755,col 9)-(line 757,col 9)",
        "(line 759,col 9)-(line 759,col 41)"
      ]
    }
  ]
}