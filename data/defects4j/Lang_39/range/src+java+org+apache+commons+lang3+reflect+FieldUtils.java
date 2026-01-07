{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/reflect/FieldUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 599,
      "comment": "\n * Utilities for working with fields by reflection. Adapted and refactored\n * from the dormant [reflect] Commons sandbox component.\n * \u003cp\u003e\n * The ability is provided to break the scoping restrictions coded by the\n * programmer. This can allow fields to be changed that shouldn\u0027t be. This\n * facility should be used with care.\n *\n * @author Apache Software Foundation\n * @author Matt Benson\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.FieldUtils()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * FieldUtils instances should NOT be constructed in standard programming.\n     * \u003cp\u003e\n     * This constructor is public to permit tools that require a JavaBean instance\n     * to operate.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.getField(java.lang.Class\u003c?\u003e, java.lang.String)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n     * Gets an accessible \u003ccode\u003eField\u003c/code\u003e by name repecting scope.\n     * Superclasses/interfaces will be considered.\n     *\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @return the Field object\n     * @throws IllegalArgumentException if the class or field name is null\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 54)",
        "(line 61,col 9)-(line 61,col 51)",
        "(line 62,col 9)-(line 62,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.getField(java.lang.Class\u003c?\u003e, java.lang.String, boolean)",
      "begin_line": 77,
      "end_line": 137,
      "comment": "\n     * Gets an accessible \u003ccode\u003eField\u003c/code\u003e by name breaking scope\n     * if requested. Superclasses/interfaces will be considered.\n     *\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @return the Field object\n     * @throws IllegalArgumentException if the class or field name is null\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 98,col 9)-(line 114,col 9)",
        "(line 118,col 9)-(line 118,col 27)",
        "(line 119,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(java.lang.Class\u003c?\u003e, java.lang.String)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Gets an accessible \u003ccode\u003eField\u003c/code\u003e by name respecting scope.\n     * Only the specified class will be considered.\n     *\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @return the Field object\n     * @throws IllegalArgumentException if the class or field name is null\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(java.lang.Class\u003c?\u003e, java.lang.String, boolean)",
      "begin_line": 163,
      "end_line": 184,
      "comment": "\n     * Gets an accessible \u003ccode\u003eField\u003c/code\u003e by name breaking scope\n     * if requested. Only the specified class will be considered.\n     *\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. False will only match public fields.\n     * @return the Field object\n     * @throws IllegalArgumentException if the class or field name is null\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.reflect.Field)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Read an accessible static Field.\n     * @param field to read\n     * @return the field value\n     * @throws IllegalArgumentException if the field is null or not static\n     * @throws IllegalAccessException if the field is not accessible\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.reflect.Field, boolean)",
      "begin_line": 206,
      "end_line": 214,
      "comment": "\n     * Read a static Field.\n     * @param field to read\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method.\n     * @return the field value\n     * @throws IllegalArgumentException if the field is null or not static\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.Class\u003c?\u003e, java.lang.String)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Read the named public static field. Superclasses will be considered.\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @return the value of the field\n     * @throws IllegalArgumentException if the class or field name is null\n     * @throws IllegalAccessException if the field is not accessible\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.Class\u003c?\u003e, java.lang.String, boolean)",
      "begin_line": 239,
      "end_line": 246,
      "comment": "\n     * Read the named static field. Superclasses will be considered.\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @return the Field object\n     * @throws IllegalArgumentException if the class or field name is null\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 60)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 245,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readDeclaredStaticField(java.lang.Class\u003c?\u003e, java.lang.String)",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\n     * Gets a static Field value by name. The field must be public.\n     * Only the specified class will be considered.\n     *\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @return the value of the field\n     * @throws IllegalArgumentException if the class or field name is null\n     * @throws IllegalAccessException if the field is not accessible\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readDeclaredStaticField(java.lang.Class\u003c?\u003e, java.lang.String, boolean)",
      "begin_line": 275,
      "end_line": 283,
      "comment": "\n     * Gets a static Field value by name. Only the specified class will\n     * be considered.\n     *\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @return the Field object\n     * @throws IllegalArgumentException if the class or field name is null\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 68)",
        "(line 278,col 9)-(line 280,col 9)",
        "(line 282,col 9)-(line 282,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.reflect.Field, java.lang.Object)",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n     * Read an accessible Field.\n     * @param field  the field to use\n     * @param target  the object to call on, may be null for static fields\n     * @return the field value\n     * @throws IllegalArgumentException if the field is null\n     * @throws IllegalAccessException if the field is not accessible\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.reflect.Field, java.lang.Object, boolean)",
      "begin_line": 307,
      "end_line": 317,
      "comment": "\n     * Read a Field.\n     * @param field  the field to use\n     * @param target  the object to call on, may be null for static fields\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method.\n     * @return the field value\n     * @throws IllegalArgumentException if the field is null\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.Object, java.lang.String)",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\n     * Read the named public field. Superclasses will be considered.\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @return the value of the field\n     * @throws IllegalArgumentException if the class or field name is null\n     * @throws IllegalAccessException if the named field is not public\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.Object, java.lang.String, boolean)",
      "begin_line": 342,
      "end_line": 353,
      "comment": "\n     * Read the named field. Superclasses will be considered.\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @return the field value\n     * @throws IllegalArgumentException if the class or field name is null\n     * @throws IllegalAccessException if the named field is not made accessible\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 41)",
        "(line 347,col 9)-(line 347,col 60)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 352,col 9)-(line 352,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(java.lang.Object, java.lang.String)",
      "begin_line": 363,
      "end_line": 365,
      "comment": "\n     * Read the named public field. Only the class of the specified object will be considered.\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @return the value of the field\n     * @throws IllegalArgumentException if the class or field name is null\n     * @throws IllegalAccessException if the named field is not public\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(java.lang.Object, java.lang.String, boolean)",
      "begin_line": 380,
      "end_line": 391,
      "comment": "\n     * \u003cp\u003c\u003eGets a Field value by name. Only the class of the specified\n     * object will be considered.\n     *\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @return the Field object\n     * @throws IllegalArgumentException if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 384,col 41)",
        "(line 385,col 9)-(line 385,col 68)",
        "(line 386,col 9)-(line 388,col 9)",
        "(line 390,col 9)-(line 390,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.reflect.Field, java.lang.Object)",
      "begin_line": 400,
      "end_line": 402,
      "comment": "\n     * Write a public static Field.\n     * @param field to write\n     * @param value to set\n     * @throws IllegalArgumentException if the field is null or not static\n     * @throws IllegalAccessException if the field is not public or is final\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.reflect.Field, java.lang.Object, boolean)",
      "begin_line": 414,
      "end_line": 422,
      "comment": "\n     * Write a static Field.\n     * @param field to write\n     * @param value to set\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @throws IllegalArgumentException if the field is null or not static\n     * @throws IllegalAccessException if the field is not made accessible or is final\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object)",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\n     * Write a named public static Field. Superclasses will be considered.\n     * @param cls Class on which the Field is to be found\n     * @param fieldName to write\n     * @param value to set\n     * @throws IllegalArgumentException if the field cannot be located or is not static\n     * @throws IllegalAccessException if the field is not public or is final\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 447,
      "end_line": 455,
      "comment": "\n     * Write a named static Field. Superclasses will be considered.\n     * @param cls Class on which the Field is to be found\n     * @param fieldName to write\n     * @param value to set\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @throws IllegalArgumentException if the field cannot be located or is not static\n     * @throws IllegalAccessException if the field is not made accessible or is final\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 60)",
        "(line 450,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 454,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object)",
      "begin_line": 465,
      "end_line": 468,
      "comment": "\n     * Write a named public static Field. Only the specified class will be considered.\n     * @param cls Class on which the Field is to be found\n     * @param fieldName to write\n     * @param value to set\n     * @throws IllegalArgumentException if the field cannot be located or is not static\n     * @throws IllegalAccessException if the field is not public or is final\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 481,
      "end_line": 489,
      "comment": "\n     * Write a named static Field. Only the specified class will be considered.\n     * @param cls Class on which the Field is to be found\n     * @param fieldName to write\n     * @param value to set\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @throws IllegalArgumentException if the field cannot be located or is not static\n     * @throws IllegalAccessException if the field is not made accessible or is final\n      ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 68)",
        "(line 484,col 9)-(line 486,col 9)",
        "(line 488,col 9)-(line 488,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.reflect.Field, java.lang.Object, java.lang.Object)",
      "begin_line": 499,
      "end_line": 501,
      "comment": "\n     * Write an accessible field.\n     * @param field to write\n     * @param target  the object to call on, may be null for static fields\n     * @param value to set\n     * @throws IllegalArgumentException if the field is null\n     * @throws IllegalAccessException if the field is not accessible or is final\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.reflect.Field, java.lang.Object, java.lang.Object, boolean)",
      "begin_line": 514,
      "end_line": 524,
      "comment": "\n     * Write a field.\n     * @param field to write\n     * @param target  the object to call on, may be null for static fields\n     * @param value to set\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @throws IllegalArgumentException if the field is null\n     * @throws IllegalAccessException if the field is not made accessible or is final\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.Object, java.lang.String, java.lang.Object)",
      "begin_line": 534,
      "end_line": 536,
      "comment": "\n     * Write a public field. Superclasses will be considered.\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param value to set\n     * @throws IllegalArgumentException if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException if the field is not accessible\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.Object, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 549,
      "end_line": 561,
      "comment": "\n     * Write a field. Superclasses will be considered.\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param value to set\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @throws IllegalArgumentException if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 41)",
        "(line 555,col 9)-(line 555,col 60)",
        "(line 556,col 9)-(line 558,col 9)",
        "(line 560,col 9)-(line 560,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(java.lang.Object, java.lang.String, java.lang.Object)",
      "begin_line": 571,
      "end_line": 573,
      "comment": "\n     * Write a public field. Only the specified class will be considered.\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param value to set\n     * @throws IllegalArgumentException if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(java.lang.Object, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 586,
      "end_line": 598,
      "comment": "\n     * Write a public field. Only the specified class will be considered.\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param value to set\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @throws IllegalArgumentException if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 591,col 41)",
        "(line 592,col 9)-(line 592,col 68)",
        "(line 593,col 9)-(line 595,col 9)",
        "(line 597,col 9)-(line 597,col 41)"
      ]
    }
  ]
}