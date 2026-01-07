{
  "filepath": "/tmp/JxPath-10b/src/java/org/apache/commons/jxpath/ri/parser/SimpleCharStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleCharStream",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 9,
      "end_line": 401,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticFlag"
      ],
      "begin_line": 11,
      "end_line": 11,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bufsize"
      ],
      "begin_line": 12,
      "end_line": 12,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "available"
      ],
      "begin_line": 13,
      "end_line": 13,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tokenBegin"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bufpos"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bufline"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bufcolumn"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "column"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prevCharIsCR"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prevCharIsLF"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputStream"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxNextCharInd"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inBuf"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.ExpandBuff(boolean)",
      "begin_line": 31,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 33,col 6)-(line 33,col 49)",
        "(line 34,col 6)-(line 34,col 48)",
        "(line 35,col 6)-(line 35,col 50)",
        "(line 37,col 6)-(line 73,col 6)",
        "(line 76,col 6)-(line 76,col 21)",
        "(line 77,col 6)-(line 77,col 25)",
        "(line 78,col 6)-(line 78,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.FillBuff()",
      "begin_line": 81,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 83,col 6)-(line 103,col 6)",
        "(line 105,col 6)-(line 105,col 11)",
        "(line 106,col 6)-(line 123,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.BeginToken()",
      "begin_line": 126,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 128,col 6)-(line 128,col 21)",
        "(line 129,col 6)-(line 129,col 25)",
        "(line 130,col 6)-(line 130,col 25)",
        "(line 132,col 6)-(line 132,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.UpdateLineColumn(char)",
      "begin_line": 135,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 137,col 6)-(line 137,col 14)",
        "(line 139,col 6)-(line 153,col 6)",
        "(line 155,col 6)-(line 169,col 6)",
        "(line 171,col 6)-(line 171,col 28)",
        "(line 172,col 6)-(line 172,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.readChar()",
      "begin_line": 175,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 177,col 6)-(line 185,col 6)",
        "(line 187,col 6)-(line 188,col 19)",
        "(line 190,col 6)-(line 190,col 29)",
        "(line 192,col 6)-(line 192,col 25)",
        "(line 193,col 6)-(line 193,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.getColumn()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 6)-(line 202,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.getLine()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 6)-(line 211,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.getEndColumn()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 215,col 6)-(line 215,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.getEndLine()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 219,col 6)-(line 219,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.getBeginColumn()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 223,col 6)-(line 223,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.getBeginLine()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 227,col 6)-(line 227,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.backup(int)",
      "begin_line": 230,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 232,col 5)-(line 232,col 20)",
        "(line 233,col 5)-(line 234,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.SimpleCharStream(java.io.Reader, int, int, int)",
      "begin_line": 237,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 240,col 5)-(line 240,col 26)",
        "(line 241,col 5)-(line 241,col 21)",
        "(line 242,col 5)-(line 242,col 29)",
        "(line 244,col 5)-(line 244,col 37)",
        "(line 245,col 5)-(line 245,col 34)",
        "(line 246,col 5)-(line 246,col 34)",
        "(line 247,col 5)-(line 247,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.SimpleCharStream(java.io.Reader, int, int)",
      "begin_line": 250,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 253,col 6)-(line 253,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.SimpleCharStream(java.io.Reader)",
      "begin_line": 256,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 258,col 6)-(line 258,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.ReInit(java.io.Reader, int, int, int)",
      "begin_line": 260,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 263,col 5)-(line 263,col 26)",
        "(line 264,col 5)-(line 264,col 21)",
        "(line 265,col 5)-(line 265,col 29)",
        "(line 267,col 5)-(line 273,col 5)",
        "(line 274,col 5)-(line 274,col 40)",
        "(line 275,col 5)-(line 275,col 44)",
        "(line 276,col 5)-(line 276,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.ReInit(java.io.Reader, int, int)",
      "begin_line": 279,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 282,col 6)-(line 282,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.ReInit(java.io.Reader)",
      "begin_line": 285,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 287,col 6)-(line 287,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.SimpleCharStream(java.io.InputStream, int, int, int)",
      "begin_line": 289,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 292,col 6)-(line 292,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.SimpleCharStream(java.io.InputStream, int, int)",
      "begin_line": 295,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 298,col 6)-(line 298,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.SimpleCharStream(java.io.InputStream)",
      "begin_line": 301,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 303,col 6)-(line 303,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.ReInit(java.io.InputStream, int, int, int)",
      "begin_line": 306,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 309,col 6)-(line 309,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.ReInit(java.io.InputStream)",
      "begin_line": 312,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 314,col 6)-(line 314,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.ReInit(java.io.InputStream, int, int)",
      "begin_line": 316,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 319,col 6)-(line 319,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.GetImage()",
      "begin_line": 321,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 323,col 6)-(line 327,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.GetSuffix(int)",
      "begin_line": 330,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 332,col 6)-(line 332,col 32)",
        "(line 334,col 6)-(line 341,col 6)",
        "(line 343,col 6)-(line 343,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.Done()",
      "begin_line": 346,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 348,col 6)-(line 348,col 19)",
        "(line 349,col 6)-(line 349,col 20)",
        "(line 350,col 6)-(line 350,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.SimpleCharStream.adjustBeginLineColumn(int, int)",
      "begin_line": 356,
      "end_line": 399,
      "comment": "\n   * Method to adjust line and column numbers for the start of a token.\u003cBR\u003e\n   ",
      "child_ranges": [
        "(line 358,col 6)-(line 358,col 28)",
        "(line 359,col 6)-(line 359,col 13)",
        "(line 361,col 6)-(line 368,col 6)",
        "(line 370,col 6)-(line 370,col 29)",
        "(line 371,col 6)-(line 371,col 41)",
        "(line 373,col 6)-(line 381,col 6)",
        "(line 383,col 6)-(line 395,col 6)",
        "(line 397,col 6)-(line 397,col 23)",
        "(line 398,col 6)-(line 398,col 27)"
      ]
    }
  ]
}