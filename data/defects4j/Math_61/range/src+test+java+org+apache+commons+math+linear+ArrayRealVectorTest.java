{
  "filepath": "/tmp/Math-61b/src/test/java/org/apache/commons/math/linear/ArrayRealVectorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayRealVectorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 1347,
      "comment": "\n * Test cases for the {@link ArrayRealVector} class.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ma1"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec1"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec2"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec3"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec4"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec5"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec_null"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dvec1"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mat1"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " tolerances"
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "RealVectorTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector",
        "java.io.Serializable"
      ],
      "begin_line": 53,
      "end_line": 502,
      "comment": " only with enough content to support the test"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Entries of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.RealVectorTestImpl(double[])",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 13)-(line 62,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unsupported()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 13)-(line 66,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.map(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 13)-(line 70,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 13)-(line 74,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.iterator()",
      "begin_line": 77,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 78,col 13)-(line 99,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-78d3a8ab-319b-484c-ae7f-4cdf82cea6c9.hasNext()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 21)-(line 81,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-7c491940-79e7-4477-9c64-314acc4fd259.next()",
      "begin_line": 83,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 84,col 21)-(line 84,col 38)",
        "(line 85,col 21)-(line 94,col 22)",
        "(line 95,col 21)-(line 95,col 34)",
        "(line 96,col 21)-(line 96,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-ba62a387-532e-417b-91f4-924110dd050c.getValue()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 29)-(line 88,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-48ea7060-e364-47a1-904f-8367ab7b10c9.setValue(double)",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 29)-(line 92,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-8d5d7584-e702-45f3-a7ab-f0f060ce4f45.remove()",
      "begin_line": 98,
      "end_line": 98,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.sparseIterator()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.copy()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 13)-(line 107,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.add(double[])",
      "begin_line": 114,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 13)-(line 119,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.subtract(double[])",
      "begin_line": 122,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 13)-(line 123,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAdd(double)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 13)-(line 127,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAddToSelf(double)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 13)-(line 131,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSubtract(double)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 13)-(line 135,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSubtractToSelf(double)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 13)-(line 139,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapMultiply(double)",
      "begin_line": 142,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 143,col 13)-(line 143,col 51)",
        "(line 144,col 13)-(line 146,col 13)",
        "(line 147,col 13)-(line 147,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapMultiplyToSelf(double)",
      "begin_line": 150,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 13)-(line 151,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapDivide(double)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 13)-(line 155,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapDivideToSelf(double)",
      "begin_line": 158,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 159,col 13)-(line 159,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapPow(double)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 13)-(line 163,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapPowToSelf(double)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 13)-(line 167,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapExp()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 171,col 13)-(line 171,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapExpToSelf()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 13)-(line 175,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapExpm1()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 13)-(line 179,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapExpm1ToSelf()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 183,col 13)-(line 183,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapLog()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 187,col 13)-(line 187,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapLogToSelf()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 13)-(line 191,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapLog10()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 195,col 13)-(line 195,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapLog10ToSelf()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 199,col 13)-(line 199,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapLog1p()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 13)-(line 203,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapLog1pToSelf()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 13)-(line 207,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapCosh()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 13)-(line 211,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapCoshToSelf()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 215,col 13)-(line 215,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSinh()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 219,col 13)-(line 219,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSinhToSelf()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 223,col 13)-(line 223,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapTanh()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 227,col 13)-(line 227,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapTanhToSelf()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 13)-(line 231,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapCos()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 235,col 13)-(line 235,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapCosToSelf()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 239,col 13)-(line 239,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSin()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 243,col 13)-(line 243,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSinToSelf()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapTan()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 13)-(line 251,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapTanToSelf()",
      "begin_line": 254,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 255,col 13)-(line 255,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAcos()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 259,col 13)-(line 259,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAcosToSelf()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 263,col 13)-(line 263,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAsin()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 267,col 13)-(line 267,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAsinToSelf()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 271,col 13)-(line 271,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAtan()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 275,col 13)-(line 275,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAtanToSelf()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 279,col 13)-(line 279,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapInv()",
      "begin_line": 282,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 283,col 13)-(line 283,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapInvToSelf()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 287,col 13)-(line 287,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAbs()",
      "begin_line": 290,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 291,col 13)-(line 291,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAbsToSelf()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 295,col 13)-(line 295,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSqrt()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 299,col 13)-(line 299,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSqrtToSelf()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 303,col 13)-(line 303,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapCbrt()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 307,col 13)-(line 307,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapCbrtToSelf()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 311,col 13)-(line 311,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapCeil()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 13)-(line 315,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapCeilToSelf()",
      "begin_line": 318,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 319,col 13)-(line 319,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapFloor()",
      "begin_line": 322,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 323,col 13)-(line 323,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapFloorToSelf()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 327,col 13)-(line 327,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapRint()",
      "begin_line": 330,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 331,col 13)-(line 331,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapRintToSelf()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 335,col 13)-(line 335,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSignum()",
      "begin_line": 338,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 339,col 13)-(line 339,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSignumToSelf()",
      "begin_line": 342,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 343,col 13)-(line 343,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapUlp()",
      "begin_line": 346,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 347,col 13)-(line 347,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapUlpToSelf()",
      "begin_line": 350,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 351,col 13)-(line 351,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 354,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 355,col 13)-(line 355,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeMultiply(double[])",
      "begin_line": 358,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 359,col 13)-(line 359,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 362,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 363,col 13)-(line 363,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeDivide(double[])",
      "begin_line": 366,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 367,col 13)-(line 367,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getData()",
      "begin_line": 370,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 371,col 13)-(line 371,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 374,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 375,col 13)-(line 375,col 27)",
        "(line 376,col 13)-(line 378,col 13)",
        "(line 379,col 13)-(line 379,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.dotProduct(double[])",
      "begin_line": 382,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 383,col 13)-(line 383,col 27)",
        "(line 384,col 13)-(line 386,col 13)",
        "(line 387,col 13)-(line 387,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getNorm()",
      "begin_line": 390,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 391,col 13)-(line 391,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Norm()",
      "begin_line": 394,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 395,col 13)-(line 395,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfNorm()",
      "begin_line": 398,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 399,col 13)-(line 399,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 402,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 403,col 13)-(line 403,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDistance(double[])",
      "begin_line": 406,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 407,col 13)-(line 407,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 410,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 411,col 13)-(line 411,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Distance(double[])",
      "begin_line": 414,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 415,col 13)-(line 415,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 418,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 419,col 13)-(line 419,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfDistance(double[])",
      "begin_line": 422,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 423,col 13)-(line 423,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unitVector()",
      "begin_line": 426,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 427,col 13)-(line 427,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unitize()",
      "begin_line": 430,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 431,col 13)-(line 431,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 434,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 435,col 13)-(line 435,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.projection(double[])",
      "begin_line": 438,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 439,col 13)-(line 439,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 442,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 443,col 13)-(line 443,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.outerProduct(double[])",
      "begin_line": 446,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 447,col 13)-(line 447,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getEntry(int)",
      "begin_line": 450,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 451,col 13)-(line 451,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDimension()",
      "begin_line": 454,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 455,col 13)-(line 455,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 458,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 459,col 13)-(line 459,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(double)",
      "begin_line": 462,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 463,col 13)-(line 463,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(double[])",
      "begin_line": 466,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 467,col 13)-(line 467,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getSubVector(int, int)",
      "begin_line": 470,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 471,col 13)-(line 471,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setEntry(int, double)",
      "begin_line": 474,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 475,col 13)-(line 475,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 478,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 479,col 13)-(line 479,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setSubVector(int, double[])",
      "begin_line": 482,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 483,col 13)-(line 483,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.set(double)",
      "begin_line": 486,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 487,col 13)-(line 487,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.toArray()",
      "begin_line": 490,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 491,col 13)-(line 491,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.isNaN()",
      "begin_line": 494,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 495,col 13)-(line 495,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.isInfinite()",
      "begin_line": 498,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 499,col 13)-(line 499,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testConstructors()",
      "begin_line": 504,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 51)",
        "(line 507,col 9)-(line 507,col 59)",
        "(line 509,col 9)-(line 509,col 52)",
        "(line 510,col 9)-(line 510,col 59)",
        "(line 511,col 9)-(line 511,col 62)",
        "(line 513,col 9)-(line 513,col 58)",
        "(line 514,col 9)-(line 514,col 59)",
        "(line 515,col 9)-(line 515,col 64)",
        "(line 517,col 9)-(line 517,col 55)",
        "(line 518,col 9)-(line 518,col 59)",
        "(line 519,col 9)-(line 519,col 62)",
        "(line 521,col 9)-(line 521,col 65)",
        "(line 522,col 9)-(line 522,col 63)",
        "(line 523,col 9)-(line 523,col 66)",
        "(line 524,col 9)-(line 524,col 49)",
        "(line 525,col 9)-(line 525,col 46)",
        "(line 527,col 9)-(line 527,col 66)",
        "(line 528,col 9)-(line 528,col 63)",
        "(line 529,col 9)-(line 529,col 66)",
        "(line 530,col 9)-(line 530,col 46)",
        "(line 531,col 9)-(line 531,col 46)",
        "(line 533,col 9)-(line 533,col 61)",
        "(line 534,col 9)-(line 534,col 59)",
        "(line 535,col 9)-(line 535,col 62)",
        "(line 536,col 9)-(line 543,col 9)",
        "(line 545,col 9)-(line 545,col 53)",
        "(line 546,col 9)-(line 546,col 61)",
        "(line 547,col 9)-(line 547,col 64)",
        "(line 549,col 9)-(line 549,col 56)",
        "(line 550,col 9)-(line 550,col 59)",
        "(line 551,col 9)-(line 551,col 62)",
        "(line 553,col 9)-(line 553,col 62)",
        "(line 554,col 9)-(line 554,col 59)",
        "(line 555,col 9)-(line 555,col 62)",
        "(line 556,col 9)-(line 563,col 9)",
        "(line 565,col 9)-(line 565,col 53)",
        "(line 566,col 9)-(line 566,col 59)",
        "(line 567,col 9)-(line 567,col 62)",
        "(line 569,col 9)-(line 569,col 63)",
        "(line 571,col 9)-(line 571,col 57)",
        "(line 572,col 9)-(line 572,col 61)",
        "(line 573,col 9)-(line 573,col 65)",
        "(line 575,col 9)-(line 575,col 59)",
        "(line 576,col 9)-(line 576,col 59)",
        "(line 577,col 9)-(line 577,col 62)",
        "(line 578,col 9)-(line 578,col 69)",
        "(line 580,col 9)-(line 580,col 62)",
        "(line 581,col 9)-(line 581,col 61)",
        "(line 582,col 9)-(line 582,col 64)",
        "(line 583,col 9)-(line 583,col 66)",
        "(line 585,col 9)-(line 585,col 57)",
        "(line 586,col 9)-(line 586,col 60)",
        "(line 587,col 9)-(line 587,col 62)",
        "(line 589,col 9)-(line 589,col 84)",
        "(line 590,col 9)-(line 590,col 60)",
        "(line 591,col 9)-(line 591,col 65)",
        "(line 592,col 9)-(line 592,col 63)",
        "(line 594,col 9)-(line 594,col 84)",
        "(line 595,col 9)-(line 595,col 60)",
        "(line 596,col 9)-(line 596,col 63)",
        "(line 597,col 9)-(line 597,col 65)",
        "(line 599,col 9)-(line 599,col 60)",
        "(line 600,col 9)-(line 600,col 60)",
        "(line 601,col 9)-(line 601,col 65)",
        "(line 602,col 9)-(line 602,col 63)",
        "(line 604,col 9)-(line 604,col 60)",
        "(line 605,col 9)-(line 605,col 60)",
        "(line 606,col 9)-(line 606,col 63)",
        "(line 607,col 9)-(line 607,col 65)",
        "(line 609,col 9)-(line 609,col 62)",
        "(line 610,col 9)-(line 610,col 61)",
        "(line 611,col 9)-(line 611,col 63)",
        "(line 612,col 9)-(line 612,col 63)",
        "(line 614,col 9)-(line 621,col 9)",
        "(line 623,col 9)-(line 630,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testDataInOut()",
      "begin_line": 634,
      "end_line": 745,
      "comment": "",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 55)",
        "(line 637,col 9)-(line 637,col 55)",
        "(line 638,col 9)-(line 638,col 55)",
        "(line 639,col 9)-(line 639,col 63)",
        "(line 641,col 9)-(line 641,col 46)",
        "(line 642,col 9)-(line 642,col 67)",
        "(line 643,col 9)-(line 643,col 70)",
        "(line 645,col 9)-(line 645,col 47)",
        "(line 646,col 9)-(line 646,col 67)",
        "(line 647,col 9)-(line 647,col 70)",
        "(line 649,col 9)-(line 649,col 48)",
        "(line 650,col 9)-(line 650,col 67)",
        "(line 651,col 9)-(line 651,col 67)",
        "(line 653,col 9)-(line 653,col 48)",
        "(line 654,col 9)-(line 654,col 67)",
        "(line 655,col 9)-(line 655,col 70)",
        "(line 657,col 9)-(line 657,col 59)",
        "(line 658,col 9)-(line 658,col 67)",
        "(line 659,col 9)-(line 659,col 70)",
        "(line 661,col 9)-(line 661,col 38)",
        "(line 662,col 9)-(line 662,col 63)",
        "(line 663,col 9)-(line 663,col 78)",
        "(line 665,col 9)-(line 665,col 41)",
        "(line 666,col 9)-(line 666,col 57)",
        "(line 667,col 9)-(line 667,col 70)",
        "(line 675,col 9)-(line 675,col 49)",
        "(line 676,col 9)-(line 676,col 62)",
        "(line 677,col 9)-(line 677,col 65)",
        "(line 678,col 9)-(line 685,col 9)",
        "(line 687,col 9)-(line 687,col 61)",
        "(line 688,col 9)-(line 688,col 33)",
        "(line 689,col 9)-(line 689,col 68)",
        "(line 690,col 9)-(line 697,col 9)",
        "(line 699,col 9)-(line 699,col 61)",
        "(line 700,col 9)-(line 700,col 26)",
        "(line 701,col 9)-(line 701,col 66)",
        "(line 702,col 9)-(line 702,col 66)",
        "(line 703,col 9)-(line 710,col 9)",
        "(line 712,col 9)-(line 712,col 61)",
        "(line 713,col 9)-(line 713,col 25)",
        "(line 714,col 9)-(line 714,col 68)",
        "(line 716,col 9)-(line 723,col 9)",
        "(line 725,col 9)-(line 725,col 61)",
        "(line 726,col 9)-(line 726,col 37)",
        "(line 727,col 9)-(line 727,col 66)",
        "(line 728,col 9)-(line 728,col 66)",
        "(line 729,col 9)-(line 736,col 9)",
        "(line 739,col 9)-(line 739,col 61)",
        "(line 740,col 9)-(line 740,col 63)",
        "(line 741,col 9)-(line 741,col 39)",
        "(line 742,col 9)-(line 742,col 34)",
        "(line 743,col 9)-(line 743,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMapFunctions()",
      "begin_line": 747,
      "end_line": 1073,
      "comment": "",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 55)",
        "(line 751,col 9)-(line 751,col 46)",
        "(line 752,col 9)-(line 752,col 46)",
        "(line 753,col 9)-(line 753,col 87)",
        "(line 756,col 9)-(line 756,col 46)",
        "(line 757,col 9)-(line 757,col 42)",
        "(line 758,col 9)-(line 758,col 52)",
        "(line 759,col 9)-(line 759,col 99)",
        "(line 762,col 9)-(line 762,col 56)",
        "(line 763,col 9)-(line 763,col 52)",
        "(line 764,col 9)-(line 764,col 97)",
        "(line 767,col 9)-(line 767,col 51)",
        "(line 768,col 9)-(line 768,col 52)",
        "(line 769,col 9)-(line 769,col 58)",
        "(line 770,col 9)-(line 770,col 109)",
        "(line 773,col 9)-(line 773,col 56)",
        "(line 774,col 9)-(line 774,col 51)",
        "(line 775,col 9)-(line 775,col 97)",
        "(line 778,col 9)-(line 778,col 51)",
        "(line 779,col 9)-(line 779,col 52)",
        "(line 780,col 9)-(line 780,col 57)",
        "(line 781,col 9)-(line 781,col 109)",
        "(line 784,col 9)-(line 784,col 52)",
        "(line 785,col 9)-(line 785,col 52)",
        "(line 786,col 9)-(line 786,col 93)",
        "(line 789,col 9)-(line 789,col 49)",
        "(line 790,col 9)-(line 790,col 48)",
        "(line 791,col 9)-(line 791,col 58)",
        "(line 792,col 9)-(line 792,col 105)",
        "(line 795,col 9)-(line 795,col 46)",
        "(line 796,col 9)-(line 796,col 46)",
        "(line 797,col 9)-(line 797,col 87)",
        "(line 800,col 9)-(line 800,col 46)",
        "(line 801,col 9)-(line 801,col 42)",
        "(line 802,col 9)-(line 802,col 52)",
        "(line 803,col 9)-(line 803,col 99)",
        "(line 806,col 9)-(line 806,col 42)",
        "(line 807,col 9)-(line 807,col 105)",
        "(line 808,col 9)-(line 808,col 87)",
        "(line 811,col 9)-(line 811,col 46)",
        "(line 812,col 9)-(line 812,col 38)",
        "(line 813,col 9)-(line 813,col 111)",
        "(line 814,col 9)-(line 814,col 99)",
        "(line 818,col 9)-(line 818,col 46)",
        "(line 819,col 9)-(line 819,col 95)",
        "(line 820,col 9)-(line 820,col 91)",
        "(line 823,col 9)-(line 823,col 48)",
        "(line 824,col 9)-(line 824,col 42)",
        "(line 825,col 9)-(line 825,col 101)",
        "(line 826,col 9)-(line 826,col 103)",
        "(line 829,col 9)-(line 829,col 42)",
        "(line 830,col 9)-(line 830,col 85)",
        "(line 831,col 9)-(line 831,col 87)",
        "(line 834,col 9)-(line 834,col 46)",
        "(line 835,col 9)-(line 835,col 38)",
        "(line 836,col 9)-(line 836,col 91)",
        "(line 837,col 9)-(line 837,col 99)",
        "(line 840,col 9)-(line 840,col 46)",
        "(line 841,col 9)-(line 841,col 87)",
        "(line 842,col 9)-(line 842,col 91)",
        "(line 845,col 9)-(line 845,col 48)",
        "(line 846,col 9)-(line 846,col 42)",
        "(line 847,col 9)-(line 847,col 93)",
        "(line 848,col 9)-(line 848,col 103)",
        "(line 851,col 9)-(line 851,col 46)",
        "(line 852,col 9)-(line 852,col 97)",
        "(line 853,col 9)-(line 853,col 91)",
        "(line 856,col 9)-(line 856,col 48)",
        "(line 857,col 9)-(line 857,col 42)",
        "(line 858,col 9)-(line 858,col 103)",
        "(line 859,col 9)-(line 859,col 103)",
        "(line 862,col 9)-(line 862,col 44)",
        "(line 863,col 9)-(line 863,col 106)",
        "(line 864,col 9)-(line 864,col 89)",
        "(line 867,col 9)-(line 867,col 47)",
        "(line 868,col 9)-(line 868,col 40)",
        "(line 869,col 9)-(line 869,col 112)",
        "(line 870,col 9)-(line 870,col 101)",
        "(line 873,col 9)-(line 873,col 44)",
        "(line 874,col 9)-(line 874,col 106)",
        "(line 875,col 9)-(line 875,col 89)",
        "(line 878,col 9)-(line 878,col 47)",
        "(line 879,col 9)-(line 879,col 40)",
        "(line 880,col 9)-(line 880,col 112)",
        "(line 881,col 9)-(line 881,col 101)",
        "(line 884,col 9)-(line 884,col 44)",
        "(line 885,col 9)-(line 885,col 105)",
        "(line 886,col 9)-(line 886,col 89)",
        "(line 889,col 9)-(line 889,col 47)",
        "(line 890,col 9)-(line 890,col 40)",
        "(line 891,col 9)-(line 891,col 111)",
        "(line 892,col 9)-(line 892,col 101)",
        "(line 895,col 9)-(line 895,col 42)",
        "(line 896,col 9)-(line 896,col 107)",
        "(line 897,col 9)-(line 897,col 87)",
        "(line 900,col 9)-(line 900,col 46)",
        "(line 901,col 9)-(line 901,col 38)",
        "(line 902,col 9)-(line 902,col 113)",
        "(line 903,col 9)-(line 903,col 99)",
        "(line 906,col 9)-(line 906,col 42)",
        "(line 907,col 9)-(line 907,col 104)",
        "(line 908,col 9)-(line 908,col 87)",
        "(line 911,col 9)-(line 911,col 46)",
        "(line 912,col 9)-(line 912,col 38)",
        "(line 913,col 9)-(line 913,col 110)",
        "(line 914,col 9)-(line 914,col 99)",
        "(line 917,col 9)-(line 917,col 42)",
        "(line 918,col 9)-(line 918,col 106)",
        "(line 919,col 9)-(line 919,col 87)",
        "(line 922,col 9)-(line 922,col 46)",
        "(line 923,col 9)-(line 923,col 38)",
        "(line 924,col 9)-(line 924,col 112)",
        "(line 925,col 9)-(line 925,col 99)",
        "(line 927,col 9)-(line 927,col 42)",
        "(line 928,col 9)-(line 928,col 57)",
        "(line 931,col 9)-(line 931,col 45)",
        "(line 932,col 9)-(line 932,col 88)",
        "(line 933,col 9)-(line 933,col 89)",
        "(line 936,col 9)-(line 936,col 48)",
        "(line 937,col 9)-(line 937,col 40)",
        "(line 938,col 9)-(line 938,col 94)",
        "(line 939,col 9)-(line 939,col 101)",
        "(line 942,col 9)-(line 942,col 45)",
        "(line 943,col 9)-(line 943,col 87)",
        "(line 944,col 9)-(line 944,col 89)",
        "(line 947,col 9)-(line 947,col 48)",
        "(line 948,col 9)-(line 948,col 40)",
        "(line 949,col 9)-(line 949,col 93)",
        "(line 950,col 9)-(line 950,col 101)",
        "(line 953,col 9)-(line 953,col 45)",
        "(line 954,col 9)-(line 954,col 87)",
        "(line 955,col 9)-(line 955,col 89)",
        "(line 958,col 9)-(line 958,col 48)",
        "(line 959,col 9)-(line 959,col 40)",
        "(line 960,col 9)-(line 960,col 93)",
        "(line 961,col 9)-(line 961,col 101)",
        "(line 964,col 9)-(line 964,col 42)",
        "(line 965,col 9)-(line 965,col 66)",
        "(line 966,col 9)-(line 966,col 87)",
        "(line 969,col 9)-(line 969,col 46)",
        "(line 970,col 9)-(line 970,col 38)",
        "(line 971,col 9)-(line 971,col 72)",
        "(line 972,col 9)-(line 972,col 99)",
        "(line 974,col 9)-(line 974,col 45)",
        "(line 975,col 9)-(line 975,col 59)",
        "(line 978,col 9)-(line 978,col 45)",
        "(line 979,col 9)-(line 979,col 44)",
        "(line 980,col 9)-(line 980,col 87)",
        "(line 983,col 9)-(line 983,col 49)",
        "(line 984,col 9)-(line 984,col 38)",
        "(line 985,col 9)-(line 985,col 50)",
        "(line 986,col 9)-(line 986,col 99)",
        "(line 989,col 9)-(line 989,col 44)",
        "(line 990,col 9)-(line 990,col 85)",
        "(line 991,col 9)-(line 991,col 89)",
        "(line 994,col 9)-(line 994,col 47)",
        "(line 995,col 9)-(line 995,col 40)",
        "(line 996,col 9)-(line 996,col 91)",
        "(line 997,col 9)-(line 997,col 101)",
        "(line 999,col 9)-(line 999,col 46)",
        "(line 1000,col 9)-(line 1000,col 61)",
        "(line 1003,col 9)-(line 1003,col 48)",
        "(line 1004,col 9)-(line 1004,col 80)",
        "(line 1005,col 9)-(line 1005,col 89)",
        "(line 1008,col 9)-(line 1008,col 51)",
        "(line 1009,col 9)-(line 1009,col 40)",
        "(line 1010,col 9)-(line 1010,col 87)",
        "(line 1011,col 9)-(line 1011,col 101)",
        "(line 1013,col 9)-(line 1013,col 46)",
        "(line 1014,col 9)-(line 1014,col 61)",
        "(line 1017,col 9)-(line 1017,col 48)",
        "(line 1018,col 9)-(line 1018,col 46)",
        "(line 1019,col 9)-(line 1019,col 89)",
        "(line 1022,col 9)-(line 1022,col 51)",
        "(line 1023,col 9)-(line 1023,col 40)",
        "(line 1024,col 9)-(line 1024,col 53)",
        "(line 1025,col 9)-(line 1025,col 101)",
        "(line 1028,col 9)-(line 1028,col 50)",
        "(line 1029,col 9)-(line 1029,col 47)",
        "(line 1030,col 9)-(line 1030,col 91)",
        "(line 1033,col 9)-(line 1033,col 52)",
        "(line 1034,col 9)-(line 1034,col 42)",
        "(line 1035,col 9)-(line 1035,col 54)",
        "(line 1036,col 9)-(line 1036,col 103)",
        "(line 1039,col 9)-(line 1039,col 48)",
        "(line 1040,col 9)-(line 1040,col 46)",
        "(line 1041,col 9)-(line 1041,col 89)",
        "(line 1044,col 9)-(line 1044,col 51)",
        "(line 1045,col 9)-(line 1045,col 40)",
        "(line 1046,col 9)-(line 1046,col 53)",
        "(line 1047,col 9)-(line 1047,col 101)",
        "(line 1050,col 9)-(line 1050,col 52)",
        "(line 1051,col 9)-(line 1051,col 48)",
        "(line 1052,col 9)-(line 1052,col 93)",
        "(line 1055,col 9)-(line 1055,col 53)",
        "(line 1056,col 9)-(line 1056,col 44)",
        "(line 1057,col 9)-(line 1057,col 55)",
        "(line 1058,col 9)-(line 1058,col 105)",
        "(line 1063,col 9)-(line 1063,col 46)",
        "(line 1064,col 9)-(line 1064,col 105)",
        "(line 1065,col 9)-(line 1065,col 87)",
        "(line 1068,col 9)-(line 1068,col 50)",
        "(line 1069,col 9)-(line 1069,col 38)",
        "(line 1070,col 9)-(line 1070,col 111)",
        "(line 1071,col 9)-(line 1071,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testBasicFunctions()",
      "begin_line": 1075,
      "end_line": 1227,
      "comment": "",
      "child_ranges": [
        "(line 1076,col 9)-(line 1076,col 55)",
        "(line 1077,col 9)-(line 1077,col 55)",
        "(line 1078,col 9)-(line 1078,col 55)",
        "(line 1079,col 9)-(line 1079,col 63)",
        "(line 1081,col 9)-(line 1081,col 63)",
        "(line 1084,col 9)-(line 1084,col 40)",
        "(line 1085,col 9)-(line 1085,col 75)",
        "(line 1088,col 9)-(line 1088,col 44)",
        "(line 1089,col 9)-(line 1089,col 60)",
        "(line 1092,col 9)-(line 1092,col 48)",
        "(line 1093,col 9)-(line 1093,col 61)",
        "(line 1097,col 9)-(line 1097,col 41)",
        "(line 1098,col 9)-(line 1098,col 74)",
        "(line 1101,col 9)-(line 1101,col 45)",
        "(line 1102,col 9)-(line 1102,col 76)",
        "(line 1105,col 9)-(line 1105,col 56)",
        "(line 1106,col 9)-(line 1106,col 76)",
        "(line 1109,col 9)-(line 1109,col 55)",
        "(line 1110,col 9)-(line 1110,col 62)",
        "(line 1112,col 9)-(line 1112,col 59)",
        "(line 1113,col 9)-(line 1113,col 64)",
        "(line 1115,col 9)-(line 1115,col 70)",
        "(line 1116,col 9)-(line 1116,col 64)",
        "(line 1119,col 9)-(line 1119,col 59)",
        "(line 1120,col 9)-(line 1120,col 64)",
        "(line 1122,col 9)-(line 1122,col 63)",
        "(line 1123,col 9)-(line 1123,col 66)",
        "(line 1125,col 9)-(line 1125,col 74)",
        "(line 1126,col 9)-(line 1126,col 66)",
        "(line 1129,col 9)-(line 1129,col 43)",
        "(line 1130,col 9)-(line 1130,col 43)",
        "(line 1131,col 9)-(line 1131,col 78)",
        "(line 1133,col 9)-(line 1133,col 62)",
        "(line 1134,col 9)-(line 1134,col 41)",
        "(line 1135,col 9)-(line 1135,col 45)",
        "(line 1136,col 9)-(line 1136,col 82)",
        "(line 1139,col 9)-(line 1139,col 53)",
        "(line 1140,col 9)-(line 1140,col 51)",
        "(line 1141,col 9)-(line 1141,col 88)",
        "(line 1143,col 9)-(line 1143,col 51)",
        "(line 1144,col 9)-(line 1144,col 53)",
        "(line 1145,col 9)-(line 1145,col 92)",
        "(line 1148,col 9)-(line 1148,col 60)",
        "(line 1149,col 9)-(line 1149,col 53)",
        "(line 1150,col 9)-(line 1150,col 94)",
        "(line 1152,col 9)-(line 1152,col 59)",
        "(line 1153,col 9)-(line 1153,col 55)",
        "(line 1154,col 9)-(line 1154,col 98)",
        "(line 1156,col 9)-(line 1156,col 70)",
        "(line 1157,col 9)-(line 1157,col 55)",
        "(line 1158,col 9)-(line 1158,col 98)",
        "(line 1161,col 9)-(line 1161,col 56)",
        "(line 1162,col 9)-(line 1162,col 56)",
        "(line 1163,col 9)-(line 1163,col 90)",
        "(line 1165,col 9)-(line 1165,col 55)",
        "(line 1166,col 9)-(line 1166,col 58)",
        "(line 1167,col 9)-(line 1167,col 94)",
        "(line 1169,col 9)-(line 1169,col 66)",
        "(line 1170,col 9)-(line 1170,col 58)",
        "(line 1171,col 9)-(line 1171,col 94)",
        "(line 1174,col 9)-(line 1174,col 40)",
        "(line 1175,col 9)-(line 1175,col 46)",
        "(line 1178,col 9)-(line 1178,col 44)",
        "(line 1179,col 9)-(line 1179,col 48)",
        "(line 1181,col 9)-(line 1181,col 56)",
        "(line 1182,col 9)-(line 1182,col 70)",
        "(line 1184,col 9)-(line 1184,col 60)",
        "(line 1185,col 9)-(line 1185,col 72)",
        "(line 1187,col 9)-(line 1187,col 71)",
        "(line 1188,col 9)-(line 1188,col 72)",
        "(line 1190,col 9)-(line 1190,col 50)",
        "(line 1191,col 9)-(line 1191,col 63)",
        "(line 1192,col 9)-(line 1192,col 99)",
        "(line 1194,col 9)-(line 1201,col 9)",
        "(line 1203,col 9)-(line 1203,col 63)",
        "(line 1204,col 9)-(line 1204,col 28)",
        "(line 1205,col 9)-(line 1205,col 96)",
        "(line 1206,col 9)-(line 1213,col 9)",
        "(line 1215,col 9)-(line 1215,col 57)",
        "(line 1216,col 9)-(line 1216,col 96)",
        "(line 1217,col 9)-(line 1217,col 94)",
        "(line 1219,col 9)-(line 1219,col 56)",
        "(line 1220,col 9)-(line 1220,col 98)",
        "(line 1221,col 9)-(line 1221,col 98)",
        "(line 1223,col 9)-(line 1223,col 64)",
        "(line 1224,col 9)-(line 1224,col 98)",
        "(line 1225,col 9)-(line 1225,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMisc()",
      "begin_line": 1229,
      "end_line": 1268,
      "comment": "",
      "child_ranges": [
        "(line 1230,col 9)-(line 1230,col 55)",
        "(line 1231,col 9)-(line 1231,col 55)",
        "(line 1232,col 9)-(line 1232,col 52)",
        "(line 1234,col 9)-(line 1234,col 36)",
        "(line 1235,col 9)-(line 1235,col 54)",
        "(line 1241,col 9)-(line 1248,col 9)",
        "(line 1250,col 8)-(line 1257,col 9)",
        "(line 1259,col 9)-(line 1266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testPredicates()",
      "begin_line": 1270,
      "end_line": 1304,
      "comment": "",
      "child_ranges": [
        "(line 1272,col 9)-(line 1272,col 74)",
        "(line 1274,col 9)-(line 1274,col 31)",
        "(line 1275,col 9)-(line 1275,col 34)",
        "(line 1276,col 9)-(line 1276,col 30)",
        "(line 1278,col 9)-(line 1278,col 36)",
        "(line 1279,col 9)-(line 1279,col 48)",
        "(line 1280,col 9)-(line 1280,col 36)",
        "(line 1281,col 9)-(line 1281,col 25)",
        "(line 1282,col 9)-(line 1282,col 35)",
        "(line 1283,col 9)-(line 1283,col 25)",
        "(line 1284,col 9)-(line 1284,col 36)",
        "(line 1286,col 9)-(line 1286,col 25)",
        "(line 1287,col 9)-(line 1287,col 71)",
        "(line 1288,col 9)-(line 1288,col 89)",
        "(line 1289,col 9)-(line 1289,col 75)",
        "(line 1291,col 9)-(line 1292,col 88)",
        "(line 1294,col 9)-(line 1295,col 77)",
        "(line 1297,col 9)-(line 1297,col 32)",
        "(line 1298,col 9)-(line 1298,col 39)",
        "(line 1299,col 9)-(line 1299,col 36)",
        "(line 1300,col 9)-(line 1300,col 46)",
        "(line 1301,col 9)-(line 1301,col 71)",
        "(line 1302,col 9)-(line 1302,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testSerial()",
      "begin_line": 1306,
      "end_line": 1309,
      "comment": "",
      "child_ranges": [
        "(line 1307,col 9)-(line 1307,col 74)",
        "(line 1308,col 9)-(line 1308,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMinMax()",
      "begin_line": 1312,
      "end_line": 1333,
      "comment": "",
      "child_ranges": [
        "(line 1313,col 9)-(line 1313,col 83)",
        "(line 1314,col 9)-(line 1314,col 43)",
        "(line 1315,col 9)-(line 1315,col 52)",
        "(line 1316,col 9)-(line 1316,col 43)",
        "(line 1317,col 9)-(line 1317,col 52)",
        "(line 1318,col 9)-(line 1318,col 97)",
        "(line 1319,col 9)-(line 1319,col 43)",
        "(line 1320,col 9)-(line 1320,col 52)",
        "(line 1321,col 9)-(line 1321,col 43)",
        "(line 1322,col 9)-(line 1322,col 51)",
        "(line 1323,col 9)-(line 1323,col 90)",
        "(line 1324,col 9)-(line 1324,col 44)",
        "(line 1325,col 9)-(line 1325,col 51)",
        "(line 1326,col 9)-(line 1326,col 44)",
        "(line 1327,col 9)-(line 1327,col 51)",
        "(line 1328,col 9)-(line 1328,col 64)",
        "(line 1329,col 9)-(line 1329,col 44)",
        "(line 1330,col 9)-(line 1330,col 51)",
        "(line 1331,col 9)-(line 1331,col 44)",
        "(line 1332,col 9)-(line 1332,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.assertClose(java.lang.String, double[], double[], double)",
      "begin_line": 1337,
      "end_line": 1345,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 1339,col 9)-(line 1341,col 9)",
        "(line 1342,col 9)-(line 1344,col 9)"
      ]
    }
  ]
}