{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/util/BasicTypeConverter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BasicTypeConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.util.TypeConverter"
      ],
      "begin_line": 45,
      "end_line": 563,
      "comment": "\n * The default implementation of TypeConverter.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.canConvert(java.lang.Object, java.lang.Class)",
      "begin_line": 54,
      "end_line": 147,
      "comment": "\n     * Returns true if it can convert the supplied\n     * object to the specified class.\n     * @param object to check\n     * @param toType prospective destination class\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 58,col 62)",
        "(line 59,col 9)-(line 59,col 43)",
        "(line 61,col 9)-(line 63,col 9)",
        "(line 65,col 9)-(line 67,col 9)",
        "(line 69,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.convert(java.lang.Object, java.lang.Class)",
      "begin_line": 157,
      "end_line": 279,
      "comment": "\n     * Converts the supplied object to the specified\n     * type. Throws a runtime exception if the conversion is\n     * not possible.\n     * @param object to convert\n     * @param toType destination class\n     * @return converted object\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 62)",
        "(line 172,col 9)-(line 172,col 43)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 270,col 9)",
        "(line 272,col 9)-(line 272,col 59)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 277,col 9)-(line 278,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.convertNullToPrimitive(java.lang.Class)",
      "begin_line": 286,
      "end_line": 312,
      "comment": "\n     * Convert null to a primitive type.\n     * @param toType destination class\n     * @return a wrapper\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.convertStringToPrimitive(java.lang.Object, java.lang.Class)",
      "begin_line": 320,
      "end_line": 347,
      "comment": "\n     * Convert a string to a primitive type.\n     * @param object String\n     * @param toType destination class\n     * @return wrapper\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 49)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.allocateNumber(java.lang.Class, double)",
      "begin_line": 355,
      "end_line": 402,
      "comment": "\n     * Allocate a number of a given type and value.\n     * @param type destination class\n     * @param value double\n     * @return Number\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 45)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 42)",
        "(line 382,col 9)-(line 382,col 38)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.canCreateCollection(java.lang.Class)",
      "begin_line": 409,
      "end_line": 421,
      "comment": "\n     * Learn whether this BasicTypeConverter can create a collection of the specified type.\n     * @param type prospective destination class\n     * @return boolean\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 420,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.allocateCollection(java.lang.Class)",
      "begin_line": 428,
      "end_line": 448,
      "comment": "\n     * Create a collection of a given type.\n     * @param type destination class\n     * @return Collection\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 438,col 9)",
        "(line 440,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 447,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.unmodifiableCollection(java.util.Collection)",
      "begin_line": 455,
      "end_line": 466,
      "comment": "\n     * Get an unmodifiable version of a collection.\n     * @param collection to wrap\n     * @return Collection\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValueNodeSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.NodeSet"
      ],
      "begin_line": 471,
      "end_line": 501,
      "comment": "\n     * NodeSet implementation\n     "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 472,
      "end_line": 472,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pointers"
      ],
      "begin_line": 473,
      "end_line": 473,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValueNodeSet.ValueNodeSet(java.util.List)",
      "begin_line": 479,
      "end_line": 481,
      "comment": "\n         * Create a new ValueNodeSet.\n         * @param values to return\n         ",
      "child_ranges": [
        "(line 480,col 12)-(line 480,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValueNodeSet.getValues()",
      "begin_line": 483,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 484,col 13)-(line 484,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValueNodeSet.getNodes()",
      "begin_line": 487,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 488,col 13)-(line 488,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValueNodeSet.getPointers()",
      "begin_line": 491,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 492,col 13)-(line 498,col 13)",
        "(line 499,col 13)-(line 499,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValuePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.Pointer"
      ],
      "begin_line": 506,
      "end_line": 562,
      "comment": "\n     * Value pointer\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 507,
      "end_line": 507,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bean"
      ],
      "begin_line": 509,
      "end_line": 509,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.ValuePointer(java.lang.Object)",
      "begin_line": 515,
      "end_line": 517,
      "comment": "\n         * Create a new ValuePointer.\n         * @param object value\n         ",
      "child_ranges": [
        "(line 516,col 13)-(line 516,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.getValue()",
      "begin_line": 519,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 520,col 13)-(line 520,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.getNode()",
      "begin_line": 523,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 524,col 13)-(line 524,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.getRootNode()",
      "begin_line": 527,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 528,col 13)-(line 528,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.setValue(java.lang.Object)",
      "begin_line": 531,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 532,col 13)-(line 532,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.clone()",
      "begin_line": 535,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 536,col 13)-(line 536,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.compareTo(java.lang.Object)",
      "begin_line": 539,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 540,col 13)-(line 540,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.asPath()",
      "begin_line": 543,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 544,col 13)-(line 546,col 13)",
        "(line 547,col 13)-(line 553,col 13)",
        "(line 554,col 13)-(line 556,col 13)",
        "(line 557,col 13)-(line 559,col 13)",
        "(line 560,col 13)-(line 560,col 72)"
      ]
    }
  ]
}