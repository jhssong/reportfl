{
  "filepath": "/tmp/Math-58b/src/test/java/org/apache/commons/math/linear/ArrayFieldVectorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayFieldVectorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 37,
      "end_line": 634,
      "comment": "\n * Test cases for the {@link ArrayFieldVector} class.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ma1"
      ],
      "begin_line": 40,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec1"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec2"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec3"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec4"
      ],
      "begin_line": 48,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec_null"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dvec1"
      ],
      "begin_line": 52,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mat1"
      ],
      "begin_line": 55,
      "end_line": 59,
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
      "begin_line": 63,
      "end_line": 255,
      "comment": " only with enough content to support the test"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Entries of the vector. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.buildArray(int)",
      "begin_line": 77,
      "end_line": 80,
      "comment": " Build an array of elements.\n         * @param length size of the array to build\n         * @return a new array\n         ",
      "child_ranges": [
        "(line 79,col 13)-(line 79,col 79)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.FieldVectorTestImpl(T[])",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 83,col 13)-(line 83,col 36)",
        "(line 84,col 13)-(line 84,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.getField()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 13)-(line 88,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.unsupported()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 13)-(line 92,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.copy()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 13)-(line 96,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.add(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 13)-(line 100,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.add(T[])",
      "begin_line": 103,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 13)-(line 104,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.subtract(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.subtract(T[])",
      "begin_line": 111,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 13)-(line 112,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapAdd(T)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 13)-(line 116,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapAddToSelf(T)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 13)-(line 120,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapSubtract(T)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 13)-(line 124,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapSubtractToSelf(T)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 13)-(line 128,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapMultiply(T)",
      "begin_line": 131,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 132,col 13)-(line 132,col 46)",
        "(line 133,col 13)-(line 135,col 13)",
        "(line 136,col 13)-(line 136,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapMultiplyToSelf(T)",
      "begin_line": 139,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 13)-(line 140,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapDivide(T)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 13)-(line 144,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapDivideToSelf(T)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 13)-(line 148,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapInv()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 13)-(line 152,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapInvToSelf()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 13)-(line 156,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.ebeMultiply(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 13)-(line 160,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.ebeMultiply(T[])",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 13)-(line 164,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.ebeDivide(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.ebeDivide(T[])",
      "begin_line": 171,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 172,col 13)-(line 172,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.getData()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 176,col 13)-(line 176,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.dotProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 179,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 180,col 13)-(line 180,col 36)",
        "(line 181,col 13)-(line 183,col 13)",
        "(line 184,col 13)-(line 184,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.dotProduct(T[])",
      "begin_line": 187,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 188,col 13)-(line 188,col 36)",
        "(line 189,col 13)-(line 191,col 13)",
        "(line 192,col 13)-(line 192,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.projection(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 13)-(line 196,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.projection(T[])",
      "begin_line": 199,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 13)-(line 200,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.outerProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 13)-(line 204,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.outerProduct(T[])",
      "begin_line": 207,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 13)-(line 208,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.getEntry(int)",
      "begin_line": 211,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 212,col 13)-(line 212,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.getDimension()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 13)-(line 216,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.append(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 13)-(line 220,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.append(T)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 13)-(line 224,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.append(T[])",
      "begin_line": 227,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 228,col 13)-(line 228,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.getSubVector(int, int)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 232,col 13)-(line 232,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.setEntry(int, T)",
      "begin_line": 235,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 236,col 13)-(line 236,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.setSubVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 239,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 240,col 13)-(line 240,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.setSubVector(int, T[])",
      "begin_line": 243,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 244,col 13)-(line 244,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.set(T)",
      "begin_line": 247,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 248,col 13)-(line 248,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.toArray()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 13)-(line 252,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testConstructors()",
      "begin_line": 257,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 100)",
        "(line 260,col 9)-(line 260,col 43)",
        "(line 262,col 9)-(line 262,col 103)",
        "(line 263,col 9)-(line 263,col 43)",
        "(line 264,col 9)-(line 264,col 54)",
        "(line 266,col 9)-(line 266,col 98)",
        "(line 267,col 9)-(line 267,col 43)",
        "(line 268,col 9)-(line 268,col 61)",
        "(line 270,col 9)-(line 270,col 77)",
        "(line 271,col 9)-(line 271,col 43)",
        "(line 272,col 9)-(line 272,col 54)",
        "(line 274,col 9)-(line 274,col 83)",
        "(line 275,col 9)-(line 275,col 43)",
        "(line 276,col 9)-(line 276,col 54)",
        "(line 277,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 284,col 75)",
        "(line 285,col 9)-(line 285,col 45)",
        "(line 286,col 9)-(line 286,col 56)",
        "(line 288,col 9)-(line 288,col 78)",
        "(line 289,col 9)-(line 289,col 43)",
        "(line 290,col 9)-(line 290,col 54)",
        "(line 292,col 9)-(line 292,col 84)",
        "(line 293,col 9)-(line 293,col 43)",
        "(line 294,col 9)-(line 294,col 54)",
        "(line 295,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 302,col 75)",
        "(line 303,col 9)-(line 303,col 43)",
        "(line 304,col 9)-(line 304,col 54)",
        "(line 306,col 9)-(line 306,col 85)",
        "(line 308,col 9)-(line 308,col 79)",
        "(line 309,col 9)-(line 309,col 45)",
        "(line 310,col 9)-(line 310,col 56)",
        "(line 312,col 9)-(line 312,col 81)",
        "(line 313,col 9)-(line 313,col 43)",
        "(line 314,col 9)-(line 314,col 54)",
        "(line 315,col 9)-(line 315,col 69)",
        "(line 317,col 9)-(line 317,col 84)",
        "(line 318,col 9)-(line 318,col 45)",
        "(line 319,col 9)-(line 319,col 56)",
        "(line 320,col 9)-(line 320,col 41)",
        "(line 322,col 9)-(line 322,col 79)",
        "(line 323,col 9)-(line 323,col 44)",
        "(line 324,col 9)-(line 324,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testDataInOut()",
      "begin_line": 328,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 77)",
        "(line 331,col 9)-(line 331,col 77)",
        "(line 332,col 9)-(line 332,col 77)",
        "(line 333,col 9)-(line 333,col 85)",
        "(line 335,col 9)-(line 335,col 57)",
        "(line 336,col 9)-(line 336,col 51)",
        "(line 337,col 9)-(line 337,col 62)",
        "(line 339,col 9)-(line 339,col 70)",
        "(line 340,col 9)-(line 340,col 51)",
        "(line 341,col 9)-(line 341,col 62)",
        "(line 343,col 9)-(line 343,col 59)",
        "(line 344,col 9)-(line 344,col 51)",
        "(line 345,col 9)-(line 345,col 62)",
        "(line 347,col 9)-(line 347,col 59)",
        "(line 348,col 9)-(line 348,col 51)",
        "(line 349,col 9)-(line 349,col 62)",
        "(line 351,col 9)-(line 351,col 49)",
        "(line 352,col 9)-(line 352,col 47)",
        "(line 353,col 9)-(line 353,col 78)",
        "(line 355,col 9)-(line 355,col 41)",
        "(line 356,col 9)-(line 356,col 39)",
        "(line 357,col 9)-(line 357,col 68)",
        "(line 365,col 9)-(line 365,col 60)",
        "(line 366,col 9)-(line 366,col 46)",
        "(line 367,col 9)-(line 367,col 57)",
        "(line 368,col 9)-(line 373,col 9)",
        "(line 375,col 9)-(line 375,col 83)",
        "(line 376,col 9)-(line 376,col 45)",
        "(line 377,col 9)-(line 377,col 59)",
        "(line 378,col 9)-(line 383,col 9)",
        "(line 385,col 9)-(line 385,col 83)",
        "(line 386,col 9)-(line 386,col 26)",
        "(line 387,col 9)-(line 387,col 58)",
        "(line 388,col 9)-(line 388,col 58)",
        "(line 389,col 9)-(line 394,col 9)",
        "(line 396,col 9)-(line 396,col 83)",
        "(line 397,col 9)-(line 397,col 37)",
        "(line 398,col 9)-(line 398,col 59)",
        "(line 400,col 9)-(line 405,col 9)",
        "(line 407,col 9)-(line 407,col 83)",
        "(line 408,col 9)-(line 408,col 37)",
        "(line 409,col 9)-(line 409,col 58)",
        "(line 410,col 9)-(line 410,col 58)",
        "(line 411,col 9)-(line 416,col 9)",
        "(line 419,col 9)-(line 419,col 83)",
        "(line 420,col 9)-(line 420,col 85)",
        "(line 421,col 9)-(line 421,col 39)",
        "(line 422,col 9)-(line 422,col 51)",
        "(line 423,col 9)-(line 423,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testMapFunctions()",
      "begin_line": 427,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 77)",
        "(line 431,col 9)-(line 431,col 68)",
        "(line 432,col 9)-(line 432,col 87)",
        "(line 433,col 9)-(line 433,col 72)",
        "(line 436,col 9)-(line 436,col 57)",
        "(line 437,col 9)-(line 437,col 53)",
        "(line 438,col 9)-(line 438,col 93)",
        "(line 439,col 9)-(line 439,col 84)",
        "(line 442,col 9)-(line 442,col 78)",
        "(line 443,col 9)-(line 443,col 93)",
        "(line 444,col 9)-(line 444,col 82)",
        "(line 447,col 9)-(line 447,col 62)",
        "(line 448,col 9)-(line 448,col 63)",
        "(line 449,col 9)-(line 449,col 99)",
        "(line 450,col 9)-(line 450,col 94)",
        "(line 453,col 9)-(line 453,col 78)",
        "(line 454,col 9)-(line 454,col 92)",
        "(line 455,col 9)-(line 455,col 82)",
        "(line 458,col 9)-(line 458,col 62)",
        "(line 459,col 9)-(line 459,col 63)",
        "(line 460,col 9)-(line 460,col 98)",
        "(line 461,col 9)-(line 461,col 94)",
        "(line 464,col 9)-(line 464,col 74)",
        "(line 465,col 9)-(line 465,col 96)",
        "(line 466,col 9)-(line 466,col 78)",
        "(line 469,col 9)-(line 469,col 60)",
        "(line 470,col 9)-(line 470,col 59)",
        "(line 471,col 9)-(line 471,col 102)",
        "(line 472,col 9)-(line 472,col 90)",
        "(line 475,col 9)-(line 475,col 53)",
        "(line 476,col 9)-(line 476,col 91)",
        "(line 477,col 9)-(line 477,col 72)",
        "(line 480,col 9)-(line 480,col 57)",
        "(line 481,col 9)-(line 481,col 38)",
        "(line 482,col 9)-(line 482,col 97)",
        "(line 483,col 9)-(line 483,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testBasicFunctions()",
      "begin_line": 487,
      "end_line": 553,
      "comment": "",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 77)",
        "(line 489,col 9)-(line 489,col 77)",
        "(line 490,col 9)-(line 490,col 49)",
        "(line 492,col 9)-(line 492,col 85)",
        "(line 495,col 9)-(line 495,col 54)",
        "(line 496,col 9)-(line 496,col 84)",
        "(line 497,col 9)-(line 497,col 63)",
        "(line 499,col 9)-(line 499,col 84)",
        "(line 500,col 9)-(line 500,col 52)",
        "(line 501,col 9)-(line 501,col 86)",
        "(line 502,col 9)-(line 502,col 67)",
        "(line 505,col 9)-(line 505,col 64)",
        "(line 506,col 9)-(line 506,col 92)",
        "(line 507,col 9)-(line 507,col 73)",
        "(line 509,col 9)-(line 509,col 62)",
        "(line 510,col 9)-(line 510,col 94)",
        "(line 511,col 9)-(line 511,col 77)",
        "(line 514,col 9)-(line 514,col 71)",
        "(line 515,col 9)-(line 515,col 94)",
        "(line 516,col 9)-(line 516,col 79)",
        "(line 518,col 9)-(line 518,col 70)",
        "(line 519,col 9)-(line 519,col 96)",
        "(line 520,col 9)-(line 520,col 83)",
        "(line 523,col 9)-(line 523,col 67)",
        "(line 524,col 9)-(line 524,col 99)",
        "(line 525,col 9)-(line 525,col 75)",
        "(line 527,col 9)-(line 527,col 66)",
        "(line 528,col 9)-(line 528,col 101)",
        "(line 529,col 9)-(line 529,col 79)",
        "(line 532,col 9)-(line 532,col 42)",
        "(line 533,col 9)-(line 533,col 59)",
        "(line 536,col 9)-(line 536,col 46)",
        "(line 537,col 9)-(line 537,col 61)",
        "(line 539,col 9)-(line 539,col 67)",
        "(line 540,col 9)-(line 540,col 83)",
        "(line 542,col 9)-(line 542,col 71)",
        "(line 543,col 9)-(line 543,col 85)",
        "(line 545,col 9)-(line 545,col 68)",
        "(line 546,col 9)-(line 546,col 109)",
        "(line 547,col 9)-(line 547,col 78)",
        "(line 549,col 9)-(line 549,col 67)",
        "(line 550,col 9)-(line 550,col 111)",
        "(line 551,col 9)-(line 551,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testMisc()",
      "begin_line": 555,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 77)",
        "(line 557,col 9)-(line 557,col 77)",
        "(line 558,col 9)-(line 558,col 74)",
        "(line 560,col 9)-(line 560,col 36)",
        "(line 561,col 9)-(line 561,col 54)",
        "(line 567,col 9)-(line 572,col 9)",
        "(line 574,col 8)-(line 579,col 9)",
        "(line 581,col 9)-(line 586,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testSerial()",
      "begin_line": 590,
      "end_line": 593,
      "comment": "",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 76)",
        "(line 592,col 9)-(line 592,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testZeroVectors()",
      "begin_line": 595,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 598,col 9)-(line 603,col 9)",
        "(line 604,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 615,col 9)",
        "(line 618,col 9)-(line 618,col 117)",
        "(line 619,col 9)-(line 619,col 123)",
        "(line 620,col 9)-(line 620,col 124)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.checkArray(java.lang.String, org.apache.commons.math.fraction.Fraction[], org.apache.commons.math.fraction.Fraction[])",
      "begin_line": 625,
      "end_line": 632,
      "comment": " verifies that two vectors are equals ",
      "child_ranges": [
        "(line 626,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 631,col 9)"
      ]
    }
  ]
}