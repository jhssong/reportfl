{
  "filepath": "/tmp/Math-60b/src/test/java/org/apache/commons/math/linear/ArrayFieldVectorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayFieldVectorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 36,
      "end_line": 633,
      "comment": "\n * Test cases for the {@link ArrayFieldVector} class.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ma1"
      ],
      "begin_line": 39,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec1"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec2"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec3"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec4"
      ],
      "begin_line": 47,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec_null"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dvec1"
      ],
      "begin_line": 51,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mat1"
      ],
      "begin_line": 54,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FieldVectorTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldVector\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 62,
      "end_line": 254,
      "comment": " only with enough content to support the test"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Entries of the vector. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.buildArray(int)",
      "begin_line": 76,
      "end_line": 79,
      "comment": " Build an array of elements.\n         * @param length size of the array to build\n         * @return a new array\n         ",
      "child_ranges": [
        "(line 78,col 13)-(line 78,col 79)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.FieldVectorTestImpl(T[])",
      "begin_line": 81,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 82,col 13)-(line 82,col 36)",
        "(line 83,col 13)-(line 83,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.getField()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 13)-(line 87,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.unsupported()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.copy()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 13)-(line 95,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.add(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 13)-(line 99,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.add(T[])",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.subtract(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 13)-(line 107,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.subtract(T[])",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapAdd(T)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapAddToSelf(T)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 13)-(line 119,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapSubtract(T)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 13)-(line 123,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapSubtractToSelf(T)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 13)-(line 127,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapMultiply(T)",
      "begin_line": 130,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 131,col 13)-(line 131,col 46)",
        "(line 132,col 13)-(line 134,col 13)",
        "(line 135,col 13)-(line 135,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapMultiplyToSelf(T)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 13)-(line 139,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapDivide(T)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 13)-(line 143,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapDivideToSelf(T)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 13)-(line 147,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapInv()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 13)-(line 151,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapInvToSelf()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 13)-(line 155,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.ebeMultiply(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 158,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 159,col 13)-(line 159,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.ebeMultiply(T[])",
      "begin_line": 162,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 13)-(line 163,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.ebeDivide(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 13)-(line 167,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.ebeDivide(T[])",
      "begin_line": 170,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 171,col 13)-(line 171,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.getData()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 13)-(line 175,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.dotProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 178,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 179,col 13)-(line 179,col 36)",
        "(line 180,col 13)-(line 182,col 13)",
        "(line 183,col 13)-(line 183,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.dotProduct(T[])",
      "begin_line": 186,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 187,col 13)-(line 187,col 36)",
        "(line 188,col 13)-(line 190,col 13)",
        "(line 191,col 13)-(line 191,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.projection(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 195,col 13)-(line 195,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.projection(T[])",
      "begin_line": 198,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 199,col 13)-(line 199,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.outerProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 202,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 13)-(line 203,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.outerProduct(T[])",
      "begin_line": 206,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 13)-(line 207,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.getEntry(int)",
      "begin_line": 210,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 13)-(line 211,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.getDimension()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 215,col 13)-(line 215,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.append(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 219,col 13)-(line 219,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.append(T)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 223,col 13)-(line 223,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.append(T[])",
      "begin_line": 226,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 227,col 13)-(line 227,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.getSubVector(int, int)",
      "begin_line": 230,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 13)-(line 231,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.setEntry(int, T)",
      "begin_line": 234,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 235,col 13)-(line 235,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.setSubVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 238,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 239,col 13)-(line 239,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.setSubVector(int, T[])",
      "begin_line": 242,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 243,col 13)-(line 243,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.set(T)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.toArray()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 13)-(line 251,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testConstructors()",
      "begin_line": 256,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 100)",
        "(line 259,col 9)-(line 259,col 43)",
        "(line 261,col 9)-(line 261,col 103)",
        "(line 262,col 9)-(line 262,col 43)",
        "(line 263,col 9)-(line 263,col 54)",
        "(line 265,col 9)-(line 265,col 98)",
        "(line 266,col 9)-(line 266,col 43)",
        "(line 267,col 9)-(line 267,col 61)",
        "(line 269,col 9)-(line 269,col 77)",
        "(line 270,col 9)-(line 270,col 43)",
        "(line 271,col 9)-(line 271,col 54)",
        "(line 273,col 9)-(line 273,col 83)",
        "(line 274,col 9)-(line 274,col 43)",
        "(line 275,col 9)-(line 275,col 54)",
        "(line 276,col 9)-(line 281,col 9)",
        "(line 283,col 9)-(line 283,col 75)",
        "(line 284,col 9)-(line 284,col 45)",
        "(line 285,col 9)-(line 285,col 56)",
        "(line 287,col 9)-(line 287,col 78)",
        "(line 288,col 9)-(line 288,col 43)",
        "(line 289,col 9)-(line 289,col 54)",
        "(line 291,col 9)-(line 291,col 84)",
        "(line 292,col 9)-(line 292,col 43)",
        "(line 293,col 9)-(line 293,col 54)",
        "(line 294,col 9)-(line 299,col 9)",
        "(line 301,col 9)-(line 301,col 75)",
        "(line 302,col 9)-(line 302,col 43)",
        "(line 303,col 9)-(line 303,col 54)",
        "(line 305,col 9)-(line 305,col 85)",
        "(line 307,col 9)-(line 307,col 79)",
        "(line 308,col 9)-(line 308,col 45)",
        "(line 309,col 9)-(line 309,col 56)",
        "(line 311,col 9)-(line 311,col 81)",
        "(line 312,col 9)-(line 312,col 43)",
        "(line 313,col 9)-(line 313,col 54)",
        "(line 314,col 9)-(line 314,col 69)",
        "(line 316,col 9)-(line 316,col 84)",
        "(line 317,col 9)-(line 317,col 45)",
        "(line 318,col 9)-(line 318,col 56)",
        "(line 319,col 9)-(line 319,col 41)",
        "(line 321,col 9)-(line 321,col 79)",
        "(line 322,col 9)-(line 322,col 44)",
        "(line 323,col 9)-(line 323,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testDataInOut()",
      "begin_line": 327,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 77)",
        "(line 330,col 9)-(line 330,col 77)",
        "(line 331,col 9)-(line 331,col 77)",
        "(line 332,col 9)-(line 332,col 85)",
        "(line 334,col 9)-(line 334,col 57)",
        "(line 335,col 9)-(line 335,col 51)",
        "(line 336,col 9)-(line 336,col 62)",
        "(line 338,col 9)-(line 338,col 70)",
        "(line 339,col 9)-(line 339,col 51)",
        "(line 340,col 9)-(line 340,col 62)",
        "(line 342,col 9)-(line 342,col 59)",
        "(line 343,col 9)-(line 343,col 51)",
        "(line 344,col 9)-(line 344,col 62)",
        "(line 346,col 9)-(line 346,col 59)",
        "(line 347,col 9)-(line 347,col 51)",
        "(line 348,col 9)-(line 348,col 62)",
        "(line 350,col 9)-(line 350,col 49)",
        "(line 351,col 9)-(line 351,col 47)",
        "(line 352,col 9)-(line 352,col 78)",
        "(line 354,col 9)-(line 354,col 41)",
        "(line 355,col 9)-(line 355,col 39)",
        "(line 356,col 9)-(line 356,col 68)",
        "(line 364,col 9)-(line 364,col 60)",
        "(line 365,col 9)-(line 365,col 46)",
        "(line 366,col 9)-(line 366,col 57)",
        "(line 367,col 9)-(line 372,col 9)",
        "(line 374,col 9)-(line 374,col 83)",
        "(line 375,col 9)-(line 375,col 45)",
        "(line 376,col 9)-(line 376,col 59)",
        "(line 377,col 9)-(line 382,col 9)",
        "(line 384,col 9)-(line 384,col 83)",
        "(line 385,col 9)-(line 385,col 26)",
        "(line 386,col 9)-(line 386,col 58)",
        "(line 387,col 9)-(line 387,col 58)",
        "(line 388,col 9)-(line 393,col 9)",
        "(line 395,col 9)-(line 395,col 83)",
        "(line 396,col 9)-(line 396,col 37)",
        "(line 397,col 9)-(line 397,col 59)",
        "(line 399,col 9)-(line 404,col 9)",
        "(line 406,col 9)-(line 406,col 83)",
        "(line 407,col 9)-(line 407,col 37)",
        "(line 408,col 9)-(line 408,col 58)",
        "(line 409,col 9)-(line 409,col 58)",
        "(line 410,col 9)-(line 415,col 9)",
        "(line 418,col 9)-(line 418,col 83)",
        "(line 419,col 9)-(line 419,col 85)",
        "(line 420,col 9)-(line 420,col 39)",
        "(line 421,col 9)-(line 421,col 51)",
        "(line 422,col 9)-(line 422,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testMapFunctions()",
      "begin_line": 426,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 77)",
        "(line 430,col 9)-(line 430,col 68)",
        "(line 431,col 9)-(line 431,col 87)",
        "(line 432,col 9)-(line 432,col 72)",
        "(line 435,col 9)-(line 435,col 57)",
        "(line 436,col 9)-(line 436,col 53)",
        "(line 437,col 9)-(line 437,col 93)",
        "(line 438,col 9)-(line 438,col 84)",
        "(line 441,col 9)-(line 441,col 78)",
        "(line 442,col 9)-(line 442,col 93)",
        "(line 443,col 9)-(line 443,col 82)",
        "(line 446,col 9)-(line 446,col 62)",
        "(line 447,col 9)-(line 447,col 63)",
        "(line 448,col 9)-(line 448,col 99)",
        "(line 449,col 9)-(line 449,col 94)",
        "(line 452,col 9)-(line 452,col 78)",
        "(line 453,col 9)-(line 453,col 92)",
        "(line 454,col 9)-(line 454,col 82)",
        "(line 457,col 9)-(line 457,col 62)",
        "(line 458,col 9)-(line 458,col 63)",
        "(line 459,col 9)-(line 459,col 98)",
        "(line 460,col 9)-(line 460,col 94)",
        "(line 463,col 9)-(line 463,col 74)",
        "(line 464,col 9)-(line 464,col 96)",
        "(line 465,col 9)-(line 465,col 78)",
        "(line 468,col 9)-(line 468,col 60)",
        "(line 469,col 9)-(line 469,col 59)",
        "(line 470,col 9)-(line 470,col 102)",
        "(line 471,col 9)-(line 471,col 90)",
        "(line 474,col 9)-(line 474,col 53)",
        "(line 475,col 9)-(line 475,col 91)",
        "(line 476,col 9)-(line 476,col 72)",
        "(line 479,col 9)-(line 479,col 57)",
        "(line 480,col 9)-(line 480,col 38)",
        "(line 481,col 9)-(line 481,col 97)",
        "(line 482,col 9)-(line 482,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testBasicFunctions()",
      "begin_line": 486,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 77)",
        "(line 488,col 9)-(line 488,col 77)",
        "(line 489,col 9)-(line 489,col 49)",
        "(line 491,col 9)-(line 491,col 85)",
        "(line 494,col 9)-(line 494,col 54)",
        "(line 495,col 9)-(line 495,col 84)",
        "(line 496,col 9)-(line 496,col 63)",
        "(line 498,col 9)-(line 498,col 84)",
        "(line 499,col 9)-(line 499,col 52)",
        "(line 500,col 9)-(line 500,col 86)",
        "(line 501,col 9)-(line 501,col 67)",
        "(line 504,col 9)-(line 504,col 64)",
        "(line 505,col 9)-(line 505,col 92)",
        "(line 506,col 9)-(line 506,col 73)",
        "(line 508,col 9)-(line 508,col 62)",
        "(line 509,col 9)-(line 509,col 94)",
        "(line 510,col 9)-(line 510,col 77)",
        "(line 513,col 9)-(line 513,col 71)",
        "(line 514,col 9)-(line 514,col 94)",
        "(line 515,col 9)-(line 515,col 79)",
        "(line 517,col 9)-(line 517,col 70)",
        "(line 518,col 9)-(line 518,col 96)",
        "(line 519,col 9)-(line 519,col 83)",
        "(line 522,col 9)-(line 522,col 67)",
        "(line 523,col 9)-(line 523,col 99)",
        "(line 524,col 9)-(line 524,col 75)",
        "(line 526,col 9)-(line 526,col 66)",
        "(line 527,col 9)-(line 527,col 101)",
        "(line 528,col 9)-(line 528,col 79)",
        "(line 531,col 9)-(line 531,col 42)",
        "(line 532,col 9)-(line 532,col 59)",
        "(line 535,col 9)-(line 535,col 46)",
        "(line 536,col 9)-(line 536,col 61)",
        "(line 538,col 9)-(line 538,col 67)",
        "(line 539,col 9)-(line 539,col 83)",
        "(line 541,col 9)-(line 541,col 71)",
        "(line 542,col 9)-(line 542,col 85)",
        "(line 544,col 9)-(line 544,col 68)",
        "(line 545,col 9)-(line 545,col 109)",
        "(line 546,col 9)-(line 546,col 78)",
        "(line 548,col 9)-(line 548,col 67)",
        "(line 549,col 9)-(line 549,col 111)",
        "(line 550,col 9)-(line 550,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testMisc()",
      "begin_line": 554,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 77)",
        "(line 556,col 9)-(line 556,col 77)",
        "(line 557,col 9)-(line 557,col 74)",
        "(line 559,col 9)-(line 559,col 36)",
        "(line 560,col 9)-(line 560,col 54)",
        "(line 566,col 9)-(line 571,col 9)",
        "(line 573,col 8)-(line 578,col 9)",
        "(line 580,col 9)-(line 585,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testSerial()",
      "begin_line": 589,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 76)",
        "(line 591,col 9)-(line 591,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testZeroVectors()",
      "begin_line": 594,
      "end_line": 621,
      "comment": "",
      "child_ranges": [
        "(line 597,col 9)-(line 602,col 9)",
        "(line 603,col 9)-(line 608,col 9)",
        "(line 609,col 9)-(line 614,col 9)",
        "(line 617,col 9)-(line 617,col 117)",
        "(line 618,col 9)-(line 618,col 123)",
        "(line 619,col 9)-(line 619,col 124)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.checkArray(java.lang.String, org.apache.commons.math.fraction.Fraction[], org.apache.commons.math.fraction.Fraction[])",
      "begin_line": 624,
      "end_line": 631,
      "comment": " verifies that two vectors are equals ",
      "child_ranges": [
        "(line 625,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 630,col 9)"
      ]
    }
  ]
}