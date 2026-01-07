{
  "filepath": "/tmp/JxPath-2b/src/java/org/apache/commons/jxpath/util/BasicTypeConverter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BasicTypeConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.util.TypeConverter"
      ],
      "begin_line": 42,
      "end_line": 515,
      "comment": "\n * The default implementation of TypeConverter.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.canConvert(java.lang.Object, java.lang.Class)",
      "begin_line": 48,
      "end_line": 168,
      "comment": "\n     * Returns true if it can convert the supplied\n     * object to the specified class.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 51,col 9)",
        "(line 53,col 9)-(line 55,col 9)",
        "(line 57,col 9)-(line 57,col 43)",
        "(line 58,col 9)-(line 60,col 9)",
        "(line 62,col 9)-(line 64,col 9)",
        "(line 66,col 9)-(line 68,col 9)",
        "(line 70,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.convert(java.lang.Object, java.lang.Class)",
      "begin_line": 175,
      "end_line": 306,
      "comment": "\n     * Converts the supplied object to the specified\n     * type. Throws a runtime exception if the conversion is\n     * not possible.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 193,col 43)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 299,col 58)",
        "(line 300,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 305,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.convertNullToPrimitive(java.lang.Class)",
      "begin_line": 308,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.convertStringToPrimitive(java.lang.Object, java.lang.Class)",
      "begin_line": 336,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.allocateNumber(java.lang.Class, double)",
      "begin_line": 364,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.canCreateCollection(java.lang.Class)",
      "begin_line": 386,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 387,col 9)-(line 390,col 9)",
        "(line 392,col 9)-(line 394,col 9)",
        "(line 396,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 399,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.allocateCollection(java.lang.Class)",
      "begin_line": 402,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 403,col 9)-(line 412,col 9)",
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 421,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.unmodifiableCollection(java.util.Collection)",
      "begin_line": 424,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 425,col 9)-(line 430,col 9)",
        "(line 433,col 9)-(line 433,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValueNodeSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.NodeSet"
      ],
      "begin_line": 436,
      "end_line": 462,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 437,
      "end_line": 437,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pointers"
      ],
      "begin_line": 438,
      "end_line": 438,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValueNodeSet.ValueNodeSet(java.util.List)",
      "begin_line": 440,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 441,col 12)-(line 441,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValueNodeSet.getValues()",
      "begin_line": 444,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 445,col 13)-(line 445,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValueNodeSet.getNodes()",
      "begin_line": 448,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 449,col 13)-(line 449,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValueNodeSet.getPointers()",
      "begin_line": 452,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 453,col 13)-(line 459,col 13)",
        "(line 460,col 13)-(line 460,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValuePointer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.Pointer"
      ],
      "begin_line": 464,
      "end_line": 514,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bean"
      ],
      "begin_line": 465,
      "end_line": 465,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.ValuePointer(java.lang.Object)",
      "begin_line": 467,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 468,col 13)-(line 468,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.getValue()",
      "begin_line": 471,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 472,col 13)-(line 472,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.getNode()",
      "begin_line": 475,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 476,col 13)-(line 476,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.getRootNode()",
      "begin_line": 479,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 480,col 13)-(line 480,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.setValue(java.lang.Object)",
      "begin_line": 483,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 484,col 13)-(line 484,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.clone()",
      "begin_line": 487,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 488,col 13)-(line 488,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.compareTo(java.lang.Object)",
      "begin_line": 491,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 492,col 13)-(line 492,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.BasicTypeConverter.ValuePointer.asPath()",
      "begin_line": 495,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 496,col 13)-(line 511,col 13)",
        "(line 512,col 13)-(line 512,col 72)"
      ]
    }
  ]
}