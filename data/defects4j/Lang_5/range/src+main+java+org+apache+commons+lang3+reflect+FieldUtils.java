{
  "filepath": "/tmp/Lang-5b/src/main/java/org/apache/commons/lang3/reflect/FieldUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 595,
      "comment": "\n * Utilities for working with fields by reflection. Adapted and refactored\n * from the dormant [reflect] Commons sandbox component.\n * \u003cp\u003e\n * The ability is provided to break the scoping restrictions coded by the\n * programmer. This can allow fields to be changed that shouldn\u0027t be. This\n * facility should be used with care.\n *\n * @since 2.5\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.FieldUtils()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * FieldUtils instances should NOT be constructed in standard programming.\n     * \u003cp\u003e\n     * This constructor is public to permit tools that require a JavaBean instance\n     * to operate.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.getField(java.lang.Class\u003c?\u003e, java.lang.String)",
      "begin_line": 56,
      "end_line": 60,
      "comment": "\n     * Gets an accessible \u003ccode\u003eField\u003c/code\u003e by name respecting scope.\n     * Superclasses/interfaces will be considered.\n     *\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @return the Field object\n     * @throws IllegalArgumentException if the class or field name is null\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 54)",
        "(line 58,col 9)-(line 58,col 51)",
        "(line 59,col 9)-(line 59,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.getField(java.lang.Class\u003c?\u003e, java.lang.String, boolean)",
      "begin_line": 74,
      "end_line": 129,
      "comment": "\n     * Gets an accessible \u003ccode\u003eField\u003c/code\u003e by name breaking scope\n     * if requested. Superclasses/interfaces will be considered.\n     *\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @return the Field object\n     * @throws IllegalArgumentException if the class or field name is null\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 95,col 9)-(line 111,col 9)",
        "(line 115,col 9)-(line 115,col 27)",
        "(line 116,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(java.lang.Class\u003c?\u003e, java.lang.String)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Gets an accessible \u003ccode\u003eField\u003c/code\u003e by name respecting scope.\n     * Only the specified class will be considered.\n     *\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @return the Field object\n     * @throws IllegalArgumentException if the class or field name is null\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(java.lang.Class\u003c?\u003e, java.lang.String, boolean)",
      "begin_line": 155,
      "end_line": 177,
      "comment": "\n     * Gets an accessible \u003ccode\u003eField\u003c/code\u003e by name breaking scope\n     * if requested. Only the specified class will be considered.\n     *\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. False will only match public fields.\n     * @return the Field object\n     * @throws IllegalArgumentException if the class or field name is null\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.reflect.Field)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Reads an accessible static Field.\n     * @param field to read\n     * @return the field value\n     * @throws IllegalArgumentException if the field is null or not static\n     * @throws IllegalAccessException if the field is not accessible\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.reflect.Field, boolean)",
      "begin_line": 199,
      "end_line": 207,
      "comment": "\n     * Reads a static Field.\n     * @param field to read\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method.\n     * @return the field value\n     * @throws IllegalArgumentException if the field is null or not static\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.Class\u003c?\u003e, java.lang.String)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Reads the named public static field. Superclasses will be considered.\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @return the value of the field\n     * @throws IllegalArgumentException if the class is null, the field name is null or if the field could not be found\n     * @throws IllegalAccessException if the field is not accessible\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readStaticField(java.lang.Class\u003c?\u003e, java.lang.String, boolean)",
      "begin_line": 232,
      "end_line": 240,
      "comment": "\n     * Reads the named static field. Superclasses will be considered.\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @return the Field object\n     * @throws IllegalArgumentException if the class is null, the field name is null or if the field could not be found\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 60)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readDeclaredStaticField(java.lang.Class\u003c?\u003e, java.lang.String)",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * Gets a static Field value by name. The field must be public.\n     * Only the specified class will be considered.\n     *\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @return the value of the field\n     * @throws IllegalArgumentException if the class is null, the field name is null or if the field could not be found\n     * @throws IllegalAccessException if the field is not accessible\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readDeclaredStaticField(java.lang.Class\u003c?\u003e, java.lang.String, boolean)",
      "begin_line": 269,
      "end_line": 277,
      "comment": "\n     * Gets a static Field value by name. Only the specified class will\n     * be considered.\n     *\n     * @param cls  the class to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @return the Field object\n     * @throws IllegalArgumentException if the class is null, the field name is null or if the field could not be found\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 68)",
        "(line 272,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 276,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.reflect.Field, java.lang.Object)",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * Reads an accessible Field.\n     * @param field  the field to use\n     * @param target  the object to call on, may be null for static fields\n     * @return the field value\n     * @throws IllegalArgumentException if the field is null\n     * @throws IllegalAccessException if the field is not accessible\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.reflect.Field, java.lang.Object, boolean)",
      "begin_line": 301,
      "end_line": 311,
      "comment": "\n     * Reads a Field.\n     * @param field  the field to use\n     * @param target  the object to call on, may be null for static fields\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method.\n     * @return the field value\n     * @throws IllegalArgumentException if the field is null\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.Object, java.lang.String)",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\n     * Reads the named public field. Superclasses will be considered.\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @return the value of the field\n     * @throws IllegalArgumentException if the class or field name is null\n     * @throws IllegalAccessException if the named field is not public\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readField(java.lang.Object, java.lang.String, boolean)",
      "begin_line": 336,
      "end_line": 347,
      "comment": "\n     * Reads the named field. Superclasses will be considered.\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @return the field value\n     * @throws IllegalArgumentException if the class or field name is null\n     * @throws IllegalAccessException if the named field is not made accessible\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 41)",
        "(line 341,col 9)-(line 341,col 60)",
        "(line 342,col 9)-(line 344,col 9)",
        "(line 346,col 9)-(line 346,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(java.lang.Object, java.lang.String)",
      "begin_line": 357,
      "end_line": 359,
      "comment": "\n     * Reads the named public field. Only the class of the specified object will be considered.\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @return the value of the field\n     * @throws IllegalArgumentException if the class or field name is null\n     * @throws IllegalAccessException if the named field is not public\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(java.lang.Object, java.lang.String, boolean)",
      "begin_line": 374,
      "end_line": 386,
      "comment": "\n     * \u003cp\u003c\u003eGets a Field value by name. Only the class of the specified\n     * object will be considered.\n     *\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @return the Field object\n     * @throws IllegalArgumentException if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 379,col 41)",
        "(line 380,col 9)-(line 380,col 68)",
        "(line 381,col 9)-(line 383,col 9)",
        "(line 385,col 9)-(line 385,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.reflect.Field, java.lang.Object)",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\n     * Writes a public static Field.\n     * @param field to write\n     * @param value to set\n     * @throws IllegalArgumentException if the field is null or not static\n     * @throws IllegalAccessException if the field is not public or is final\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.reflect.Field, java.lang.Object, boolean)",
      "begin_line": 409,
      "end_line": 417,
      "comment": "\n     * Writes a static Field.\n     * @param field to write\n     * @param value to set\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @throws IllegalArgumentException if the field is null or not static\n     * @throws IllegalAccessException if the field is not made accessible or is final\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object)",
      "begin_line": 427,
      "end_line": 429,
      "comment": "\n     * Writes a named public static Field. Superclasses will be considered.\n     * @param cls Class on which the Field is to be found\n     * @param fieldName to write\n     * @param value to set\n     * @throws IllegalArgumentException if the field cannot be located or is not static\n     * @throws IllegalAccessException if the field is not public or is final\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 442,
      "end_line": 450,
      "comment": "\n     * Writes a named static Field. Superclasses will be considered.\n     * @param cls Class on which the Field is to be found\n     * @param fieldName to write\n     * @param value to set\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @throws IllegalArgumentException if the field cannot be located or is not static\n     * @throws IllegalAccessException if the field is not made accessible or is final\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 60)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 449,col 9)-(line 449,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object)",
      "begin_line": 460,
      "end_line": 463,
      "comment": "\n     * Writes a named public static Field. Only the specified class will be considered.\n     * @param cls Class on which the Field is to be found\n     * @param fieldName to write\n     * @param value to set\n     * @throws IllegalArgumentException if the field cannot be located or is not static\n     * @throws IllegalAccessException if the field is not public or is final\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 476,
      "end_line": 484,
      "comment": "\n     * Writes a named static Field. Only the specified class will be considered.\n     * @param cls Class on which the Field is to be found\n     * @param fieldName to write\n     * @param value to set\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @throws IllegalArgumentException if the field cannot be located or is not static\n     * @throws IllegalAccessException if the field is not made accessible or is final\n      ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 68)",
        "(line 479,col 9)-(line 481,col 9)",
        "(line 483,col 9)-(line 483,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.reflect.Field, java.lang.Object, java.lang.Object)",
      "begin_line": 494,
      "end_line": 496,
      "comment": "\n     * Writes an accessible field.\n     * @param field to write\n     * @param target  the object to call on, may be null for static fields\n     * @param value to set\n     * @throws IllegalArgumentException if the field is null\n     * @throws IllegalAccessException if the field is not accessible or is final\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.reflect.Field, java.lang.Object, java.lang.Object, boolean)",
      "begin_line": 509,
      "end_line": 520,
      "comment": "\n     * Writes a field.\n     * @param field to write\n     * @param target  the object to call on, may be null for static fields\n     * @param value to set\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @throws IllegalArgumentException if the field is null\n     * @throws IllegalAccessException if the field is not made accessible or is final\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 519,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.Object, java.lang.String, java.lang.Object)",
      "begin_line": 530,
      "end_line": 532,
      "comment": "\n     * Writes a public field. Superclasses will be considered.\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param value to set\n     * @throws IllegalArgumentException if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException if the field is not accessible\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeField(java.lang.Object, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 545,
      "end_line": 557,
      "comment": "\n     * Writes a field. Superclasses will be considered.\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param value to set\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @throws IllegalArgumentException if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 41)",
        "(line 551,col 9)-(line 551,col 60)",
        "(line 552,col 9)-(line 554,col 9)",
        "(line 556,col 9)-(line 556,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(java.lang.Object, java.lang.String, java.lang.Object)",
      "begin_line": 567,
      "end_line": 569,
      "comment": "\n     * Writes a public field. Only the specified class will be considered.\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param value to set\n     * @throws IllegalArgumentException if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(java.lang.Object, java.lang.String, java.lang.Object, boolean)",
      "begin_line": 582,
      "end_line": 594,
      "comment": "\n     * Writes a public field. Only the specified class will be considered.\n     * @param target  the object to reflect, must not be null\n     * @param fieldName  the field name to obtain\n     * @param value to set\n     * @param forceAccess  whether to break scope restrictions using the\n     *  \u003ccode\u003esetAccessible\u003c/code\u003e method. \u003ccode\u003eFalse\u003c/code\u003e will only\n     *  match public fields.\n     * @throws IllegalArgumentException if \u003ccode\u003etarget\u003c/code\u003e or \u003ccode\u003efieldName\u003c/code\u003e is null\n     * @throws IllegalAccessException if the field is not made accessible\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 587,col 41)",
        "(line 588,col 9)-(line 588,col 68)",
        "(line 589,col 9)-(line 591,col 9)",
        "(line 593,col 9)-(line 593,col 41)"
      ]
    }
  ]
}