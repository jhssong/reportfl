{
  "filepath": "/tmp/JxPath-8b/src/java/org/apache/commons/jxpath/util/BasicTypeConverter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BasicTypeConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.util.TypeConverter"
      ],
      "begin_line": 45,
      "end_line": 510,
      "comment": "\n * The default implementation of TypeConverter.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.canConvert(java.lang.Object, java.lang.Class)",
      "begin_line": 51,
      "end_line": 148,
      "comment": "\n     * Returns true if it can convert the supplied\n     * object to the specified class.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 62)",
        "(line 56,col 9)-(line 56,col 43)",
        "(line 58,col 9)-(line 60,col 9)",
        "(line 62,col 9)-(line 64,col 9)",
        "(line 66,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.convert(java.lang.Object, java.lang.Class)",
      "begin_line": 155,
      "end_line": 276,
      "comment": "\n     * Converts the supplied object to the specified\n     * type. Throws a runtime exception if the conversion is\n     * not possible.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 62)",
        "(line 170,col 9)-(line 170,col 43)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 267,col 9)",
        "(line 269,col 9)-(line 269,col 59)",
        "(line 270,col 9)-(line 272,col 9)",
        "(line 274,col 9)-(line 275,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.convertNullToPrimitive(java.lang.Class)",
      "begin_line": 278,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.convertStringToPrimitive(java.lang.Object, java.lang.Class)",
      "begin_line": 306,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 49)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.allocateNumber(java.lang.Class, double)",
      "begin_line": 335,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 45)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 42)",
        "(line 362,col 9)-(line 362,col 38)",
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.canCreateCollection(java.lang.Class)",
      "begin_line": 383,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 384,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.allocateCollection(java.lang.Class)",
      "begin_line": 396,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 397,col 9)-(line 406,col 9)",
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 415,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.unmodifiableCollection(java.util.Collection)",
      "begin_line": 418,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValueNodeSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.NodeSet"
      ],
      "begin_line": 431,
      "end_line": 457,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 432,
      "end_line": 432,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pointers"
      ],
      "begin_line": 433,
      "end_line": 433,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValueNodeSet.ValueNodeSet(java.util.List)",
      "begin_line": 435,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 436,col 12)-(line 436,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValueNodeSet.getValues()",
      "begin_line": 439,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 440,col 13)-(line 440,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValueNodeSet.getNodes()",
      "begin_line": 443,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 444,col 13)-(line 444,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValueNodeSet.getPointers()",
      "begin_line": 447,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 448,col 13)-(line 454,col 13)",
        "(line 455,col 13)-(line 455,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValuePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.Pointer"
      ],
      "begin_line": 459,
      "end_line": 509,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bean"
      ],
      "begin_line": 460,
      "end_line": 460,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.ValuePointer(java.lang.Object)",
      "begin_line": 462,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 463,col 13)-(line 463,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.getValue()",
      "begin_line": 466,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 467,col 13)-(line 467,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.getNode()",
      "begin_line": 470,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 471,col 13)-(line 471,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.getRootNode()",
      "begin_line": 474,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 475,col 13)-(line 475,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.setValue(java.lang.Object)",
      "begin_line": 478,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 479,col 13)-(line 479,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.clone()",
      "begin_line": 482,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 483,col 13)-(line 483,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.compareTo(java.lang.Object)",
      "begin_line": 486,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 487,col 13)-(line 487,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.asPath()",
      "begin_line": 490,
      "end_line": 508,
      "comment": "",
      "child_ranges": [
        "(line 491,col 13)-(line 493,col 13)",
        "(line 494,col 13)-(line 500,col 13)",
        "(line 501,col 13)-(line 503,col 13)",
        "(line 504,col 13)-(line 506,col 13)",
        "(line 507,col 13)-(line 507,col 72)"
      ]
    }
  ]
}