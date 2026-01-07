{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/linear/SparseRealVectorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SparseRealVectorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 1115,
      "comment": "\n * Test cases for the {@link OpenMapRealVector} class.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ma1"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec1"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec2"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec3"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec4"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec_null"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dvec1"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mat1"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " tolerances"
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "SparseRealVectorTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealVector",
        "java.io.Serializable"
      ],
      "begin_line": 50,
      "end_line": 462,
      "comment": " only with enough content to support the test"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Entries of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.SparseRealVectorTestImpl(double[])",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 13)-(line 59,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.unsupported()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 13)-(line 63,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.copy()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 13)-(line 67,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 13)-(line 71,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.add(double[])",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 13)-(line 75,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 13)-(line 79,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.subtract(double[])",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 13)-(line 83,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAdd(double)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 13)-(line 87,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAddToSelf(double)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSubtract(double)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 13)-(line 95,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSubtractToSelf(double)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 13)-(line 99,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapMultiply(double)",
      "begin_line": 102,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 51)",
        "(line 104,col 13)-(line 106,col 13)",
        "(line 107,col 13)-(line 107,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapMultiplyToSelf(double)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapDivide(double)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapDivideToSelf(double)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 13)-(line 119,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapPow(double)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 13)-(line 123,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapPowToSelf(double)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 13)-(line 127,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapExp()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 13)-(line 131,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapExpToSelf()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 13)-(line 135,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapExpm1()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 13)-(line 139,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapExpm1ToSelf()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 13)-(line 143,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapLog()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 13)-(line 147,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapLogToSelf()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 13)-(line 151,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapLog10()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 13)-(line 155,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapLog10ToSelf()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 159,col 13)-(line 159,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapLog1p()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 13)-(line 163,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapLog1pToSelf()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 13)-(line 167,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapCosh()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 171,col 13)-(line 171,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapCoshToSelf()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 13)-(line 175,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSinh()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 13)-(line 179,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSinhToSelf()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 183,col 13)-(line 183,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapTanh()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 187,col 13)-(line 187,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapTanhToSelf()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 13)-(line 191,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapCos()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 195,col 13)-(line 195,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapCosToSelf()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 199,col 13)-(line 199,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSin()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 13)-(line 203,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSinToSelf()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 13)-(line 207,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapTan()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 13)-(line 211,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapTanToSelf()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 215,col 13)-(line 215,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAcos()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 219,col 13)-(line 219,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAcosToSelf()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 223,col 13)-(line 223,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAsin()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 227,col 13)-(line 227,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAsinToSelf()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 13)-(line 231,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAtan()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 235,col 13)-(line 235,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAtanToSelf()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 239,col 13)-(line 239,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapInv()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 243,col 13)-(line 243,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapInvToSelf()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAbs()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 13)-(line 251,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapAbsToSelf()",
      "begin_line": 254,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 255,col 13)-(line 255,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSqrt()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 259,col 13)-(line 259,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSqrtToSelf()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 263,col 13)-(line 263,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapCbrt()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 267,col 13)-(line 267,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapCbrtToSelf()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 271,col 13)-(line 271,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapCeil()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 275,col 13)-(line 275,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapCeilToSelf()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 279,col 13)-(line 279,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapFloor()",
      "begin_line": 282,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 283,col 13)-(line 283,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapFloorToSelf()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 287,col 13)-(line 287,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapRint()",
      "begin_line": 290,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 291,col 13)-(line 291,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapRintToSelf()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 295,col 13)-(line 295,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSignum()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 299,col 13)-(line 299,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapSignumToSelf()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 303,col 13)-(line 303,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapUlp()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 307,col 13)-(line 307,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.mapUlpToSelf()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 311,col 13)-(line 311,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 314,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 13)-(line 315,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.ebeMultiply(double[])",
      "begin_line": 318,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 319,col 13)-(line 319,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 323,col 13)-(line 323,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.ebeDivide(double[])",
      "begin_line": 326,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 327,col 13)-(line 327,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getData()",
      "begin_line": 330,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 331,col 13)-(line 331,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 334,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 335,col 13)-(line 335,col 27)",
        "(line 336,col 13)-(line 338,col 13)",
        "(line 339,col 13)-(line 339,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.dotProduct(double[])",
      "begin_line": 342,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 343,col 13)-(line 343,col 27)",
        "(line 344,col 13)-(line 346,col 13)",
        "(line 347,col 13)-(line 347,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getNorm()",
      "begin_line": 350,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 351,col 13)-(line 351,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getL1Norm()",
      "begin_line": 354,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 355,col 13)-(line 355,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getLInfNorm()",
      "begin_line": 358,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 359,col 13)-(line 359,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 362,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 363,col 13)-(line 363,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getDistance(double[])",
      "begin_line": 366,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 367,col 13)-(line 367,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 370,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 371,col 13)-(line 371,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getL1Distance(double[])",
      "begin_line": 374,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 375,col 13)-(line 375,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 378,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 379,col 13)-(line 379,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getLInfDistance(double[])",
      "begin_line": 382,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 383,col 13)-(line 383,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.unitVector()",
      "begin_line": 386,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 387,col 13)-(line 387,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.unitize()",
      "begin_line": 390,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 391,col 13)-(line 391,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 394,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 395,col 13)-(line 395,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.projection(double[])",
      "begin_line": 398,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 399,col 13)-(line 399,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 402,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 403,col 13)-(line 403,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.outerProduct(double[])",
      "begin_line": 406,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 407,col 13)-(line 407,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getEntry(int)",
      "begin_line": 410,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 411,col 13)-(line 411,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getDimension()",
      "begin_line": 414,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 415,col 13)-(line 415,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 418,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 419,col 13)-(line 419,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.append(double)",
      "begin_line": 422,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 423,col 13)-(line 423,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.append(double[])",
      "begin_line": 426,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 427,col 13)-(line 427,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.getSubVector(int, int)",
      "begin_line": 430,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 431,col 13)-(line 431,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.setEntry(int, double)",
      "begin_line": 434,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 435,col 13)-(line 435,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 438,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 439,col 13)-(line 439,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.setSubVector(int, double[])",
      "begin_line": 442,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 443,col 13)-(line 443,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.set(double)",
      "begin_line": 446,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 447,col 13)-(line 447,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.toArray()",
      "begin_line": 450,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 451,col 13)-(line 451,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.isNaN()",
      "begin_line": 454,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 455,col 13)-(line 455,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl.isInfinite()",
      "begin_line": 458,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 459,col 13)-(line 459,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.suite()",
      "begin_line": 464,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 68)",
        "(line 466,col 9)-(line 466,col 48)",
        "(line 467,col 9)-(line 467,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.testConstructors()",
      "begin_line": 470,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 55)",
        "(line 473,col 9)-(line 473,col 59)",
        "(line 475,col 9)-(line 475,col 56)",
        "(line 476,col 9)-(line 476,col 59)",
        "(line 477,col 9)-(line 477,col 62)",
        "(line 479,col 9)-(line 479,col 59)",
        "(line 480,col 9)-(line 480,col 59)",
        "(line 481,col 9)-(line 481,col 62)",
        "(line 495,col 9)-(line 495,col 55)",
        "(line 496,col 9)-(line 496,col 61)",
        "(line 497,col 9)-(line 497,col 64)",
        "(line 499,col 9)-(line 499,col 60)",
        "(line 500,col 9)-(line 500,col 59)",
        "(line 501,col 9)-(line 501,col 62)",
        "(line 503,col 9)-(line 503,col 57)",
        "(line 504,col 9)-(line 504,col 59)",
        "(line 505,col 9)-(line 505,col 62)",
        "(line 507,col 9)-(line 507,col 75)",
        "(line 509,col 9)-(line 509,col 61)",
        "(line 510,col 9)-(line 510,col 61)",
        "(line 511,col 9)-(line 511,col 65)",
        "(line 513,col 9)-(line 513,col 57)",
        "(line 514,col 9)-(line 514,col 59)",
        "(line 515,col 9)-(line 515,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.testDataInOut()",
      "begin_line": 519,
      "end_line": 606,
      "comment": "",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 59)",
        "(line 522,col 9)-(line 522,col 59)",
        "(line 523,col 9)-(line 523,col 59)",
        "(line 524,col 9)-(line 524,col 75)",
        "(line 526,col 9)-(line 526,col 46)",
        "(line 527,col 9)-(line 527,col 67)",
        "(line 528,col 9)-(line 528,col 70)",
        "(line 530,col 9)-(line 530,col 47)",
        "(line 531,col 9)-(line 531,col 67)",
        "(line 532,col 9)-(line 532,col 70)",
        "(line 534,col 9)-(line 534,col 48)",
        "(line 535,col 9)-(line 535,col 67)",
        "(line 536,col 9)-(line 536,col 67)",
        "(line 538,col 6)-(line 538,col 45)",
        "(line 539,col 9)-(line 539,col 67)",
        "(line 540,col 9)-(line 540,col 70)",
        "(line 542,col 9)-(line 542,col 49)",
        "(line 543,col 9)-(line 543,col 62)",
        "(line 544,col 9)-(line 544,col 65)",
        "(line 545,col 9)-(line 552,col 9)",
        "(line 554,col 9)-(line 554,col 65)",
        "(line 555,col 9)-(line 555,col 33)",
        "(line 556,col 9)-(line 556,col 68)",
        "(line 557,col 9)-(line 564,col 9)",
        "(line 566,col 9)-(line 566,col 65)",
        "(line 567,col 9)-(line 567,col 35)",
        "(line 568,col 9)-(line 568,col 66)",
        "(line 569,col 9)-(line 569,col 66)",
        "(line 570,col 9)-(line 577,col 9)",
        "(line 579,col 9)-(line 579,col 65)",
        "(line 580,col 9)-(line 580,col 25)",
        "(line 581,col 9)-(line 581,col 68)",
        "(line 583,col 9)-(line 590,col 9)",
        "(line 592,col 9)-(line 592,col 65)",
        "(line 593,col 9)-(line 593,col 37)",
        "(line 594,col 9)-(line 594,col 66)",
        "(line 595,col 9)-(line 595,col 66)",
        "(line 596,col 9)-(line 603,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.testMapFunctions()",
      "begin_line": 608,
      "end_line": 934,
      "comment": "",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 59)",
        "(line 612,col 9)-(line 612,col 46)",
        "(line 613,col 9)-(line 613,col 46)",
        "(line 614,col 9)-(line 614,col 87)",
        "(line 617,col 9)-(line 617,col 46)",
        "(line 618,col 9)-(line 618,col 42)",
        "(line 619,col 9)-(line 619,col 52)",
        "(line 620,col 9)-(line 620,col 99)",
        "(line 623,col 9)-(line 623,col 56)",
        "(line 624,col 9)-(line 624,col 52)",
        "(line 625,col 9)-(line 625,col 97)",
        "(line 628,col 9)-(line 628,col 51)",
        "(line 629,col 9)-(line 629,col 52)",
        "(line 630,col 9)-(line 630,col 58)",
        "(line 631,col 9)-(line 631,col 109)",
        "(line 634,col 9)-(line 634,col 56)",
        "(line 635,col 9)-(line 635,col 51)",
        "(line 636,col 9)-(line 636,col 97)",
        "(line 639,col 9)-(line 639,col 51)",
        "(line 640,col 9)-(line 640,col 52)",
        "(line 641,col 9)-(line 641,col 57)",
        "(line 642,col 9)-(line 642,col 109)",
        "(line 645,col 9)-(line 645,col 52)",
        "(line 646,col 9)-(line 646,col 52)",
        "(line 647,col 9)-(line 647,col 93)",
        "(line 650,col 9)-(line 650,col 49)",
        "(line 651,col 9)-(line 651,col 48)",
        "(line 652,col 9)-(line 652,col 58)",
        "(line 653,col 9)-(line 653,col 105)",
        "(line 656,col 9)-(line 656,col 46)",
        "(line 657,col 9)-(line 657,col 46)",
        "(line 658,col 9)-(line 658,col 87)",
        "(line 661,col 9)-(line 661,col 46)",
        "(line 662,col 9)-(line 662,col 42)",
        "(line 663,col 9)-(line 663,col 52)",
        "(line 664,col 9)-(line 664,col 99)",
        "(line 667,col 9)-(line 667,col 42)",
        "(line 668,col 9)-(line 668,col 105)",
        "(line 669,col 9)-(line 669,col 87)",
        "(line 672,col 9)-(line 672,col 46)",
        "(line 673,col 9)-(line 673,col 38)",
        "(line 674,col 9)-(line 674,col 111)",
        "(line 675,col 9)-(line 675,col 99)",
        "(line 679,col 9)-(line 679,col 46)",
        "(line 680,col 9)-(line 680,col 95)",
        "(line 681,col 9)-(line 681,col 91)",
        "(line 684,col 9)-(line 684,col 48)",
        "(line 685,col 9)-(line 685,col 42)",
        "(line 686,col 9)-(line 686,col 101)",
        "(line 687,col 9)-(line 687,col 103)",
        "(line 690,col 9)-(line 690,col 42)",
        "(line 691,col 9)-(line 691,col 85)",
        "(line 692,col 9)-(line 692,col 87)",
        "(line 695,col 9)-(line 695,col 46)",
        "(line 696,col 9)-(line 696,col 38)",
        "(line 697,col 9)-(line 697,col 91)",
        "(line 698,col 9)-(line 698,col 99)",
        "(line 701,col 9)-(line 701,col 46)",
        "(line 702,col 9)-(line 702,col 87)",
        "(line 703,col 9)-(line 703,col 91)",
        "(line 706,col 9)-(line 706,col 48)",
        "(line 707,col 9)-(line 707,col 42)",
        "(line 708,col 9)-(line 708,col 93)",
        "(line 709,col 9)-(line 709,col 103)",
        "(line 712,col 9)-(line 712,col 46)",
        "(line 713,col 9)-(line 713,col 97)",
        "(line 714,col 9)-(line 714,col 91)",
        "(line 717,col 9)-(line 717,col 48)",
        "(line 718,col 9)-(line 718,col 42)",
        "(line 719,col 9)-(line 719,col 103)",
        "(line 720,col 9)-(line 720,col 103)",
        "(line 723,col 9)-(line 723,col 44)",
        "(line 724,col 9)-(line 724,col 106)",
        "(line 725,col 9)-(line 725,col 89)",
        "(line 728,col 9)-(line 728,col 47)",
        "(line 729,col 9)-(line 729,col 40)",
        "(line 730,col 9)-(line 730,col 112)",
        "(line 731,col 9)-(line 731,col 101)",
        "(line 734,col 9)-(line 734,col 44)",
        "(line 735,col 9)-(line 735,col 106)",
        "(line 736,col 9)-(line 736,col 89)",
        "(line 739,col 9)-(line 739,col 47)",
        "(line 740,col 9)-(line 740,col 40)",
        "(line 741,col 9)-(line 741,col 112)",
        "(line 742,col 9)-(line 742,col 101)",
        "(line 745,col 9)-(line 745,col 44)",
        "(line 746,col 9)-(line 746,col 105)",
        "(line 747,col 9)-(line 747,col 89)",
        "(line 750,col 9)-(line 750,col 47)",
        "(line 751,col 9)-(line 751,col 40)",
        "(line 752,col 9)-(line 752,col 111)",
        "(line 753,col 9)-(line 753,col 101)",
        "(line 756,col 9)-(line 756,col 42)",
        "(line 757,col 9)-(line 757,col 107)",
        "(line 758,col 9)-(line 758,col 87)",
        "(line 761,col 9)-(line 761,col 46)",
        "(line 762,col 9)-(line 762,col 38)",
        "(line 763,col 9)-(line 763,col 113)",
        "(line 764,col 9)-(line 764,col 99)",
        "(line 767,col 9)-(line 767,col 42)",
        "(line 768,col 9)-(line 768,col 104)",
        "(line 769,col 9)-(line 769,col 87)",
        "(line 772,col 9)-(line 772,col 46)",
        "(line 773,col 9)-(line 773,col 38)",
        "(line 774,col 9)-(line 774,col 110)",
        "(line 775,col 9)-(line 775,col 99)",
        "(line 778,col 9)-(line 778,col 42)",
        "(line 779,col 9)-(line 779,col 106)",
        "(line 780,col 9)-(line 780,col 87)",
        "(line 783,col 9)-(line 783,col 46)",
        "(line 784,col 9)-(line 784,col 38)",
        "(line 785,col 9)-(line 785,col 112)",
        "(line 786,col 9)-(line 786,col 99)",
        "(line 788,col 9)-(line 788,col 42)",
        "(line 789,col 9)-(line 789,col 61)",
        "(line 792,col 9)-(line 792,col 45)",
        "(line 793,col 9)-(line 793,col 88)",
        "(line 794,col 9)-(line 794,col 89)",
        "(line 797,col 9)-(line 797,col 48)",
        "(line 798,col 9)-(line 798,col 40)",
        "(line 799,col 9)-(line 799,col 94)",
        "(line 800,col 9)-(line 800,col 101)",
        "(line 803,col 9)-(line 803,col 45)",
        "(line 804,col 9)-(line 804,col 87)",
        "(line 805,col 9)-(line 805,col 89)",
        "(line 808,col 9)-(line 808,col 48)",
        "(line 809,col 9)-(line 809,col 40)",
        "(line 810,col 9)-(line 810,col 93)",
        "(line 811,col 9)-(line 811,col 101)",
        "(line 814,col 9)-(line 814,col 45)",
        "(line 815,col 9)-(line 815,col 87)",
        "(line 816,col 9)-(line 816,col 89)",
        "(line 819,col 9)-(line 819,col 48)",
        "(line 820,col 9)-(line 820,col 40)",
        "(line 821,col 9)-(line 821,col 93)",
        "(line 822,col 9)-(line 822,col 101)",
        "(line 825,col 9)-(line 825,col 42)",
        "(line 826,col 9)-(line 826,col 66)",
        "(line 827,col 9)-(line 827,col 87)",
        "(line 830,col 9)-(line 830,col 46)",
        "(line 831,col 9)-(line 831,col 38)",
        "(line 832,col 9)-(line 832,col 72)",
        "(line 833,col 9)-(line 833,col 99)",
        "(line 835,col 9)-(line 835,col 45)",
        "(line 836,col 9)-(line 836,col 63)",
        "(line 839,col 9)-(line 839,col 45)",
        "(line 840,col 9)-(line 840,col 44)",
        "(line 841,col 9)-(line 841,col 87)",
        "(line 844,col 9)-(line 844,col 49)",
        "(line 845,col 9)-(line 845,col 38)",
        "(line 846,col 9)-(line 846,col 50)",
        "(line 847,col 9)-(line 847,col 99)",
        "(line 850,col 9)-(line 850,col 44)",
        "(line 851,col 9)-(line 851,col 85)",
        "(line 852,col 9)-(line 852,col 89)",
        "(line 855,col 9)-(line 855,col 47)",
        "(line 856,col 9)-(line 856,col 40)",
        "(line 857,col 9)-(line 857,col 91)",
        "(line 858,col 9)-(line 858,col 101)",
        "(line 860,col 9)-(line 860,col 46)",
        "(line 861,col 9)-(line 861,col 65)",
        "(line 864,col 9)-(line 864,col 48)",
        "(line 865,col 9)-(line 865,col 80)",
        "(line 866,col 9)-(line 866,col 89)",
        "(line 869,col 9)-(line 869,col 51)",
        "(line 870,col 9)-(line 870,col 40)",
        "(line 871,col 9)-(line 871,col 87)",
        "(line 872,col 9)-(line 872,col 101)",
        "(line 874,col 9)-(line 874,col 46)",
        "(line 875,col 9)-(line 875,col 65)",
        "(line 878,col 9)-(line 878,col 48)",
        "(line 879,col 9)-(line 879,col 46)",
        "(line 880,col 9)-(line 880,col 89)",
        "(line 883,col 9)-(line 883,col 51)",
        "(line 884,col 9)-(line 884,col 40)",
        "(line 885,col 9)-(line 885,col 53)",
        "(line 886,col 9)-(line 886,col 101)",
        "(line 889,col 9)-(line 889,col 50)",
        "(line 890,col 9)-(line 890,col 47)",
        "(line 891,col 9)-(line 891,col 91)",
        "(line 894,col 9)-(line 894,col 52)",
        "(line 895,col 9)-(line 895,col 42)",
        "(line 896,col 9)-(line 896,col 54)",
        "(line 897,col 9)-(line 897,col 103)",
        "(line 900,col 9)-(line 900,col 48)",
        "(line 901,col 9)-(line 901,col 46)",
        "(line 902,col 9)-(line 902,col 89)",
        "(line 905,col 9)-(line 905,col 51)",
        "(line 906,col 9)-(line 906,col 40)",
        "(line 907,col 9)-(line 907,col 53)",
        "(line 908,col 9)-(line 908,col 101)",
        "(line 911,col 9)-(line 911,col 52)",
        "(line 912,col 9)-(line 912,col 48)",
        "(line 913,col 9)-(line 913,col 93)",
        "(line 916,col 9)-(line 916,col 53)",
        "(line 917,col 9)-(line 917,col 44)",
        "(line 918,col 9)-(line 918,col 55)",
        "(line 919,col 9)-(line 919,col 105)",
        "(line 924,col 9)-(line 924,col 46)",
        "(line 925,col 9)-(line 925,col 105)",
        "(line 926,col 9)-(line 926,col 87)",
        "(line 929,col 9)-(line 929,col 50)",
        "(line 930,col 9)-(line 930,col 38)",
        "(line 931,col 9)-(line 931,col 111)",
        "(line 932,col 9)-(line 932,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.testBasicFunctions()",
      "begin_line": 936,
      "end_line": 1059,
      "comment": "",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 59)",
        "(line 938,col 9)-(line 938,col 59)",
        "(line 939,col 9)-(line 939,col 67)",
        "(line 941,col 9)-(line 941,col 75)",
        "(line 944,col 9)-(line 944,col 40)",
        "(line 945,col 9)-(line 945,col 71)",
        "(line 947,col 9)-(line 947,col 44)",
        "(line 948,col 9)-(line 948,col 58)",
        "(line 950,col 9)-(line 950,col 48)",
        "(line 951,col 9)-(line 951,col 60)",
        "(line 954,col 9)-(line 954,col 41)",
        "(line 955,col 9)-(line 955,col 74)",
        "(line 958,col 9)-(line 958,col 45)",
        "(line 959,col 9)-(line 959,col 76)",
        "(line 962,col 9)-(line 962,col 55)",
        "(line 963,col 9)-(line 963,col 62)",
        "(line 965,col 9)-(line 965,col 59)",
        "(line 966,col 9)-(line 966,col 64)",
        "(line 969,col 9)-(line 969,col 59)",
        "(line 970,col 9)-(line 970,col 64)",
        "(line 972,col 9)-(line 972,col 63)",
        "(line 973,col 9)-(line 973,col 66)",
        "(line 976,col 9)-(line 976,col 45)",
        "(line 977,col 9)-(line 977,col 43)",
        "(line 978,col 9)-(line 978,col 78)",
        "(line 980,col 9)-(line 980,col 74)",
        "(line 981,col 9)-(line 981,col 41)",
        "(line 982,col 9)-(line 982,col 45)",
        "(line 983,col 9)-(line 983,col 82)",
        "(line 986,col 9)-(line 986,col 55)",
        "(line 987,col 9)-(line 987,col 51)",
        "(line 988,col 9)-(line 988,col 88)",
        "(line 990,col 9)-(line 990,col 51)",
        "(line 991,col 9)-(line 991,col 53)",
        "(line 992,col 9)-(line 992,col 92)",
        "(line 995,col 9)-(line 995,col 55)",
        "(line 996,col 9)-(line 996,col 53)",
        "(line 997,col 9)-(line 997,col 94)",
        "(line 999,col 9)-(line 999,col 59)",
        "(line 1000,col 9)-(line 1000,col 55)",
        "(line 1001,col 9)-(line 1001,col 98)",
        "(line 1004,col 9)-(line 1004,col 51)",
        "(line 1005,col 9)-(line 1005,col 56)",
        "(line 1006,col 9)-(line 1006,col 90)",
        "(line 1008,col 9)-(line 1008,col 55)",
        "(line 1009,col 9)-(line 1009,col 58)",
        "(line 1010,col 9)-(line 1010,col 94)",
        "(line 1013,col 9)-(line 1013,col 40)",
        "(line 1014,col 9)-(line 1014,col 46)",
        "(line 1017,col 9)-(line 1017,col 44)",
        "(line 1018,col 9)-(line 1018,col 48)",
        "(line 1020,col 9)-(line 1020,col 56)",
        "(line 1021,col 9)-(line 1021,col 70)",
        "(line 1023,col 9)-(line 1023,col 60)",
        "(line 1024,col 9)-(line 1024,col 72)",
        "(line 1026,col 9)-(line 1026,col 50)",
        "(line 1027,col 9)-(line 1027,col 63)",
        "(line 1028,col 9)-(line 1028,col 99)",
        "(line 1030,col 9)-(line 1037,col 9)",
        "(line 1039,col 9)-(line 1039,col 67)",
        "(line 1040,col 9)-(line 1040,col 28)",
        "(line 1041,col 9)-(line 1041,col 96)",
        "(line 1042,col 9)-(line 1049,col 9)",
        "(line 1051,col 9)-(line 1051,col 52)",
        "(line 1052,col 9)-(line 1052,col 96)",
        "(line 1053,col 9)-(line 1053,col 94)",
        "(line 1055,col 9)-(line 1055,col 56)",
        "(line 1056,col 9)-(line 1056,col 98)",
        "(line 1057,col 9)-(line 1057,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.testMisc()",
      "begin_line": 1061,
      "end_line": 1076,
      "comment": "",
      "child_ranges": [
        "(line 1062,col 9)-(line 1062,col 59)",
        "(line 1064,col 9)-(line 1064,col 36)",
        "(line 1065,col 9)-(line 1065,col 54)",
        "(line 1066,col 9)-(line 1073,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.testPredicates()",
      "begin_line": 1078,
      "end_line": 1097,
      "comment": "",
      "child_ranges": [
        "(line 1080,col 9)-(line 1080,col 78)",
        "(line 1082,col 9)-(line 1082,col 31)",
        "(line 1083,col 9)-(line 1083,col 34)",
        "(line 1084,col 9)-(line 1084,col 30)",
        "(line 1086,col 9)-(line 1086,col 36)",
        "(line 1087,col 9)-(line 1087,col 48)",
        "(line 1088,col 9)-(line 1088,col 36)",
        "(line 1089,col 9)-(line 1089,col 25)",
        "(line 1090,col 9)-(line 1090,col 35)",
        "(line 1092,col 9)-(line 1092,col 25)",
        "(line 1093,col 9)-(line 1093,col 73)",
        "(line 1094,col 9)-(line 1094,col 87)",
        "(line 1095,col 9)-(line 1095,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.testSerial()",
      "begin_line": 1099,
      "end_line": 1102,
      "comment": "",
      "child_ranges": [
        "(line 1100,col 9)-(line 1100,col 78)",
        "(line 1101,col 9)-(line 1101,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SparseRealVectorTest.assertClose(java.lang.String, double[], double[], double)",
      "begin_line": 1105,
      "end_line": 1113,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 1107,col 9)-(line 1109,col 9)",
        "(line 1110,col 9)-(line 1112,col 9)"
      ]
    }
  ]
}