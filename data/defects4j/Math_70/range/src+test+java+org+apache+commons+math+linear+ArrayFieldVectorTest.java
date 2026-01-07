{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/linear/ArrayFieldVectorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayFieldVectorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 35,
      "end_line": 623,
      "comment": "\n * Test cases for the {@link ArrayFieldVector} class.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ma1"
      ],
      "begin_line": 38,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec1"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec2"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec3"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec4"
      ],
      "begin_line": 46,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec_null"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dvec1"
      ],
      "begin_line": 50,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mat1"
      ],
      "begin_line": 53,
      "end_line": 57,
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
      "begin_line": 61,
      "end_line": 253,
      "comment": " only with enough content to support the test"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Entries of the vector. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.buildArray(int)",
      "begin_line": 75,
      "end_line": 78,
      "comment": " Build an array of elements.\n         * @param length size of the array to build\n         * @return a new array\n         ",
      "child_ranges": [
        "(line 77,col 13)-(line 77,col 79)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.FieldVectorTestImpl(T[])",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 81,col 13)-(line 81,col 36)",
        "(line 82,col 13)-(line 82,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.getField()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 13)-(line 86,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.unsupported()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 13)-(line 90,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.copy()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 13)-(line 94,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.add(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 13)-(line 98,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.add(T[])",
      "begin_line": 101,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 13)-(line 102,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.subtract(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 13)-(line 106,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.subtract(T[])",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 13)-(line 110,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapAdd(T)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 13)-(line 114,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapAddToSelf(T)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 13)-(line 118,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapSubtract(T)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 13)-(line 122,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapSubtractToSelf(T)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 13)-(line 126,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapMultiply(T)",
      "begin_line": 129,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 130,col 13)-(line 130,col 46)",
        "(line 131,col 13)-(line 133,col 13)",
        "(line 134,col 13)-(line 134,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapMultiplyToSelf(T)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 13)-(line 138,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapDivide(T)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 13)-(line 142,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapDivideToSelf(T)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 13)-(line 146,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapInv()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 13)-(line 150,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.mapInvToSelf()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 13)-(line 154,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.ebeMultiply(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 13)-(line 158,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.ebeMultiply(T[])",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 13)-(line 162,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.ebeDivide(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 13)-(line 166,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.ebeDivide(T[])",
      "begin_line": 169,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 13)-(line 170,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.getData()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 13)-(line 174,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.dotProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 177,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 178,col 13)-(line 178,col 36)",
        "(line 179,col 13)-(line 181,col 13)",
        "(line 182,col 13)-(line 182,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.dotProduct(T[])",
      "begin_line": 185,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 186,col 13)-(line 186,col 36)",
        "(line 187,col 13)-(line 189,col 13)",
        "(line 190,col 13)-(line 190,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.projection(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 194,col 13)-(line 194,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.projection(T[])",
      "begin_line": 197,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 13)-(line 198,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.outerProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 201,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 13)-(line 202,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.outerProduct(T[])",
      "begin_line": 205,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 13)-(line 206,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.getEntry(int)",
      "begin_line": 209,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 13)-(line 210,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.getDimension()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 13)-(line 214,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.append(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 218,col 13)-(line 218,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.append(T)",
      "begin_line": 221,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 222,col 13)-(line 222,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.append(T[])",
      "begin_line": 225,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 13)-(line 226,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.getSubVector(int, int)",
      "begin_line": 229,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 230,col 13)-(line 230,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.setEntry(int, T)",
      "begin_line": 233,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 234,col 13)-(line 234,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.setSubVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 237,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 238,col 13)-(line 238,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.setSubVector(int, T[])",
      "begin_line": 241,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 13)-(line 242,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.set(T)",
      "begin_line": 245,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 13)-(line 246,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.FieldVectorTestImpl.toArray()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 250,col 13)-(line 250,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testConstructors()",
      "begin_line": 255,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 100)",
        "(line 258,col 9)-(line 258,col 43)",
        "(line 260,col 9)-(line 260,col 103)",
        "(line 261,col 9)-(line 261,col 43)",
        "(line 262,col 9)-(line 262,col 54)",
        "(line 264,col 9)-(line 264,col 98)",
        "(line 265,col 9)-(line 265,col 43)",
        "(line 266,col 9)-(line 266,col 61)",
        "(line 268,col 9)-(line 268,col 77)",
        "(line 269,col 9)-(line 269,col 43)",
        "(line 270,col 9)-(line 270,col 54)",
        "(line 272,col 9)-(line 272,col 83)",
        "(line 273,col 9)-(line 273,col 43)",
        "(line 274,col 9)-(line 274,col 54)",
        "(line 275,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 284,col 75)",
        "(line 285,col 9)-(line 285,col 45)",
        "(line 286,col 9)-(line 286,col 56)",
        "(line 288,col 9)-(line 288,col 78)",
        "(line 289,col 9)-(line 289,col 43)",
        "(line 290,col 9)-(line 290,col 54)",
        "(line 292,col 9)-(line 292,col 84)",
        "(line 293,col 9)-(line 293,col 43)",
        "(line 294,col 9)-(line 294,col 54)",
        "(line 295,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 304,col 75)",
        "(line 305,col 9)-(line 305,col 43)",
        "(line 306,col 9)-(line 306,col 54)",
        "(line 308,col 9)-(line 308,col 85)",
        "(line 310,col 9)-(line 310,col 79)",
        "(line 311,col 9)-(line 311,col 45)",
        "(line 312,col 9)-(line 312,col 56)",
        "(line 314,col 9)-(line 314,col 81)",
        "(line 315,col 9)-(line 315,col 43)",
        "(line 316,col 9)-(line 316,col 54)",
        "(line 317,col 9)-(line 317,col 69)",
        "(line 319,col 9)-(line 319,col 84)",
        "(line 320,col 9)-(line 320,col 45)",
        "(line 321,col 9)-(line 321,col 56)",
        "(line 322,col 9)-(line 322,col 41)",
        "(line 324,col 9)-(line 324,col 79)",
        "(line 325,col 9)-(line 325,col 44)",
        "(line 326,col 9)-(line 326,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testDataInOut()",
      "begin_line": 330,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 77)",
        "(line 333,col 9)-(line 333,col 77)",
        "(line 334,col 9)-(line 334,col 77)",
        "(line 335,col 9)-(line 335,col 85)",
        "(line 337,col 9)-(line 337,col 57)",
        "(line 338,col 9)-(line 338,col 51)",
        "(line 339,col 9)-(line 339,col 62)",
        "(line 341,col 9)-(line 341,col 70)",
        "(line 342,col 9)-(line 342,col 51)",
        "(line 343,col 9)-(line 343,col 62)",
        "(line 345,col 9)-(line 345,col 59)",
        "(line 346,col 9)-(line 346,col 51)",
        "(line 347,col 9)-(line 347,col 62)",
        "(line 349,col 9)-(line 349,col 59)",
        "(line 350,col 9)-(line 350,col 51)",
        "(line 351,col 9)-(line 351,col 62)",
        "(line 353,col 9)-(line 353,col 49)",
        "(line 354,col 9)-(line 354,col 47)",
        "(line 355,col 9)-(line 355,col 78)",
        "(line 357,col 9)-(line 357,col 41)",
        "(line 358,col 9)-(line 358,col 39)",
        "(line 359,col 9)-(line 359,col 68)",
        "(line 367,col 9)-(line 367,col 60)",
        "(line 368,col 9)-(line 368,col 46)",
        "(line 369,col 9)-(line 369,col 57)",
        "(line 370,col 9)-(line 377,col 9)",
        "(line 379,col 9)-(line 379,col 83)",
        "(line 380,col 9)-(line 380,col 45)",
        "(line 381,col 9)-(line 381,col 59)",
        "(line 382,col 9)-(line 389,col 9)",
        "(line 391,col 9)-(line 391,col 83)",
        "(line 392,col 9)-(line 392,col 26)",
        "(line 393,col 9)-(line 393,col 58)",
        "(line 394,col 9)-(line 394,col 58)",
        "(line 395,col 9)-(line 402,col 9)",
        "(line 404,col 9)-(line 404,col 83)",
        "(line 405,col 9)-(line 405,col 37)",
        "(line 406,col 9)-(line 406,col 59)",
        "(line 408,col 9)-(line 415,col 9)",
        "(line 417,col 9)-(line 417,col 83)",
        "(line 418,col 9)-(line 418,col 37)",
        "(line 419,col 9)-(line 419,col 58)",
        "(line 420,col 9)-(line 420,col 58)",
        "(line 421,col 9)-(line 428,col 9)",
        "(line 431,col 9)-(line 431,col 83)",
        "(line 432,col 9)-(line 432,col 85)",
        "(line 433,col 9)-(line 433,col 39)",
        "(line 434,col 9)-(line 434,col 51)",
        "(line 435,col 9)-(line 435,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testMapFunctions()",
      "begin_line": 439,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 77)",
        "(line 443,col 9)-(line 443,col 68)",
        "(line 444,col 9)-(line 444,col 87)",
        "(line 445,col 9)-(line 445,col 72)",
        "(line 448,col 9)-(line 448,col 57)",
        "(line 449,col 9)-(line 449,col 53)",
        "(line 450,col 9)-(line 450,col 93)",
        "(line 451,col 9)-(line 451,col 84)",
        "(line 454,col 9)-(line 454,col 78)",
        "(line 455,col 9)-(line 455,col 93)",
        "(line 456,col 9)-(line 456,col 82)",
        "(line 459,col 9)-(line 459,col 62)",
        "(line 460,col 9)-(line 460,col 63)",
        "(line 461,col 9)-(line 461,col 99)",
        "(line 462,col 9)-(line 462,col 94)",
        "(line 465,col 9)-(line 465,col 78)",
        "(line 466,col 9)-(line 466,col 92)",
        "(line 467,col 9)-(line 467,col 82)",
        "(line 470,col 9)-(line 470,col 62)",
        "(line 471,col 9)-(line 471,col 63)",
        "(line 472,col 9)-(line 472,col 98)",
        "(line 473,col 9)-(line 473,col 94)",
        "(line 476,col 9)-(line 476,col 74)",
        "(line 477,col 9)-(line 477,col 96)",
        "(line 478,col 9)-(line 478,col 78)",
        "(line 481,col 9)-(line 481,col 60)",
        "(line 482,col 9)-(line 482,col 59)",
        "(line 483,col 9)-(line 483,col 102)",
        "(line 484,col 9)-(line 484,col 90)",
        "(line 487,col 9)-(line 487,col 53)",
        "(line 488,col 9)-(line 488,col 91)",
        "(line 489,col 9)-(line 489,col 72)",
        "(line 492,col 9)-(line 492,col 57)",
        "(line 493,col 9)-(line 493,col 38)",
        "(line 494,col 9)-(line 494,col 97)",
        "(line 495,col 9)-(line 495,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testBasicFunctions()",
      "begin_line": 499,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 77)",
        "(line 501,col 9)-(line 501,col 77)",
        "(line 502,col 9)-(line 502,col 49)",
        "(line 504,col 9)-(line 504,col 85)",
        "(line 507,col 9)-(line 507,col 54)",
        "(line 508,col 9)-(line 508,col 84)",
        "(line 509,col 9)-(line 509,col 63)",
        "(line 511,col 9)-(line 511,col 84)",
        "(line 512,col 9)-(line 512,col 52)",
        "(line 513,col 9)-(line 513,col 86)",
        "(line 514,col 9)-(line 514,col 67)",
        "(line 517,col 9)-(line 517,col 64)",
        "(line 518,col 9)-(line 518,col 92)",
        "(line 519,col 9)-(line 519,col 73)",
        "(line 521,col 9)-(line 521,col 62)",
        "(line 522,col 9)-(line 522,col 94)",
        "(line 523,col 9)-(line 523,col 77)",
        "(line 526,col 9)-(line 526,col 71)",
        "(line 527,col 9)-(line 527,col 94)",
        "(line 528,col 9)-(line 528,col 79)",
        "(line 530,col 9)-(line 530,col 70)",
        "(line 531,col 9)-(line 531,col 96)",
        "(line 532,col 9)-(line 532,col 83)",
        "(line 535,col 9)-(line 535,col 67)",
        "(line 536,col 9)-(line 536,col 99)",
        "(line 537,col 9)-(line 537,col 75)",
        "(line 539,col 9)-(line 539,col 66)",
        "(line 540,col 9)-(line 540,col 101)",
        "(line 541,col 9)-(line 541,col 79)",
        "(line 544,col 9)-(line 544,col 42)",
        "(line 545,col 9)-(line 545,col 59)",
        "(line 548,col 9)-(line 548,col 46)",
        "(line 549,col 9)-(line 549,col 61)",
        "(line 551,col 9)-(line 551,col 67)",
        "(line 552,col 9)-(line 552,col 83)",
        "(line 554,col 9)-(line 554,col 71)",
        "(line 555,col 9)-(line 555,col 85)",
        "(line 557,col 9)-(line 557,col 68)",
        "(line 558,col 9)-(line 558,col 109)",
        "(line 559,col 9)-(line 559,col 78)",
        "(line 561,col 9)-(line 561,col 67)",
        "(line 562,col 9)-(line 562,col 111)",
        "(line 563,col 9)-(line 563,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testMisc()",
      "begin_line": 567,
      "end_line": 606,
      "comment": "",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 77)",
        "(line 569,col 9)-(line 569,col 77)",
        "(line 570,col 9)-(line 570,col 74)",
        "(line 572,col 9)-(line 572,col 36)",
        "(line 573,col 9)-(line 573,col 54)",
        "(line 579,col 9)-(line 586,col 9)",
        "(line 588,col 8)-(line 595,col 9)",
        "(line 597,col 9)-(line 604,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.testSerial()",
      "begin_line": 608,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 76)",
        "(line 610,col 9)-(line 610,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayFieldVectorTest.checkArray(java.lang.String, org.apache.commons.math.fraction.Fraction[], org.apache.commons.math.fraction.Fraction[])",
      "begin_line": 614,
      "end_line": 621,
      "comment": " verifies that two vectors are equals ",
      "child_ranges": [
        "(line 615,col 9)-(line 617,col 9)",
        "(line 618,col 9)-(line 620,col 9)"
      ]
    }
  ]
}