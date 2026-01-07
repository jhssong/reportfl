{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/reflect/FieldUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 601,
      "comment": "\n * Utilities for working with fields by reflection. Adapted and refactored\n * from the dormant [reflect] Commons sandbox component.\n * \u003cp\u003e\n * The ability is provided to break the scoping restrictions coded by the\n * programmer. This can allow fields to be changed that shouldn\u0027t be. This\n * facility should be used with care.\n *\n * @since 2.5\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.FieldUtils()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * FieldUtils instances should NOT be constructed in standard programming.\n     * \u003cp\u003e\n     * This constructor is public to permit tools that require a JavaBean instance\n     * to operate.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.getField(java.lang.Class\u003c?\u003e, java.lang.String)",
      "begin_line": 57,
      "end_line": 61,
      "comment": "\n     * Gets an accessible \u003ccode\u003eField\u003c/code\u003e by name respecting scope.\n     * Superclasses/interfaces will be considered.\n     *\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @return the Field object\n     * @throws IllegalArgumentException if the class or field name is null\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 54)",
        "(line 59,col 9)-(line 59,col 51)",
        "(line 60,col 9)-(line 60,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.getField(java.lang.Class\u003c?\u003e, java.lang.String, boolean)",
      "begin_line": 75,
      "end_line": 135,
      "comment": "\n     * Gets an accessible \u003ccode\u003eField\u003c/code\u003e by name breaking scope\n     * if requested. Superclasses/interfaces will be considered.\n     *\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @return the Field object\n     * @throws IllegalArgumentException if the class or field name is null\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 81,col 9)",
        "(line 96,col 9)-(line 112,col 9)",
        "(line 116,col 9)-(line 116,col 27)",
        "(line 117,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(java.lang.Class\u003c?\u003e, java.lang.String)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Gets an accessible \u003ccode\u003eField\u003c/code\u003e by name respecting scope.\n     * Only the specified class will be considered.\n     *\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @return the Field object\n     * @throws IllegalArgumentException if the class or field name is null\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(java.lang.Class\u003c?\u003e, java.lang.String, boolean)",
      "begin_line": 161,
      "end_line": 183,
      "comment": "\n     * Gets an accessible \u003ccode\u003eField\u003c/code\u003e by name breaking scope\n     * if requested. Only the specified class will be considered.\n     *\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. False will only match public fields.\n     * @return the Field object\n     * @throws IllegalArgumentException if the class or field name is null\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.reflect.Field)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Read an accessible static Field.\n     * @param field to read\n     * @return the field value\n     * @throws IllegalArgumentException if the field is null or not static\n     * @throws IllegalAccessException if the field is not accessible\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.reflect.Field, boolean)",
      "begin_line": 205,
      "end_line": 213,
      "comment": "\n     * Read a static Field.\n     * @param field to read\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method.\n     * @return the field value\n     * @throws IllegalArgumentException if the field is null or not static\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.Class\u003c?\u003e, java.lang.String)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Read the named public static field. Superclasses will be considered.\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @return the value of the field\n     * @throws IllegalArgumentException if the class or field name is null\n     * @throws IllegalAccessException if the field is not accessible\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.Class\u003c?\u003e, java.lang.String, boolean)",
      "begin_line": 238,
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
      "end_line": 392,
      "comment": "\n     * \u003cp\u003c\u003eGets a Field value by name. Only the class of the specified\n     * object will be considered.\n     *\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @return the Field object\n     * @throws IllegalArgumentException if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 41)",
        "(line 386,col 9)-(line 386,col 68)",
        "(line 387,col 9)-(line 389,col 9)",
        "(line 391,col 9)-(line 391,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.reflect.Field, java.lang.Object)",
      "begin_line": 401,
      "end_line": 403,
      "comment": "\n     * Write a public static Field.\n     * @param field to write\n     * @param value to set\n     * @throws IllegalArgumentException if the field is null or not static\n     * @throws IllegalAccessException if the field is not public or is final\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.reflect.Field, java.lang.Object, boolean)",
      "begin_line": 415,
      "end_line": 423,
      "comment": "\n     * Write a static Field.\n     * @param field to write\n     * @param value to set\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @throws IllegalArgumentException if the field is null or not static\n     * @throws IllegalAccessException if the field is not made accessible or is final\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object)",
      "begin_line": 433,
      "end_line": 435,
      "comment": "\n     * Write a named public static Field. Superclasses will be considered.\n     * @param cls Class on which the Field is to be found\n     * @param fieldName to write\n     * @param value to set\n     * @throws IllegalArgumentException if the field cannot be located or is not static\n     * @throws IllegalAccessException if the field is not public or is final\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 448,
      "end_line": 456,
      "comment": "\n     * Write a named static Field. Superclasses will be considered.\n     * @param cls Class on which the Field is to be found\n     * @param fieldName to write\n     * @param value to set\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @throws IllegalArgumentException if the field cannot be located or is not static\n     * @throws IllegalAccessException if the field is not made accessible or is final\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 60)",
        "(line 451,col 9)-(line 453,col 9)",
        "(line 455,col 9)-(line 455,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object)",
      "begin_line": 466,
      "end_line": 469,
      "comment": "\n     * Write a named public static Field. Only the specified class will be considered.\n     * @param cls Class on which the Field is to be found\n     * @param fieldName to write\n     * @param value to set\n     * @throws IllegalArgumentException if the field cannot be located or is not static\n     * @throws IllegalAccessException if the field is not public or is final\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 482,
      "end_line": 490,
      "comment": "\n     * Write a named static Field. Only the specified class will be considered.\n     * @param cls Class on which the Field is to be found\n     * @param fieldName to write\n     * @param value to set\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @throws IllegalArgumentException if the field cannot be located or is not static\n     * @throws IllegalAccessException if the field is not made accessible or is final\n      ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 68)",
        "(line 485,col 9)-(line 487,col 9)",
        "(line 489,col 9)-(line 489,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.reflect.Field, java.lang.Object, java.lang.Object)",
      "begin_line": 500,
      "end_line": 502,
      "comment": "\n     * Write an accessible field.\n     * @param field to write\n     * @param target  the object to call on, may be null for static fields\n     * @param value to set\n     * @throws IllegalArgumentException if the field is null\n     * @throws IllegalAccessException if the field is not accessible or is final\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.reflect.Field, java.lang.Object, java.lang.Object, boolean)",
      "begin_line": 515,
      "end_line": 526,
      "comment": "\n     * Write a field.\n     * @param field to write\n     * @param target  the object to call on, may be null for static fields\n     * @param value to set\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @throws IllegalArgumentException if the field is null\n     * @throws IllegalAccessException if the field is not made accessible or is final\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 525,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.Object, java.lang.String, java.lang.Object)",
      "begin_line": 536,
      "end_line": 538,
      "comment": "\n     * Write a public field. Superclasses will be considered.\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param value to set\n     * @throws IllegalArgumentException if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException if the field is not accessible\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.Object, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 551,
      "end_line": 563,
      "comment": "\n     * Write a field. Superclasses will be considered.\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param value to set\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @throws IllegalArgumentException if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 556,col 41)",
        "(line 557,col 9)-(line 557,col 60)",
        "(line 558,col 9)-(line 560,col 9)",
        "(line 562,col 9)-(line 562,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(java.lang.Object, java.lang.String, java.lang.Object)",
      "begin_line": 573,
      "end_line": 575,
      "comment": "\n     * Write a public field. Only the specified class will be considered.\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param value to set\n     * @throws IllegalArgumentException if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(java.lang.Object, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 588,
      "end_line": 600,
      "comment": "\n     * Write a public field. Only the specified class will be considered.\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param value to set\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @throws IllegalArgumentException if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 593,col 41)",
        "(line 594,col 9)-(line 594,col 68)",
        "(line 595,col 9)-(line 597,col 9)",
        "(line 599,col 9)-(line 599,col 41)"
      ]
    }
  ]
}