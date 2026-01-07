{
  "filepath": "/tmp/Math-76b/src/test/java/org/apache/commons/math/linear/ArrayRealVectorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayRealVectorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 35,
      "end_line": 1328,
      "comment": "\n * Test cases for the {@link ArrayRealVector} class.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ma1"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec1"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec2"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec3"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec4"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec5"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec_null"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dvec1"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mat1"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " tolerances"
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 50,
      "end_line": 50,
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
      "begin_line": 54,
      "end_line": 501,
      "comment": " only with enough content to support the test"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Entries of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.RealVectorTestImpl(double[])",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 13)-(line 63,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unsupported()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 13)-(line 67,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.map(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 13)-(line 71,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 13)-(line 75,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.iterator()",
      "begin_line": 78,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 79,col 13)-(line 98,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-3225a0fa-6f1d-4145-b7a4-fee0fbe4ba7a.hasNext()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 21)-(line 82,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-34cef1f7-daa4-4b36-9aec-9b78f455546d.next()",
      "begin_line": 84,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 85,col 21)-(line 85,col 38)",
        "(line 86,col 21)-(line 93,col 22)",
        "(line 94,col 21)-(line 94,col 34)",
        "(line 95,col 21)-(line 95,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-e546c2a9-278f-46b6-aa23-2b718d173fd2.getValue()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 29)-(line 88,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-a99cafd3-005c-4f67-b53f-a49a6a732083.setValue(double)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 29)-(line 91,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-e0eba297-43a5-43fd-9129-477773214f2e.remove()",
      "begin_line": 97,
      "end_line": 97,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.sparseIterator()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 13)-(line 102,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.copy()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 13)-(line 106,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 13)-(line 110,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.add(double[])",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 13)-(line 114,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 13)-(line 118,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.subtract(double[])",
      "begin_line": 121,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 13)-(line 122,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAdd(double)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 13)-(line 126,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAddToSelf(double)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 13)-(line 130,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSubtract(double)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 13)-(line 134,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSubtractToSelf(double)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 13)-(line 138,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapMultiply(double)",
      "begin_line": 141,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 142,col 13)-(line 142,col 51)",
        "(line 143,col 13)-(line 145,col 13)",
        "(line 146,col 13)-(line 146,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapMultiplyToSelf(double)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 13)-(line 150,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapDivide(double)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 13)-(line 154,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapDivideToSelf(double)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 13)-(line 158,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapPow(double)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 13)-(line 162,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapPowToSelf(double)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 13)-(line 166,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapExp()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 13)-(line 170,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapExpToSelf()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 13)-(line 174,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapExpm1()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 178,col 13)-(line 178,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapExpm1ToSelf()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 13)-(line 182,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapLog()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 186,col 13)-(line 186,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapLogToSelf()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 190,col 13)-(line 190,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapLog10()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 194,col 13)-(line 194,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapLog10ToSelf()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 13)-(line 198,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapLog1p()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 13)-(line 202,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapLog1pToSelf()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 13)-(line 206,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapCosh()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 13)-(line 210,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapCoshToSelf()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 13)-(line 214,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSinh()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 218,col 13)-(line 218,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSinhToSelf()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 222,col 13)-(line 222,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapTanh()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 13)-(line 226,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapTanhToSelf()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 230,col 13)-(line 230,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapCos()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 234,col 13)-(line 234,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapCosToSelf()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 238,col 13)-(line 238,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSin()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 13)-(line 242,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSinToSelf()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 13)-(line 246,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapTan()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 250,col 13)-(line 250,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapTanToSelf()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 254,col 13)-(line 254,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAcos()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 258,col 13)-(line 258,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAcosToSelf()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 262,col 13)-(line 262,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAsin()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 266,col 13)-(line 266,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAsinToSelf()",
      "begin_line": 269,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 270,col 13)-(line 270,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAtan()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 274,col 13)-(line 274,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAtanToSelf()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 278,col 13)-(line 278,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapInv()",
      "begin_line": 281,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 282,col 13)-(line 282,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapInvToSelf()",
      "begin_line": 285,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 286,col 13)-(line 286,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAbs()",
      "begin_line": 289,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 290,col 13)-(line 290,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAbsToSelf()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 294,col 13)-(line 294,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSqrt()",
      "begin_line": 297,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 298,col 13)-(line 298,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSqrtToSelf()",
      "begin_line": 301,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 302,col 13)-(line 302,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapCbrt()",
      "begin_line": 305,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 306,col 13)-(line 306,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapCbrtToSelf()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 310,col 13)-(line 310,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapCeil()",
      "begin_line": 313,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 314,col 13)-(line 314,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapCeilToSelf()",
      "begin_line": 317,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 318,col 13)-(line 318,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapFloor()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 322,col 13)-(line 322,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapFloorToSelf()",
      "begin_line": 325,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 326,col 13)-(line 326,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapRint()",
      "begin_line": 329,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 330,col 13)-(line 330,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapRintToSelf()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 334,col 13)-(line 334,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSignum()",
      "begin_line": 337,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 338,col 13)-(line 338,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSignumToSelf()",
      "begin_line": 341,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 342,col 13)-(line 342,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapUlp()",
      "begin_line": 345,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 346,col 13)-(line 346,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapUlpToSelf()",
      "begin_line": 349,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 350,col 13)-(line 350,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 353,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 354,col 13)-(line 354,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeMultiply(double[])",
      "begin_line": 357,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 358,col 13)-(line 358,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 361,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 362,col 13)-(line 362,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeDivide(double[])",
      "begin_line": 365,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 366,col 13)-(line 366,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getData()",
      "begin_line": 369,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 370,col 13)-(line 370,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 373,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 374,col 13)-(line 374,col 27)",
        "(line 375,col 13)-(line 377,col 13)",
        "(line 378,col 13)-(line 378,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.dotProduct(double[])",
      "begin_line": 381,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 382,col 13)-(line 382,col 27)",
        "(line 383,col 13)-(line 385,col 13)",
        "(line 386,col 13)-(line 386,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getNorm()",
      "begin_line": 389,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 390,col 13)-(line 390,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Norm()",
      "begin_line": 393,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 394,col 13)-(line 394,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfNorm()",
      "begin_line": 397,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 398,col 13)-(line 398,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 401,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 402,col 13)-(line 402,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDistance(double[])",
      "begin_line": 405,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 406,col 13)-(line 406,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 409,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 410,col 13)-(line 410,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Distance(double[])",
      "begin_line": 413,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 414,col 13)-(line 414,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 417,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 418,col 13)-(line 418,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfDistance(double[])",
      "begin_line": 421,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 422,col 13)-(line 422,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unitVector()",
      "begin_line": 425,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 426,col 13)-(line 426,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unitize()",
      "begin_line": 429,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 430,col 13)-(line 430,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 433,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 434,col 13)-(line 434,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.projection(double[])",
      "begin_line": 437,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 438,col 13)-(line 438,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 441,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 442,col 13)-(line 442,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.outerProduct(double[])",
      "begin_line": 445,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 446,col 13)-(line 446,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getEntry(int)",
      "begin_line": 449,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 450,col 13)-(line 450,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDimension()",
      "begin_line": 453,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 454,col 13)-(line 454,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 457,
      "end_line": 459,
      "comment": "",
      "child_ranges": [
        "(line 458,col 13)-(line 458,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(double)",
      "begin_line": 461,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 462,col 13)-(line 462,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(double[])",
      "begin_line": 465,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 466,col 13)-(line 466,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getSubVector(int, int)",
      "begin_line": 469,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 470,col 13)-(line 470,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setEntry(int, double)",
      "begin_line": 473,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 474,col 13)-(line 474,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 477,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 478,col 13)-(line 478,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setSubVector(int, double[])",
      "begin_line": 481,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 482,col 13)-(line 482,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.set(double)",
      "begin_line": 485,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 486,col 13)-(line 486,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.toArray()",
      "begin_line": 489,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 490,col 13)-(line 490,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.isNaN()",
      "begin_line": 493,
      "end_line": 495,
      "comment": "",
      "child_ranges": [
        "(line 494,col 13)-(line 494,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.isInfinite()",
      "begin_line": 497,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 498,col 13)-(line 498,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.suite()",
      "begin_line": 503,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 67)",
        "(line 505,col 9)-(line 505,col 47)",
        "(line 506,col 9)-(line 506,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testConstructors()",
      "begin_line": 509,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 51)",
        "(line 512,col 9)-(line 512,col 59)",
        "(line 514,col 9)-(line 514,col 52)",
        "(line 515,col 9)-(line 515,col 59)",
        "(line 516,col 9)-(line 516,col 62)",
        "(line 518,col 9)-(line 518,col 58)",
        "(line 519,col 9)-(line 519,col 59)",
        "(line 520,col 9)-(line 520,col 64)",
        "(line 522,col 9)-(line 522,col 55)",
        "(line 523,col 9)-(line 523,col 59)",
        "(line 524,col 9)-(line 524,col 62)",
        "(line 526,col 9)-(line 526,col 65)",
        "(line 527,col 9)-(line 527,col 63)",
        "(line 528,col 9)-(line 528,col 66)",
        "(line 529,col 9)-(line 529,col 49)",
        "(line 530,col 9)-(line 530,col 46)",
        "(line 532,col 9)-(line 532,col 66)",
        "(line 533,col 9)-(line 533,col 63)",
        "(line 534,col 9)-(line 534,col 66)",
        "(line 535,col 9)-(line 535,col 46)",
        "(line 536,col 9)-(line 536,col 46)",
        "(line 538,col 9)-(line 538,col 61)",
        "(line 539,col 9)-(line 539,col 59)",
        "(line 540,col 9)-(line 540,col 62)",
        "(line 541,col 9)-(line 548,col 9)",
        "(line 550,col 9)-(line 550,col 53)",
        "(line 551,col 9)-(line 551,col 61)",
        "(line 552,col 9)-(line 552,col 64)",
        "(line 554,col 9)-(line 554,col 56)",
        "(line 555,col 9)-(line 555,col 59)",
        "(line 556,col 9)-(line 556,col 62)",
        "(line 558,col 9)-(line 558,col 62)",
        "(line 559,col 9)-(line 559,col 59)",
        "(line 560,col 9)-(line 560,col 62)",
        "(line 561,col 9)-(line 568,col 9)",
        "(line 570,col 9)-(line 570,col 53)",
        "(line 571,col 9)-(line 571,col 59)",
        "(line 572,col 9)-(line 572,col 62)",
        "(line 574,col 9)-(line 574,col 63)",
        "(line 576,col 9)-(line 576,col 57)",
        "(line 577,col 9)-(line 577,col 61)",
        "(line 578,col 9)-(line 578,col 65)",
        "(line 580,col 9)-(line 580,col 59)",
        "(line 581,col 9)-(line 581,col 59)",
        "(line 582,col 9)-(line 582,col 62)",
        "(line 583,col 9)-(line 583,col 69)",
        "(line 585,col 9)-(line 585,col 62)",
        "(line 586,col 9)-(line 586,col 61)",
        "(line 587,col 9)-(line 587,col 64)",
        "(line 588,col 9)-(line 588,col 66)",
        "(line 590,col 9)-(line 590,col 57)",
        "(line 591,col 9)-(line 591,col 60)",
        "(line 592,col 9)-(line 592,col 62)",
        "(line 594,col 9)-(line 594,col 84)",
        "(line 595,col 9)-(line 595,col 60)",
        "(line 596,col 9)-(line 596,col 65)",
        "(line 597,col 9)-(line 597,col 63)",
        "(line 599,col 9)-(line 599,col 84)",
        "(line 600,col 9)-(line 600,col 60)",
        "(line 601,col 9)-(line 601,col 63)",
        "(line 602,col 9)-(line 602,col 65)",
        "(line 604,col 9)-(line 604,col 60)",
        "(line 605,col 9)-(line 605,col 60)",
        "(line 606,col 9)-(line 606,col 65)",
        "(line 607,col 9)-(line 607,col 63)",
        "(line 609,col 9)-(line 609,col 60)",
        "(line 610,col 9)-(line 610,col 60)",
        "(line 611,col 9)-(line 611,col 63)",
        "(line 612,col 9)-(line 612,col 65)",
        "(line 614,col 9)-(line 614,col 62)",
        "(line 615,col 9)-(line 615,col 61)",
        "(line 616,col 9)-(line 616,col 63)",
        "(line 617,col 9)-(line 617,col 63)",
        "(line 619,col 9)-(line 626,col 9)",
        "(line 628,col 9)-(line 635,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testDataInOut()",
      "begin_line": 639,
      "end_line": 750,
      "comment": "",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 55)",
        "(line 642,col 9)-(line 642,col 55)",
        "(line 643,col 9)-(line 643,col 55)",
        "(line 644,col 9)-(line 644,col 63)",
        "(line 646,col 9)-(line 646,col 46)",
        "(line 647,col 9)-(line 647,col 67)",
        "(line 648,col 9)-(line 648,col 70)",
        "(line 650,col 9)-(line 650,col 47)",
        "(line 651,col 9)-(line 651,col 67)",
        "(line 652,col 9)-(line 652,col 70)",
        "(line 654,col 9)-(line 654,col 48)",
        "(line 655,col 9)-(line 655,col 67)",
        "(line 656,col 9)-(line 656,col 67)",
        "(line 658,col 9)-(line 658,col 48)",
        "(line 659,col 9)-(line 659,col 67)",
        "(line 660,col 9)-(line 660,col 70)",
        "(line 662,col 9)-(line 662,col 59)",
        "(line 663,col 9)-(line 663,col 67)",
        "(line 664,col 9)-(line 664,col 70)",
        "(line 666,col 9)-(line 666,col 38)",
        "(line 667,col 9)-(line 667,col 63)",
        "(line 668,col 9)-(line 668,col 78)",
        "(line 670,col 9)-(line 670,col 41)",
        "(line 671,col 9)-(line 671,col 57)",
        "(line 672,col 9)-(line 672,col 70)",
        "(line 680,col 9)-(line 680,col 49)",
        "(line 681,col 9)-(line 681,col 62)",
        "(line 682,col 9)-(line 682,col 65)",
        "(line 683,col 9)-(line 690,col 9)",
        "(line 692,col 9)-(line 692,col 61)",
        "(line 693,col 9)-(line 693,col 33)",
        "(line 694,col 9)-(line 694,col 68)",
        "(line 695,col 9)-(line 702,col 9)",
        "(line 704,col 9)-(line 704,col 61)",
        "(line 705,col 9)-(line 705,col 26)",
        "(line 706,col 9)-(line 706,col 66)",
        "(line 707,col 9)-(line 707,col 66)",
        "(line 708,col 9)-(line 715,col 9)",
        "(line 717,col 9)-(line 717,col 61)",
        "(line 718,col 9)-(line 718,col 25)",
        "(line 719,col 9)-(line 719,col 68)",
        "(line 721,col 9)-(line 728,col 9)",
        "(line 730,col 9)-(line 730,col 61)",
        "(line 731,col 9)-(line 731,col 37)",
        "(line 732,col 9)-(line 732,col 66)",
        "(line 733,col 9)-(line 733,col 66)",
        "(line 734,col 9)-(line 741,col 9)",
        "(line 744,col 9)-(line 744,col 61)",
        "(line 745,col 9)-(line 745,col 63)",
        "(line 746,col 9)-(line 746,col 39)",
        "(line 747,col 9)-(line 747,col 34)",
        "(line 748,col 9)-(line 748,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMapFunctions()",
      "begin_line": 752,
      "end_line": 1078,
      "comment": "",
      "child_ranges": [
        "(line 753,col 9)-(line 753,col 55)",
        "(line 756,col 9)-(line 756,col 46)",
        "(line 757,col 9)-(line 757,col 46)",
        "(line 758,col 9)-(line 758,col 87)",
        "(line 761,col 9)-(line 761,col 46)",
        "(line 762,col 9)-(line 762,col 42)",
        "(line 763,col 9)-(line 763,col 52)",
        "(line 764,col 9)-(line 764,col 99)",
        "(line 767,col 9)-(line 767,col 56)",
        "(line 768,col 9)-(line 768,col 52)",
        "(line 769,col 9)-(line 769,col 97)",
        "(line 772,col 9)-(line 772,col 51)",
        "(line 773,col 9)-(line 773,col 52)",
        "(line 774,col 9)-(line 774,col 58)",
        "(line 775,col 9)-(line 775,col 109)",
        "(line 778,col 9)-(line 778,col 56)",
        "(line 779,col 9)-(line 779,col 51)",
        "(line 780,col 9)-(line 780,col 97)",
        "(line 783,col 9)-(line 783,col 51)",
        "(line 784,col 9)-(line 784,col 52)",
        "(line 785,col 9)-(line 785,col 57)",
        "(line 786,col 9)-(line 786,col 109)",
        "(line 789,col 9)-(line 789,col 52)",
        "(line 790,col 9)-(line 790,col 52)",
        "(line 791,col 9)-(line 791,col 93)",
        "(line 794,col 9)-(line 794,col 49)",
        "(line 795,col 9)-(line 795,col 48)",
        "(line 796,col 9)-(line 796,col 58)",
        "(line 797,col 9)-(line 797,col 105)",
        "(line 800,col 9)-(line 800,col 46)",
        "(line 801,col 9)-(line 801,col 46)",
        "(line 802,col 9)-(line 802,col 87)",
        "(line 805,col 9)-(line 805,col 46)",
        "(line 806,col 9)-(line 806,col 42)",
        "(line 807,col 9)-(line 807,col 52)",
        "(line 808,col 9)-(line 808,col 99)",
        "(line 811,col 9)-(line 811,col 42)",
        "(line 812,col 9)-(line 812,col 105)",
        "(line 813,col 9)-(line 813,col 87)",
        "(line 816,col 9)-(line 816,col 46)",
        "(line 817,col 9)-(line 817,col 38)",
        "(line 818,col 9)-(line 818,col 111)",
        "(line 819,col 9)-(line 819,col 99)",
        "(line 823,col 9)-(line 823,col 46)",
        "(line 824,col 9)-(line 824,col 95)",
        "(line 825,col 9)-(line 825,col 91)",
        "(line 828,col 9)-(line 828,col 48)",
        "(line 829,col 9)-(line 829,col 42)",
        "(line 830,col 9)-(line 830,col 101)",
        "(line 831,col 9)-(line 831,col 103)",
        "(line 834,col 9)-(line 834,col 42)",
        "(line 835,col 9)-(line 835,col 85)",
        "(line 836,col 9)-(line 836,col 87)",
        "(line 839,col 9)-(line 839,col 46)",
        "(line 840,col 9)-(line 840,col 38)",
        "(line 841,col 9)-(line 841,col 91)",
        "(line 842,col 9)-(line 842,col 99)",
        "(line 845,col 9)-(line 845,col 46)",
        "(line 846,col 9)-(line 846,col 87)",
        "(line 847,col 9)-(line 847,col 91)",
        "(line 850,col 9)-(line 850,col 48)",
        "(line 851,col 9)-(line 851,col 42)",
        "(line 852,col 9)-(line 852,col 93)",
        "(line 853,col 9)-(line 853,col 103)",
        "(line 856,col 9)-(line 856,col 46)",
        "(line 857,col 9)-(line 857,col 97)",
        "(line 858,col 9)-(line 858,col 91)",
        "(line 861,col 9)-(line 861,col 48)",
        "(line 862,col 9)-(line 862,col 42)",
        "(line 863,col 9)-(line 863,col 103)",
        "(line 864,col 9)-(line 864,col 103)",
        "(line 867,col 9)-(line 867,col 44)",
        "(line 868,col 9)-(line 868,col 106)",
        "(line 869,col 9)-(line 869,col 89)",
        "(line 872,col 9)-(line 872,col 47)",
        "(line 873,col 9)-(line 873,col 40)",
        "(line 874,col 9)-(line 874,col 112)",
        "(line 875,col 9)-(line 875,col 101)",
        "(line 878,col 9)-(line 878,col 44)",
        "(line 879,col 9)-(line 879,col 106)",
        "(line 880,col 9)-(line 880,col 89)",
        "(line 883,col 9)-(line 883,col 47)",
        "(line 884,col 9)-(line 884,col 40)",
        "(line 885,col 9)-(line 885,col 112)",
        "(line 886,col 9)-(line 886,col 101)",
        "(line 889,col 9)-(line 889,col 44)",
        "(line 890,col 9)-(line 890,col 105)",
        "(line 891,col 9)-(line 891,col 89)",
        "(line 894,col 9)-(line 894,col 47)",
        "(line 895,col 9)-(line 895,col 40)",
        "(line 896,col 9)-(line 896,col 111)",
        "(line 897,col 9)-(line 897,col 101)",
        "(line 900,col 9)-(line 900,col 42)",
        "(line 901,col 9)-(line 901,col 107)",
        "(line 902,col 9)-(line 902,col 87)",
        "(line 905,col 9)-(line 905,col 46)",
        "(line 906,col 9)-(line 906,col 38)",
        "(line 907,col 9)-(line 907,col 113)",
        "(line 908,col 9)-(line 908,col 99)",
        "(line 911,col 9)-(line 911,col 42)",
        "(line 912,col 9)-(line 912,col 104)",
        "(line 913,col 9)-(line 913,col 87)",
        "(line 916,col 9)-(line 916,col 46)",
        "(line 917,col 9)-(line 917,col 38)",
        "(line 918,col 9)-(line 918,col 110)",
        "(line 919,col 9)-(line 919,col 99)",
        "(line 922,col 9)-(line 922,col 42)",
        "(line 923,col 9)-(line 923,col 106)",
        "(line 924,col 9)-(line 924,col 87)",
        "(line 927,col 9)-(line 927,col 46)",
        "(line 928,col 9)-(line 928,col 38)",
        "(line 929,col 9)-(line 929,col 112)",
        "(line 930,col 9)-(line 930,col 99)",
        "(line 932,col 9)-(line 932,col 42)",
        "(line 933,col 9)-(line 933,col 57)",
        "(line 936,col 9)-(line 936,col 45)",
        "(line 937,col 9)-(line 937,col 88)",
        "(line 938,col 9)-(line 938,col 89)",
        "(line 941,col 9)-(line 941,col 48)",
        "(line 942,col 9)-(line 942,col 40)",
        "(line 943,col 9)-(line 943,col 94)",
        "(line 944,col 9)-(line 944,col 101)",
        "(line 947,col 9)-(line 947,col 45)",
        "(line 948,col 9)-(line 948,col 87)",
        "(line 949,col 9)-(line 949,col 89)",
        "(line 952,col 9)-(line 952,col 48)",
        "(line 953,col 9)-(line 953,col 40)",
        "(line 954,col 9)-(line 954,col 93)",
        "(line 955,col 9)-(line 955,col 101)",
        "(line 958,col 9)-(line 958,col 45)",
        "(line 959,col 9)-(line 959,col 87)",
        "(line 960,col 9)-(line 960,col 89)",
        "(line 963,col 9)-(line 963,col 48)",
        "(line 964,col 9)-(line 964,col 40)",
        "(line 965,col 9)-(line 965,col 93)",
        "(line 966,col 9)-(line 966,col 101)",
        "(line 969,col 9)-(line 969,col 42)",
        "(line 970,col 9)-(line 970,col 66)",
        "(line 971,col 9)-(line 971,col 87)",
        "(line 974,col 9)-(line 974,col 46)",
        "(line 975,col 9)-(line 975,col 38)",
        "(line 976,col 9)-(line 976,col 72)",
        "(line 977,col 9)-(line 977,col 99)",
        "(line 979,col 9)-(line 979,col 45)",
        "(line 980,col 9)-(line 980,col 59)",
        "(line 983,col 9)-(line 983,col 45)",
        "(line 984,col 9)-(line 984,col 44)",
        "(line 985,col 9)-(line 985,col 87)",
        "(line 988,col 9)-(line 988,col 49)",
        "(line 989,col 9)-(line 989,col 38)",
        "(line 990,col 9)-(line 990,col 50)",
        "(line 991,col 9)-(line 991,col 99)",
        "(line 994,col 9)-(line 994,col 44)",
        "(line 995,col 9)-(line 995,col 85)",
        "(line 996,col 9)-(line 996,col 89)",
        "(line 999,col 9)-(line 999,col 47)",
        "(line 1000,col 9)-(line 1000,col 40)",
        "(line 1001,col 9)-(line 1001,col 91)",
        "(line 1002,col 9)-(line 1002,col 101)",
        "(line 1004,col 9)-(line 1004,col 46)",
        "(line 1005,col 9)-(line 1005,col 61)",
        "(line 1008,col 9)-(line 1008,col 48)",
        "(line 1009,col 9)-(line 1009,col 80)",
        "(line 1010,col 9)-(line 1010,col 89)",
        "(line 1013,col 9)-(line 1013,col 51)",
        "(line 1014,col 9)-(line 1014,col 40)",
        "(line 1015,col 9)-(line 1015,col 87)",
        "(line 1016,col 9)-(line 1016,col 101)",
        "(line 1018,col 9)-(line 1018,col 46)",
        "(line 1019,col 9)-(line 1019,col 61)",
        "(line 1022,col 9)-(line 1022,col 48)",
        "(line 1023,col 9)-(line 1023,col 46)",
        "(line 1024,col 9)-(line 1024,col 89)",
        "(line 1027,col 9)-(line 1027,col 51)",
        "(line 1028,col 9)-(line 1028,col 40)",
        "(line 1029,col 9)-(line 1029,col 53)",
        "(line 1030,col 9)-(line 1030,col 101)",
        "(line 1033,col 9)-(line 1033,col 50)",
        "(line 1034,col 9)-(line 1034,col 47)",
        "(line 1035,col 9)-(line 1035,col 91)",
        "(line 1038,col 9)-(line 1038,col 52)",
        "(line 1039,col 9)-(line 1039,col 42)",
        "(line 1040,col 9)-(line 1040,col 54)",
        "(line 1041,col 9)-(line 1041,col 103)",
        "(line 1044,col 9)-(line 1044,col 48)",
        "(line 1045,col 9)-(line 1045,col 46)",
        "(line 1046,col 9)-(line 1046,col 89)",
        "(line 1049,col 9)-(line 1049,col 51)",
        "(line 1050,col 9)-(line 1050,col 40)",
        "(line 1051,col 9)-(line 1051,col 53)",
        "(line 1052,col 9)-(line 1052,col 101)",
        "(line 1055,col 9)-(line 1055,col 52)",
        "(line 1056,col 9)-(line 1056,col 48)",
        "(line 1057,col 9)-(line 1057,col 93)",
        "(line 1060,col 9)-(line 1060,col 53)",
        "(line 1061,col 9)-(line 1061,col 44)",
        "(line 1062,col 9)-(line 1062,col 55)",
        "(line 1063,col 9)-(line 1063,col 105)",
        "(line 1068,col 9)-(line 1068,col 46)",
        "(line 1069,col 9)-(line 1069,col 105)",
        "(line 1070,col 9)-(line 1070,col 87)",
        "(line 1073,col 9)-(line 1073,col 50)",
        "(line 1074,col 9)-(line 1074,col 38)",
        "(line 1075,col 9)-(line 1075,col 111)",
        "(line 1076,col 9)-(line 1076,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testBasicFunctions()",
      "begin_line": 1080,
      "end_line": 1232,
      "comment": "",
      "child_ranges": [
        "(line 1081,col 9)-(line 1081,col 55)",
        "(line 1082,col 9)-(line 1082,col 55)",
        "(line 1083,col 9)-(line 1083,col 55)",
        "(line 1084,col 9)-(line 1084,col 63)",
        "(line 1086,col 9)-(line 1086,col 63)",
        "(line 1089,col 9)-(line 1089,col 40)",
        "(line 1090,col 9)-(line 1090,col 75)",
        "(line 1093,col 9)-(line 1093,col 44)",
        "(line 1094,col 9)-(line 1094,col 60)",
        "(line 1097,col 9)-(line 1097,col 48)",
        "(line 1098,col 9)-(line 1098,col 61)",
        "(line 1102,col 9)-(line 1102,col 41)",
        "(line 1103,col 9)-(line 1103,col 74)",
        "(line 1106,col 9)-(line 1106,col 45)",
        "(line 1107,col 9)-(line 1107,col 76)",
        "(line 1110,col 9)-(line 1110,col 56)",
        "(line 1111,col 9)-(line 1111,col 76)",
        "(line 1114,col 9)-(line 1114,col 55)",
        "(line 1115,col 9)-(line 1115,col 62)",
        "(line 1117,col 9)-(line 1117,col 59)",
        "(line 1118,col 9)-(line 1118,col 64)",
        "(line 1120,col 9)-(line 1120,col 70)",
        "(line 1121,col 9)-(line 1121,col 64)",
        "(line 1124,col 9)-(line 1124,col 59)",
        "(line 1125,col 9)-(line 1125,col 64)",
        "(line 1127,col 9)-(line 1127,col 63)",
        "(line 1128,col 9)-(line 1128,col 66)",
        "(line 1130,col 9)-(line 1130,col 74)",
        "(line 1131,col 9)-(line 1131,col 66)",
        "(line 1134,col 9)-(line 1134,col 43)",
        "(line 1135,col 9)-(line 1135,col 43)",
        "(line 1136,col 9)-(line 1136,col 78)",
        "(line 1138,col 9)-(line 1138,col 62)",
        "(line 1139,col 9)-(line 1139,col 41)",
        "(line 1140,col 9)-(line 1140,col 45)",
        "(line 1141,col 9)-(line 1141,col 82)",
        "(line 1144,col 9)-(line 1144,col 53)",
        "(line 1145,col 9)-(line 1145,col 51)",
        "(line 1146,col 9)-(line 1146,col 88)",
        "(line 1148,col 9)-(line 1148,col 51)",
        "(line 1149,col 9)-(line 1149,col 53)",
        "(line 1150,col 9)-(line 1150,col 92)",
        "(line 1153,col 9)-(line 1153,col 60)",
        "(line 1154,col 9)-(line 1154,col 53)",
        "(line 1155,col 9)-(line 1155,col 94)",
        "(line 1157,col 9)-(line 1157,col 59)",
        "(line 1158,col 9)-(line 1158,col 55)",
        "(line 1159,col 9)-(line 1159,col 98)",
        "(line 1161,col 9)-(line 1161,col 70)",
        "(line 1162,col 9)-(line 1162,col 55)",
        "(line 1163,col 9)-(line 1163,col 98)",
        "(line 1166,col 9)-(line 1166,col 56)",
        "(line 1167,col 9)-(line 1167,col 56)",
        "(line 1168,col 9)-(line 1168,col 90)",
        "(line 1170,col 9)-(line 1170,col 55)",
        "(line 1171,col 9)-(line 1171,col 58)",
        "(line 1172,col 9)-(line 1172,col 94)",
        "(line 1174,col 9)-(line 1174,col 66)",
        "(line 1175,col 9)-(line 1175,col 58)",
        "(line 1176,col 9)-(line 1176,col 94)",
        "(line 1179,col 9)-(line 1179,col 40)",
        "(line 1180,col 9)-(line 1180,col 46)",
        "(line 1183,col 9)-(line 1183,col 44)",
        "(line 1184,col 9)-(line 1184,col 48)",
        "(line 1186,col 9)-(line 1186,col 56)",
        "(line 1187,col 9)-(line 1187,col 70)",
        "(line 1189,col 9)-(line 1189,col 60)",
        "(line 1190,col 9)-(line 1190,col 72)",
        "(line 1192,col 9)-(line 1192,col 71)",
        "(line 1193,col 9)-(line 1193,col 72)",
        "(line 1195,col 9)-(line 1195,col 50)",
        "(line 1196,col 9)-(line 1196,col 63)",
        "(line 1197,col 9)-(line 1197,col 99)",
        "(line 1199,col 9)-(line 1206,col 9)",
        "(line 1208,col 9)-(line 1208,col 63)",
        "(line 1209,col 9)-(line 1209,col 28)",
        "(line 1210,col 9)-(line 1210,col 96)",
        "(line 1211,col 9)-(line 1218,col 9)",
        "(line 1220,col 9)-(line 1220,col 57)",
        "(line 1221,col 9)-(line 1221,col 96)",
        "(line 1222,col 9)-(line 1222,col 94)",
        "(line 1224,col 9)-(line 1224,col 56)",
        "(line 1225,col 9)-(line 1225,col 98)",
        "(line 1226,col 9)-(line 1226,col 98)",
        "(line 1228,col 9)-(line 1228,col 64)",
        "(line 1229,col 9)-(line 1229,col 98)",
        "(line 1230,col 9)-(line 1230,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMisc()",
      "begin_line": 1234,
      "end_line": 1273,
      "comment": "",
      "child_ranges": [
        "(line 1235,col 9)-(line 1235,col 55)",
        "(line 1236,col 9)-(line 1236,col 55)",
        "(line 1237,col 9)-(line 1237,col 52)",
        "(line 1239,col 9)-(line 1239,col 36)",
        "(line 1240,col 9)-(line 1240,col 54)",
        "(line 1246,col 9)-(line 1253,col 9)",
        "(line 1255,col 8)-(line 1262,col 9)",
        "(line 1264,col 9)-(line 1271,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testPredicates()",
      "begin_line": 1275,
      "end_line": 1309,
      "comment": "",
      "child_ranges": [
        "(line 1277,col 9)-(line 1277,col 74)",
        "(line 1279,col 9)-(line 1279,col 31)",
        "(line 1280,col 9)-(line 1280,col 34)",
        "(line 1281,col 9)-(line 1281,col 30)",
        "(line 1283,col 9)-(line 1283,col 36)",
        "(line 1284,col 9)-(line 1284,col 48)",
        "(line 1285,col 9)-(line 1285,col 36)",
        "(line 1286,col 9)-(line 1286,col 25)",
        "(line 1287,col 9)-(line 1287,col 35)",
        "(line 1288,col 9)-(line 1288,col 25)",
        "(line 1289,col 9)-(line 1289,col 36)",
        "(line 1291,col 9)-(line 1291,col 25)",
        "(line 1292,col 9)-(line 1292,col 71)",
        "(line 1293,col 9)-(line 1293,col 85)",
        "(line 1294,col 9)-(line 1294,col 75)",
        "(line 1296,col 9)-(line 1297,col 88)",
        "(line 1299,col 9)-(line 1300,col 77)",
        "(line 1302,col 9)-(line 1302,col 32)",
        "(line 1303,col 9)-(line 1303,col 39)",
        "(line 1304,col 9)-(line 1304,col 36)",
        "(line 1305,col 9)-(line 1305,col 46)",
        "(line 1306,col 9)-(line 1306,col 71)",
        "(line 1307,col 9)-(line 1307,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testSerial()",
      "begin_line": 1311,
      "end_line": 1314,
      "comment": "",
      "child_ranges": [
        "(line 1312,col 9)-(line 1312,col 74)",
        "(line 1313,col 9)-(line 1313,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.assertClose(java.lang.String, double[], double[], double)",
      "begin_line": 1318,
      "end_line": 1326,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 1320,col 9)-(line 1322,col 9)",
        "(line 1323,col 9)-(line 1325,col 9)"
      ]
    }
  ]
}