{
  "filepath": "/tmp/JxPath-5b/src/java/org/apache/commons/jxpath/util/BasicTypeConverter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BasicTypeConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.util.TypeConverter"
      ],
      "begin_line": 43,
      "end_line": 499,
      "comment": "\n * The default implementation of TypeConverter.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.canConvert(java.lang.Object, java.lang.Class)",
      "begin_line": 49,
      "end_line": 161,
      "comment": "\n     * Returns true if it can convert the supplied\n     * object to the specified class.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 52,col 9)",
        "(line 54,col 9)-(line 56,col 9)",
        "(line 58,col 9)-(line 58,col 43)",
        "(line 59,col 9)-(line 61,col 9)",
        "(line 63,col 9)-(line 65,col 9)",
        "(line 67,col 9)-(line 69,col 9)",
        "(line 71,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.convert(java.lang.Object, java.lang.Class)",
      "begin_line": 168,
      "end_line": 289,
      "comment": "\n     * Converts the supplied object to the specified\n     * type. Throws a runtime exception if the conversion is\n     * not possible.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 43)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 280,col 9)",
        "(line 282,col 9)-(line 282,col 58)",
        "(line 283,col 9)-(line 285,col 9)",
        "(line 287,col 9)-(line 288,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.convertNullToPrimitive(java.lang.Class)",
      "begin_line": 291,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.convertStringToPrimitive(java.lang.Object, java.lang.Class)",
      "begin_line": 319,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.allocateNumber(java.lang.Class, double)",
      "begin_line": 347,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.canCreateCollection(java.lang.Class)",
      "begin_line": 369,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 370,col 9)-(line 373,col 9)",
        "(line 375,col 9)-(line 377,col 9)",
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.allocateCollection(java.lang.Class)",
      "begin_line": 385,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 386,col 9)-(line 395,col 9)",
        "(line 397,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 404,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.unmodifiableCollection(java.util.Collection)",
      "begin_line": 407,
      "end_line": 418,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValueNodeSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.NodeSet"
      ],
      "begin_line": 420,
      "end_line": 446,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 421,
      "end_line": 421,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pointers"
      ],
      "begin_line": 422,
      "end_line": 422,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValueNodeSet.ValueNodeSet(java.util.List)",
      "begin_line": 424,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 425,col 12)-(line 425,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValueNodeSet.getValues()",
      "begin_line": 428,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 429,col 13)-(line 429,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValueNodeSet.getNodes()",
      "begin_line": 432,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 433,col 13)-(line 433,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValueNodeSet.getPointers()",
      "begin_line": 436,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 437,col 13)-(line 443,col 13)",
        "(line 444,col 13)-(line 444,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValuePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.Pointer"
      ],
      "begin_line": 448,
      "end_line": 498,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bean"
      ],
      "begin_line": 449,
      "end_line": 449,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.ValuePointer(java.lang.Object)",
      "begin_line": 451,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 452,col 13)-(line 452,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.getValue()",
      "begin_line": 455,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 456,col 13)-(line 456,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.getNode()",
      "begin_line": 459,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 460,col 13)-(line 460,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.getRootNode()",
      "begin_line": 463,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 464,col 13)-(line 464,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.setValue(java.lang.Object)",
      "begin_line": 467,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 468,col 13)-(line 468,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.clone()",
      "begin_line": 471,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 472,col 13)-(line 472,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.compareTo(java.lang.Object)",
      "begin_line": 475,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 476,col 13)-(line 476,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.asPath()",
      "begin_line": 479,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 480,col 13)-(line 482,col 13)",
        "(line 483,col 13)-(line 489,col 13)",
        "(line 490,col 13)-(line 492,col 13)",
        "(line 493,col 13)-(line 495,col 13)",
        "(line 496,col 13)-(line 496,col 72)"
      ]
    }
  ]
}