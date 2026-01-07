{
  "filepath": "/tmp/Math-50b/src/test/java/org/apache/commons/math/linear/ArrayRealVectorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayRealVectorTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 62,
      "end_line": 1488,
      "comment": "\n * Test cases for the {@link ArrayRealVector} class.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ma1"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec1"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec2"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec3"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec4"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec5"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec_null"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dvec1"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mat1"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " tolerances"
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 77,
      "end_line": 77,
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
      "begin_line": 81,
      "end_line": 361,
      "comment": " only with enough content to support the test"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Entries of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.RealVectorTestImpl(double[])",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 13)-(line 90,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unsupported()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 13)-(line 94,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.map(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 13)-(line 98,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 13)-(line 102,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.iterator()",
      "begin_line": 105,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 106,col 13)-(line 127,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-69a43141-4f13-4923-8ce4-6f43d1a540f5.hasNext()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 21)-(line 109,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-2334e786-c371-4406-87b4-dd0816e67f8f.next()",
      "begin_line": 111,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 112,col 21)-(line 112,col 38)",
        "(line 113,col 21)-(line 122,col 22)",
        "(line 123,col 21)-(line 123,col 34)",
        "(line 124,col 21)-(line 124,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-f2cbe58c-3550-4973-b27c-ba4f05524dc8.getValue()",
      "begin_line": 114,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 29)-(line 116,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-61c98156-c059-4880-8cf8-96e0ab9acb4e.setValue(double)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 29)-(line 120,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-0b7f8c66-007a-4337-b35a-d561484f060f.remove()",
      "begin_line": 126,
      "end_line": 126,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.sparseIterator()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 13)-(line 131,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.copy()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 13)-(line 135,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 13)-(line 139,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.add(double[])",
      "begin_line": 142,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 13)-(line 143,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 13)-(line 147,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.subtract(double[])",
      "begin_line": 150,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 13)-(line 151,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAdd(double)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 13)-(line 155,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAddToSelf(double)",
      "begin_line": 158,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 159,col 13)-(line 159,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSubtract(double)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 13)-(line 163,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSubtractToSelf(double)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 13)-(line 167,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapMultiply(double)",
      "begin_line": 170,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 171,col 13)-(line 171,col 51)",
        "(line 172,col 13)-(line 174,col 13)",
        "(line 175,col 13)-(line 175,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapMultiplyToSelf(double)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 13)-(line 179,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapDivide(double)",
      "begin_line": 182,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 183,col 13)-(line 183,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapDivideToSelf(double)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 187,col 13)-(line 187,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 13)-(line 191,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeMultiply(double[])",
      "begin_line": 194,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 195,col 13)-(line 195,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 199,col 13)-(line 199,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeDivide(double[])",
      "begin_line": 202,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 13)-(line 203,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getData()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 13)-(line 207,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 210,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 211,col 13)-(line 211,col 27)",
        "(line 212,col 13)-(line 214,col 13)",
        "(line 215,col 13)-(line 215,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.dotProduct(double[])",
      "begin_line": 218,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 219,col 13)-(line 219,col 27)",
        "(line 220,col 13)-(line 222,col 13)",
        "(line 223,col 13)-(line 223,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.cosine(org.apache.commons.math.linear.RealVector)",
      "begin_line": 226,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 227,col 13)-(line 227,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.cosine(double[])",
      "begin_line": 230,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 13)-(line 231,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getNorm()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 235,col 13)-(line 235,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Norm()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 239,col 13)-(line 239,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfNorm()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 243,col 13)-(line 243,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDistance(double[])",
      "begin_line": 250,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 13)-(line 251,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 254,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 255,col 13)-(line 255,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Distance(double[])",
      "begin_line": 258,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 259,col 13)-(line 259,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 262,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 263,col 13)-(line 263,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfDistance(double[])",
      "begin_line": 266,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 267,col 13)-(line 267,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unitVector()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 271,col 13)-(line 271,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unitize()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 275,col 13)-(line 275,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 278,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 279,col 13)-(line 279,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.projection(double[])",
      "begin_line": 282,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 283,col 13)-(line 283,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 286,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 287,col 13)-(line 287,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.outerProduct(double[])",
      "begin_line": 290,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 291,col 13)-(line 291,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getEntry(int)",
      "begin_line": 294,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 295,col 13)-(line 295,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDimension()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 299,col 13)-(line 299,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 302,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 303,col 13)-(line 303,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(double)",
      "begin_line": 306,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 307,col 13)-(line 307,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(double[])",
      "begin_line": 310,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 311,col 13)-(line 311,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getSubVector(int, int)",
      "begin_line": 314,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 13)-(line 315,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setEntry(int, double)",
      "begin_line": 318,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 319,col 13)-(line 319,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 323,col 13)-(line 323,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setSubVector(int, double[])",
      "begin_line": 326,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 327,col 13)-(line 327,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.set(double)",
      "begin_line": 330,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 331,col 13)-(line 331,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.toArray()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 335,col 13)-(line 335,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.isNaN()",
      "begin_line": 338,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 339,col 13)-(line 339,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.isInfinite()",
      "begin_line": 342,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 343,col 13)-(line 343,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.combine(double, double, double[])",
      "begin_line": 346,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 347,col 13)-(line 347,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.combine(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 350,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 351,col 13)-(line 351,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.combineToSelf(double, double, double[])",
      "begin_line": 354,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 355,col 13)-(line 355,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.combineToSelf(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 358,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 359,col 13)-(line 359,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testConstructors()",
      "begin_line": 363,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 51)",
        "(line 367,col 9)-(line 367,col 66)",
        "(line 369,col 9)-(line 369,col 52)",
        "(line 370,col 9)-(line 370,col 66)",
        "(line 371,col 9)-(line 371,col 72)",
        "(line 373,col 9)-(line 373,col 58)",
        "(line 374,col 9)-(line 374,col 66)",
        "(line 375,col 9)-(line 375,col 74)",
        "(line 377,col 9)-(line 377,col 55)",
        "(line 378,col 9)-(line 378,col 66)",
        "(line 379,col 9)-(line 379,col 72)",
        "(line 381,col 9)-(line 381,col 65)",
        "(line 382,col 9)-(line 382,col 70)",
        "(line 383,col 9)-(line 383,col 76)",
        "(line 384,col 9)-(line 384,col 56)",
        "(line 385,col 9)-(line 385,col 53)",
        "(line 387,col 9)-(line 387,col 66)",
        "(line 388,col 9)-(line 388,col 70)",
        "(line 389,col 9)-(line 389,col 76)",
        "(line 390,col 9)-(line 390,col 53)",
        "(line 391,col 9)-(line 391,col 53)",
        "(line 393,col 9)-(line 393,col 61)",
        "(line 394,col 9)-(line 394,col 66)",
        "(line 395,col 9)-(line 395,col 72)",
        "(line 396,col 9)-(line 401,col 9)",
        "(line 403,col 9)-(line 403,col 53)",
        "(line 404,col 9)-(line 404,col 68)",
        "(line 405,col 9)-(line 405,col 74)",
        "(line 407,col 9)-(line 407,col 56)",
        "(line 408,col 9)-(line 408,col 66)",
        "(line 409,col 9)-(line 409,col 72)",
        "(line 411,col 9)-(line 411,col 62)",
        "(line 412,col 9)-(line 412,col 66)",
        "(line 413,col 9)-(line 413,col 72)",
        "(line 414,col 9)-(line 419,col 9)",
        "(line 421,col 9)-(line 421,col 53)",
        "(line 422,col 9)-(line 422,col 66)",
        "(line 423,col 9)-(line 423,col 72)",
        "(line 425,col 9)-(line 425,col 63)",
        "(line 427,col 9)-(line 427,col 57)",
        "(line 428,col 9)-(line 428,col 68)",
        "(line 429,col 9)-(line 429,col 75)",
        "(line 431,col 9)-(line 431,col 59)",
        "(line 432,col 9)-(line 432,col 66)",
        "(line 433,col 9)-(line 433,col 72)",
        "(line 434,col 9)-(line 434,col 76)",
        "(line 436,col 9)-(line 436,col 62)",
        "(line 437,col 9)-(line 437,col 68)",
        "(line 438,col 9)-(line 438,col 74)",
        "(line 439,col 9)-(line 439,col 73)",
        "(line 441,col 9)-(line 441,col 57)",
        "(line 442,col 9)-(line 442,col 67)",
        "(line 443,col 9)-(line 443,col 72)",
        "(line 445,col 9)-(line 445,col 84)",
        "(line 446,col 9)-(line 446,col 67)",
        "(line 447,col 9)-(line 447,col 75)",
        "(line 448,col 9)-(line 448,col 73)",
        "(line 450,col 9)-(line 450,col 84)",
        "(line 451,col 9)-(line 451,col 67)",
        "(line 452,col 9)-(line 452,col 73)",
        "(line 453,col 9)-(line 453,col 75)",
        "(line 455,col 9)-(line 455,col 60)",
        "(line 456,col 9)-(line 456,col 67)",
        "(line 457,col 9)-(line 457,col 75)",
        "(line 458,col 9)-(line 458,col 73)",
        "(line 460,col 9)-(line 460,col 60)",
        "(line 461,col 9)-(line 461,col 67)",
        "(line 462,col 9)-(line 462,col 73)",
        "(line 463,col 9)-(line 463,col 75)",
        "(line 465,col 9)-(line 465,col 62)",
        "(line 466,col 9)-(line 466,col 68)",
        "(line 467,col 9)-(line 467,col 73)",
        "(line 468,col 9)-(line 468,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testDataInOut()",
      "begin_line": 472,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 55)",
        "(line 476,col 9)-(line 476,col 55)",
        "(line 477,col 9)-(line 477,col 55)",
        "(line 478,col 9)-(line 478,col 63)",
        "(line 480,col 9)-(line 480,col 46)",
        "(line 481,col 9)-(line 481,col 74)",
        "(line 482,col 9)-(line 482,col 80)",
        "(line 484,col 9)-(line 484,col 47)",
        "(line 485,col 9)-(line 485,col 74)",
        "(line 486,col 9)-(line 486,col 80)",
        "(line 488,col 9)-(line 488,col 48)",
        "(line 489,col 9)-(line 489,col 74)",
        "(line 490,col 9)-(line 490,col 77)",
        "(line 492,col 9)-(line 492,col 48)",
        "(line 493,col 9)-(line 493,col 74)",
        "(line 494,col 9)-(line 494,col 80)",
        "(line 496,col 9)-(line 496,col 59)",
        "(line 497,col 9)-(line 497,col 74)",
        "(line 498,col 9)-(line 498,col 80)",
        "(line 500,col 9)-(line 500,col 38)",
        "(line 501,col 9)-(line 501,col 70)",
        "(line 502,col 9)-(line 502,col 85)",
        "(line 504,col 9)-(line 504,col 41)",
        "(line 505,col 9)-(line 505,col 64)",
        "(line 506,col 9)-(line 506,col 77)",
        "(line 514,col 9)-(line 514,col 49)",
        "(line 515,col 9)-(line 515,col 69)",
        "(line 516,col 9)-(line 516,col 75)",
        "(line 517,col 9)-(line 522,col 9)",
        "(line 524,col 9)-(line 524,col 43)",
        "(line 525,col 9)-(line 525,col 33)",
        "(line 526,col 9)-(line 526,col 78)",
        "(line 527,col 9)-(line 532,col 9)",
        "(line 534,col 9)-(line 534,col 43)",
        "(line 535,col 9)-(line 535,col 26)",
        "(line 536,col 9)-(line 536,col 76)",
        "(line 537,col 9)-(line 537,col 76)",
        "(line 538,col 9)-(line 543,col 9)",
        "(line 545,col 9)-(line 545,col 43)",
        "(line 546,col 9)-(line 546,col 25)",
        "(line 547,col 9)-(line 547,col 78)",
        "(line 549,col 9)-(line 554,col 9)",
        "(line 556,col 9)-(line 556,col 43)",
        "(line 557,col 9)-(line 557,col 37)",
        "(line 558,col 9)-(line 558,col 76)",
        "(line 559,col 9)-(line 559,col 76)",
        "(line 560,col 9)-(line 565,col 9)",
        "(line 568,col 9)-(line 568,col 43)",
        "(line 569,col 9)-(line 569,col 45)",
        "(line 570,col 9)-(line 570,col 46)",
        "(line 571,col 9)-(line 571,col 34)",
        "(line 572,col 9)-(line 572,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMapFunctions()",
      "begin_line": 576,
      "end_line": 902,
      "comment": "",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 55)",
        "(line 581,col 9)-(line 581,col 46)",
        "(line 582,col 9)-(line 582,col 46)",
        "(line 583,col 9)-(line 583,col 87)",
        "(line 586,col 9)-(line 586,col 46)",
        "(line 587,col 9)-(line 587,col 42)",
        "(line 588,col 9)-(line 588,col 52)",
        "(line 589,col 9)-(line 589,col 99)",
        "(line 592,col 9)-(line 592,col 56)",
        "(line 593,col 9)-(line 593,col 52)",
        "(line 594,col 9)-(line 594,col 97)",
        "(line 597,col 9)-(line 597,col 51)",
        "(line 598,col 9)-(line 598,col 52)",
        "(line 599,col 9)-(line 599,col 58)",
        "(line 600,col 9)-(line 600,col 109)",
        "(line 603,col 9)-(line 603,col 56)",
        "(line 604,col 9)-(line 604,col 51)",
        "(line 605,col 9)-(line 605,col 97)",
        "(line 608,col 9)-(line 608,col 51)",
        "(line 609,col 9)-(line 609,col 52)",
        "(line 610,col 9)-(line 610,col 57)",
        "(line 611,col 9)-(line 611,col 109)",
        "(line 614,col 9)-(line 614,col 52)",
        "(line 615,col 9)-(line 615,col 52)",
        "(line 616,col 9)-(line 616,col 93)",
        "(line 619,col 9)-(line 619,col 49)",
        "(line 620,col 9)-(line 620,col 48)",
        "(line 621,col 9)-(line 621,col 58)",
        "(line 622,col 9)-(line 622,col 105)",
        "(line 625,col 9)-(line 625,col 51)",
        "(line 626,col 9)-(line 626,col 46)",
        "(line 627,col 9)-(line 627,col 87)",
        "(line 630,col 9)-(line 630,col 46)",
        "(line 631,col 9)-(line 631,col 47)",
        "(line 632,col 9)-(line 632,col 52)",
        "(line 633,col 9)-(line 633,col 99)",
        "(line 636,col 9)-(line 636,col 48)",
        "(line 637,col 9)-(line 637,col 105)",
        "(line 638,col 9)-(line 638,col 87)",
        "(line 641,col 9)-(line 641,col 46)",
        "(line 642,col 9)-(line 642,col 44)",
        "(line 643,col 9)-(line 643,col 111)",
        "(line 644,col 9)-(line 644,col 99)",
        "(line 648,col 9)-(line 648,col 52)",
        "(line 649,col 9)-(line 649,col 95)",
        "(line 650,col 9)-(line 650,col 91)",
        "(line 653,col 9)-(line 653,col 48)",
        "(line 654,col 9)-(line 654,col 48)",
        "(line 655,col 9)-(line 655,col 101)",
        "(line 656,col 9)-(line 656,col 103)",
        "(line 659,col 9)-(line 659,col 48)",
        "(line 660,col 9)-(line 660,col 85)",
        "(line 661,col 9)-(line 661,col 87)",
        "(line 664,col 9)-(line 664,col 46)",
        "(line 665,col 9)-(line 665,col 44)",
        "(line 666,col 9)-(line 666,col 91)",
        "(line 667,col 9)-(line 667,col 99)",
        "(line 670,col 9)-(line 670,col 52)",
        "(line 671,col 9)-(line 671,col 87)",
        "(line 672,col 9)-(line 672,col 91)",
        "(line 675,col 9)-(line 675,col 48)",
        "(line 676,col 9)-(line 676,col 48)",
        "(line 677,col 9)-(line 677,col 93)",
        "(line 678,col 9)-(line 678,col 103)",
        "(line 681,col 9)-(line 681,col 52)",
        "(line 682,col 9)-(line 682,col 97)",
        "(line 683,col 9)-(line 683,col 91)",
        "(line 686,col 9)-(line 686,col 48)",
        "(line 687,col 9)-(line 687,col 48)",
        "(line 688,col 9)-(line 688,col 103)",
        "(line 689,col 9)-(line 689,col 103)",
        "(line 692,col 9)-(line 692,col 50)",
        "(line 693,col 9)-(line 693,col 106)",
        "(line 694,col 9)-(line 694,col 89)",
        "(line 697,col 9)-(line 697,col 47)",
        "(line 698,col 9)-(line 698,col 46)",
        "(line 699,col 9)-(line 699,col 112)",
        "(line 700,col 9)-(line 700,col 101)",
        "(line 703,col 9)-(line 703,col 50)",
        "(line 704,col 9)-(line 704,col 106)",
        "(line 705,col 9)-(line 705,col 89)",
        "(line 708,col 9)-(line 708,col 47)",
        "(line 709,col 9)-(line 709,col 46)",
        "(line 710,col 9)-(line 710,col 112)",
        "(line 711,col 9)-(line 711,col 101)",
        "(line 714,col 9)-(line 714,col 50)",
        "(line 715,col 9)-(line 715,col 105)",
        "(line 716,col 9)-(line 716,col 89)",
        "(line 719,col 9)-(line 719,col 47)",
        "(line 720,col 9)-(line 720,col 46)",
        "(line 721,col 9)-(line 721,col 111)",
        "(line 722,col 9)-(line 722,col 101)",
        "(line 725,col 9)-(line 725,col 48)",
        "(line 726,col 9)-(line 726,col 107)",
        "(line 727,col 9)-(line 727,col 87)",
        "(line 730,col 9)-(line 730,col 46)",
        "(line 731,col 9)-(line 731,col 44)",
        "(line 732,col 9)-(line 732,col 113)",
        "(line 733,col 9)-(line 733,col 99)",
        "(line 736,col 9)-(line 736,col 48)",
        "(line 737,col 9)-(line 737,col 104)",
        "(line 738,col 9)-(line 738,col 87)",
        "(line 741,col 9)-(line 741,col 46)",
        "(line 742,col 9)-(line 742,col 44)",
        "(line 743,col 9)-(line 743,col 110)",
        "(line 744,col 9)-(line 744,col 99)",
        "(line 747,col 9)-(line 747,col 48)",
        "(line 748,col 9)-(line 748,col 106)",
        "(line 749,col 9)-(line 749,col 87)",
        "(line 752,col 9)-(line 752,col 46)",
        "(line 753,col 9)-(line 753,col 44)",
        "(line 754,col 9)-(line 754,col 112)",
        "(line 755,col 9)-(line 755,col 99)",
        "(line 757,col 9)-(line 757,col 42)",
        "(line 758,col 9)-(line 758,col 57)",
        "(line 761,col 9)-(line 761,col 51)",
        "(line 762,col 9)-(line 762,col 88)",
        "(line 763,col 9)-(line 763,col 89)",
        "(line 766,col 9)-(line 766,col 48)",
        "(line 767,col 9)-(line 767,col 46)",
        "(line 768,col 9)-(line 768,col 94)",
        "(line 769,col 9)-(line 769,col 101)",
        "(line 772,col 9)-(line 772,col 51)",
        "(line 773,col 9)-(line 773,col 87)",
        "(line 774,col 9)-(line 774,col 89)",
        "(line 777,col 9)-(line 777,col 48)",
        "(line 778,col 9)-(line 778,col 46)",
        "(line 779,col 9)-(line 779,col 93)",
        "(line 780,col 9)-(line 780,col 101)",
        "(line 783,col 9)-(line 783,col 51)",
        "(line 784,col 9)-(line 784,col 87)",
        "(line 785,col 9)-(line 785,col 89)",
        "(line 788,col 9)-(line 788,col 48)",
        "(line 789,col 9)-(line 789,col 46)",
        "(line 790,col 9)-(line 790,col 93)",
        "(line 791,col 9)-(line 791,col 101)",
        "(line 794,col 9)-(line 794,col 52)",
        "(line 795,col 9)-(line 795,col 66)",
        "(line 796,col 9)-(line 796,col 87)",
        "(line 799,col 9)-(line 799,col 46)",
        "(line 800,col 9)-(line 800,col 48)",
        "(line 801,col 9)-(line 801,col 72)",
        "(line 802,col 9)-(line 802,col 99)",
        "(line 804,col 9)-(line 804,col 45)",
        "(line 805,col 9)-(line 805,col 59)",
        "(line 808,col 9)-(line 808,col 51)",
        "(line 809,col 9)-(line 809,col 44)",
        "(line 810,col 9)-(line 810,col 87)",
        "(line 813,col 9)-(line 813,col 49)",
        "(line 814,col 9)-(line 814,col 44)",
        "(line 815,col 9)-(line 815,col 50)",
        "(line 816,col 9)-(line 816,col 99)",
        "(line 819,col 9)-(line 819,col 50)",
        "(line 820,col 9)-(line 820,col 85)",
        "(line 821,col 9)-(line 821,col 89)",
        "(line 824,col 9)-(line 824,col 47)",
        "(line 825,col 9)-(line 825,col 46)",
        "(line 826,col 9)-(line 826,col 91)",
        "(line 827,col 9)-(line 827,col 101)",
        "(line 829,col 9)-(line 829,col 46)",
        "(line 830,col 9)-(line 830,col 61)",
        "(line 833,col 9)-(line 833,col 54)",
        "(line 834,col 9)-(line 834,col 80)",
        "(line 835,col 9)-(line 835,col 89)",
        "(line 838,col 9)-(line 838,col 51)",
        "(line 839,col 9)-(line 839,col 46)",
        "(line 840,col 9)-(line 840,col 87)",
        "(line 841,col 9)-(line 841,col 101)",
        "(line 843,col 9)-(line 843,col 46)",
        "(line 844,col 9)-(line 844,col 61)",
        "(line 847,col 9)-(line 847,col 54)",
        "(line 848,col 9)-(line 848,col 46)",
        "(line 849,col 9)-(line 849,col 89)",
        "(line 852,col 9)-(line 852,col 51)",
        "(line 853,col 9)-(line 853,col 46)",
        "(line 854,col 9)-(line 854,col 53)",
        "(line 855,col 9)-(line 855,col 101)",
        "(line 858,col 9)-(line 858,col 56)",
        "(line 859,col 9)-(line 859,col 47)",
        "(line 860,col 9)-(line 860,col 91)",
        "(line 863,col 9)-(line 863,col 52)",
        "(line 864,col 9)-(line 864,col 48)",
        "(line 865,col 9)-(line 865,col 54)",
        "(line 866,col 9)-(line 866,col 103)",
        "(line 869,col 9)-(line 869,col 54)",
        "(line 870,col 9)-(line 870,col 46)",
        "(line 871,col 9)-(line 871,col 89)",
        "(line 874,col 9)-(line 874,col 51)",
        "(line 875,col 9)-(line 875,col 46)",
        "(line 876,col 9)-(line 876,col 53)",
        "(line 877,col 9)-(line 877,col 101)",
        "(line 880,col 9)-(line 880,col 58)",
        "(line 881,col 9)-(line 881,col 48)",
        "(line 882,col 9)-(line 882,col 93)",
        "(line 885,col 9)-(line 885,col 53)",
        "(line 886,col 9)-(line 886,col 50)",
        "(line 887,col 9)-(line 887,col 55)",
        "(line 888,col 9)-(line 888,col 105)",
        "(line 893,col 9)-(line 893,col 52)",
        "(line 894,col 9)-(line 894,col 105)",
        "(line 895,col 9)-(line 895,col 87)",
        "(line 898,col 9)-(line 898,col 50)",
        "(line 899,col 9)-(line 899,col 44)",
        "(line 900,col 9)-(line 900,col 111)",
        "(line 901,col 9)-(line 901,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testBasicFunctions()",
      "begin_line": 904,
      "end_line": 1053,
      "comment": "",
      "child_ranges": [
        "(line 906,col 9)-(line 906,col 55)",
        "(line 907,col 9)-(line 907,col 55)",
        "(line 908,col 9)-(line 908,col 55)",
        "(line 909,col 9)-(line 909,col 63)",
        "(line 911,col 9)-(line 911,col 63)",
        "(line 914,col 9)-(line 914,col 40)",
        "(line 915,col 9)-(line 915,col 97)",
        "(line 918,col 9)-(line 918,col 44)",
        "(line 919,col 9)-(line 919,col 82)",
        "(line 922,col 9)-(line 922,col 48)",
        "(line 923,col 9)-(line 923,col 83)",
        "(line 927,col 9)-(line 927,col 41)",
        "(line 928,col 9)-(line 928,col 95)",
        "(line 931,col 9)-(line 931,col 45)",
        "(line 932,col 9)-(line 932,col 97)",
        "(line 935,col 9)-(line 935,col 56)",
        "(line 936,col 9)-(line 936,col 97)",
        "(line 939,col 9)-(line 939,col 55)",
        "(line 940,col 9)-(line 940,col 84)",
        "(line 942,col 9)-(line 942,col 58)",
        "(line 943,col 9)-(line 943,col 86)",
        "(line 945,col 9)-(line 945,col 69)",
        "(line 946,col 9)-(line 946,col 86)",
        "(line 949,col 9)-(line 949,col 58)",
        "(line 950,col 9)-(line 950,col 86)",
        "(line 952,col 9)-(line 952,col 63)",
        "(line 953,col 9)-(line 953,col 88)",
        "(line 955,col 9)-(line 955,col 74)",
        "(line 956,col 9)-(line 956,col 88)",
        "(line 959,col 9)-(line 959,col 43)",
        "(line 960,col 9)-(line 960,col 43)",
        "(line 961,col 9)-(line 961,col 80)",
        "(line 963,col 9)-(line 963,col 62)",
        "(line 964,col 9)-(line 964,col 41)",
        "(line 965,col 9)-(line 965,col 45)",
        "(line 966,col 9)-(line 966,col 82)",
        "(line 969,col 9)-(line 969,col 53)",
        "(line 970,col 9)-(line 970,col 51)",
        "(line 971,col 9)-(line 971,col 88)",
        "(line 973,col 9)-(line 973,col 51)",
        "(line 974,col 9)-(line 974,col 53)",
        "(line 975,col 9)-(line 975,col 92)",
        "(line 978,col 9)-(line 978,col 60)",
        "(line 979,col 9)-(line 979,col 53)",
        "(line 980,col 9)-(line 980,col 94)",
        "(line 982,col 9)-(line 982,col 59)",
        "(line 983,col 9)-(line 983,col 55)",
        "(line 984,col 9)-(line 984,col 98)",
        "(line 986,col 9)-(line 986,col 70)",
        "(line 987,col 9)-(line 987,col 55)",
        "(line 988,col 9)-(line 988,col 98)",
        "(line 991,col 9)-(line 991,col 56)",
        "(line 992,col 9)-(line 992,col 56)",
        "(line 993,col 9)-(line 993,col 90)",
        "(line 995,col 9)-(line 995,col 55)",
        "(line 996,col 9)-(line 996,col 58)",
        "(line 997,col 9)-(line 997,col 94)",
        "(line 999,col 9)-(line 999,col 66)",
        "(line 1000,col 9)-(line 1000,col 58)",
        "(line 1001,col 9)-(line 1001,col 94)",
        "(line 1004,col 9)-(line 1004,col 40)",
        "(line 1005,col 9)-(line 1005,col 68)",
        "(line 1008,col 9)-(line 1008,col 44)",
        "(line 1009,col 9)-(line 1009,col 70)",
        "(line 1011,col 9)-(line 1011,col 56)",
        "(line 1012,col 9)-(line 1012,col 92)",
        "(line 1014,col 9)-(line 1014,col 60)",
        "(line 1015,col 9)-(line 1015,col 94)",
        "(line 1017,col 9)-(line 1017,col 71)",
        "(line 1018,col 9)-(line 1018,col 94)",
        "(line 1020,col 9)-(line 1020,col 50)",
        "(line 1021,col 9)-(line 1021,col 63)",
        "(line 1022,col 9)-(line 1022,col 99)",
        "(line 1024,col 9)-(line 1029,col 9)",
        "(line 1031,col 9)-(line 1031,col 46)",
        "(line 1032,col 9)-(line 1032,col 28)",
        "(line 1033,col 9)-(line 1033,col 96)",
        "(line 1034,col 9)-(line 1039,col 9)",
        "(line 1041,col 9)-(line 1041,col 57)",
        "(line 1042,col 9)-(line 1042,col 96)",
        "(line 1043,col 9)-(line 1043,col 94)",
        "(line 1045,col 9)-(line 1045,col 56)",
        "(line 1046,col 9)-(line 1046,col 98)",
        "(line 1047,col 9)-(line 1047,col 98)",
        "(line 1049,col 9)-(line 1049,col 64)",
        "(line 1050,col 9)-(line 1050,col 98)",
        "(line 1051,col 9)-(line 1051,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMisc()",
      "begin_line": 1055,
      "end_line": 1089,
      "comment": "",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 55)",
        "(line 1058,col 9)-(line 1058,col 55)",
        "(line 1059,col 9)-(line 1059,col 52)",
        "(line 1061,col 9)-(line 1061,col 36)",
        "(line 1062,col 9)-(line 1062,col 61)",
        "(line 1068,col 9)-(line 1073,col 9)",
        "(line 1075,col 8)-(line 1080,col 9)",
        "(line 1082,col 9)-(line 1087,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testPredicates()",
      "begin_line": 1091,
      "end_line": 1126,
      "comment": "",
      "child_ranges": [
        "(line 1094,col 9)-(line 1094,col 74)",
        "(line 1096,col 9)-(line 1096,col 38)",
        "(line 1097,col 9)-(line 1097,col 34)",
        "(line 1098,col 9)-(line 1098,col 37)",
        "(line 1100,col 9)-(line 1100,col 43)",
        "(line 1101,col 9)-(line 1101,col 48)",
        "(line 1102,col 9)-(line 1102,col 43)",
        "(line 1103,col 9)-(line 1103,col 25)",
        "(line 1104,col 9)-(line 1104,col 42)",
        "(line 1105,col 9)-(line 1105,col 25)",
        "(line 1106,col 9)-(line 1106,col 43)",
        "(line 1108,col 9)-(line 1108,col 25)",
        "(line 1109,col 9)-(line 1109,col 78)",
        "(line 1110,col 9)-(line 1110,col 96)",
        "(line 1111,col 9)-(line 1111,col 82)",
        "(line 1113,col 9)-(line 1114,col 88)",
        "(line 1116,col 9)-(line 1117,col 77)",
        "(line 1119,col 9)-(line 1119,col 39)",
        "(line 1120,col 9)-(line 1120,col 46)",
        "(line 1121,col 9)-(line 1121,col 43)",
        "(line 1122,col 9)-(line 1122,col 53)",
        "(line 1123,col 9)-(line 1123,col 78)",
        "(line 1124,col 9)-(line 1124,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testSerial()",
      "begin_line": 1128,
      "end_line": 1132,
      "comment": "",
      "child_ranges": [
        "(line 1130,col 9)-(line 1130,col 74)",
        "(line 1131,col 9)-(line 1131,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testZeroVectors()",
      "begin_line": 1134,
      "end_line": 1139,
      "comment": "",
      "child_ranges": [
        "(line 1136,col 9)-(line 1136,col 82)",
        "(line 1137,col 9)-(line 1137,col 88)",
        "(line 1138,col 9)-(line 1138,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMinMax()",
      "begin_line": 1141,
      "end_line": 1163,
      "comment": "",
      "child_ranges": [
        "(line 1143,col 9)-(line 1143,col 83)",
        "(line 1144,col 9)-(line 1144,col 50)",
        "(line 1145,col 9)-(line 1145,col 59)",
        "(line 1146,col 9)-(line 1146,col 50)",
        "(line 1147,col 9)-(line 1147,col 59)",
        "(line 1148,col 9)-(line 1148,col 97)",
        "(line 1149,col 9)-(line 1149,col 50)",
        "(line 1150,col 9)-(line 1150,col 59)",
        "(line 1151,col 9)-(line 1151,col 50)",
        "(line 1152,col 9)-(line 1152,col 58)",
        "(line 1153,col 9)-(line 1153,col 90)",
        "(line 1154,col 9)-(line 1154,col 51)",
        "(line 1155,col 9)-(line 1155,col 58)",
        "(line 1156,col 9)-(line 1156,col 51)",
        "(line 1157,col 9)-(line 1157,col 58)",
        "(line 1158,col 9)-(line 1158,col 64)",
        "(line 1159,col 9)-(line 1159,col 51)",
        "(line 1160,col 9)-(line 1160,col 58)",
        "(line 1161,col 9)-(line 1161,col 51)",
        "(line 1162,col 9)-(line 1162,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCosine()",
      "begin_line": 1165,
      "end_line": 1188,
      "comment": "",
      "child_ranges": [
        "(line 1167,col 9)-(line 1167,col 78)",
        "(line 1169,col 9)-(line 1169,col 48)",
        "(line 1170,col 9)-(line 1170,col 50)",
        "(line 1171,col 9)-(line 1171,col 82)",
        "(line 1172,col 9)-(line 1172,col 78)",
        "(line 1174,col 9)-(line 1174,col 39)",
        "(line 1175,col 9)-(line 1175,col 39)",
        "(line 1176,col 9)-(line 1176,col 63)",
        "(line 1177,col 9)-(line 1177,col 59)",
        "(line 1179,col 9)-(line 1179,col 39)",
        "(line 1180,col 9)-(line 1180,col 39)",
        "(line 1181,col 9)-(line 1181,col 63)",
        "(line 1182,col 9)-(line 1182,col 47)",
        "(line 1184,col 9)-(line 1184,col 40)",
        "(line 1185,col 9)-(line 1185,col 39)",
        "(line 1186,col 9)-(line 1186,col 64)",
        "(line 1187,col 9)-(line 1187,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCosinePrecondition1()",
      "begin_line": 1190,
      "end_line": 1195,
      "comment": "",
      "child_ranges": [
        "(line 1192,col 9)-(line 1192,col 78)",
        "(line 1193,col 9)-(line 1193,col 78)",
        "(line 1194,col 9)-(line 1194,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCosinePrecondition2()",
      "begin_line": 1196,
      "end_line": 1201,
      "comment": "",
      "child_ranges": [
        "(line 1198,col 9)-(line 1198,col 78)",
        "(line 1199,col 9)-(line 1199,col 78)",
        "(line 1200,col 9)-(line 1200,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCosinePrecondition3()",
      "begin_line": 1202,
      "end_line": 1207,
      "comment": "",
      "child_ranges": [
        "(line 1204,col 9)-(line 1204,col 78)",
        "(line 1205,col 9)-(line 1205,col 81)",
        "(line 1206,col 9)-(line 1206,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testOuterProduct()",
      "begin_line": 1209,
      "end_line": 1223,
      "comment": "",
      "child_ranges": [
        "(line 1211,col 9)-(line 1211,col 79)",
        "(line 1212,col 9)-(line 1212,col 76)",
        "(line 1214,col 9)-(line 1214,col 48)",
        "(line 1216,col 9)-(line 1216,col 40)",
        "(line 1217,col 9)-(line 1217,col 55)",
        "(line 1218,col 9)-(line 1218,col 56)",
        "(line 1219,col 9)-(line 1219,col 55)",
        "(line 1220,col 9)-(line 1220,col 56)",
        "(line 1221,col 9)-(line 1221,col 57)",
        "(line 1222,col 9)-(line 1222,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombinePreconditionArray()",
      "begin_line": 1225,
      "end_line": 1233,
      "comment": "",
      "child_ranges": [
        "(line 1227,col 9)-(line 1227,col 28)",
        "(line 1228,col 9)-(line 1228,col 28)",
        "(line 1229,col 9)-(line 1229,col 51)",
        "(line 1230,col 9)-(line 1230,col 61)",
        "(line 1231,col 9)-(line 1231,col 51)",
        "(line 1232,col 9)-(line 1232,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineArray()",
      "begin_line": 1235,
      "end_line": 1264,
      "comment": "",
      "child_ranges": [
        "(line 1237,col 9)-(line 1237,col 51)",
        "(line 1238,col 9)-(line 1238,col 27)",
        "(line 1239,col 9)-(line 1239,col 55)",
        "(line 1240,col 9)-(line 1240,col 55)",
        "(line 1241,col 9)-(line 1241,col 54)",
        "(line 1242,col 9)-(line 1242,col 43)",
        "(line 1243,col 9)-(line 1243,col 50)",
        "(line 1244,col 9)-(line 1250,col 9)",
        "(line 1251,col 9)-(line 1251,col 61)",
        "(line 1252,col 9)-(line 1263,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombinePreconditionSameType()",
      "begin_line": 1266,
      "end_line": 1275,
      "comment": "",
      "child_ranges": [
        "(line 1268,col 9)-(line 1268,col 28)",
        "(line 1269,col 9)-(line 1269,col 28)",
        "(line 1270,col 9)-(line 1270,col 51)",
        "(line 1271,col 9)-(line 1271,col 61)",
        "(line 1272,col 9)-(line 1272,col 38)",
        "(line 1273,col 9)-(line 1273,col 61)",
        "(line 1274,col 9)-(line 1274,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineSameType()",
      "begin_line": 1277,
      "end_line": 1306,
      "comment": "",
      "child_ranges": [
        "(line 1279,col 9)-(line 1279,col 51)",
        "(line 1280,col 9)-(line 1280,col 27)",
        "(line 1281,col 9)-(line 1281,col 55)",
        "(line 1282,col 9)-(line 1282,col 55)",
        "(line 1283,col 9)-(line 1283,col 54)",
        "(line 1284,col 9)-(line 1284,col 54)",
        "(line 1285,col 9)-(line 1285,col 50)",
        "(line 1286,col 9)-(line 1292,col 9)",
        "(line 1293,col 9)-(line 1293,col 61)",
        "(line 1294,col 9)-(line 1305,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombinePreconditionMixedType()",
      "begin_line": 1308,
      "end_line": 1317,
      "comment": "",
      "child_ranges": [
        "(line 1310,col 9)-(line 1310,col 28)",
        "(line 1311,col 9)-(line 1311,col 28)",
        "(line 1312,col 9)-(line 1312,col 51)",
        "(line 1313,col 9)-(line 1313,col 61)",
        "(line 1314,col 9)-(line 1314,col 38)",
        "(line 1315,col 9)-(line 1315,col 56)",
        "(line 1316,col 9)-(line 1316,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineMixedTypes()",
      "begin_line": 1319,
      "end_line": 1348,
      "comment": "",
      "child_ranges": [
        "(line 1321,col 9)-(line 1321,col 51)",
        "(line 1322,col 9)-(line 1322,col 27)",
        "(line 1323,col 9)-(line 1323,col 55)",
        "(line 1324,col 9)-(line 1324,col 55)",
        "(line 1325,col 9)-(line 1325,col 54)",
        "(line 1326,col 9)-(line 1326,col 60)",
        "(line 1327,col 9)-(line 1327,col 50)",
        "(line 1328,col 9)-(line 1334,col 9)",
        "(line 1335,col 9)-(line 1335,col 61)",
        "(line 1336,col 9)-(line 1347,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineToSelfPreconditionArray()",
      "begin_line": 1350,
      "end_line": 1358,
      "comment": "",
      "child_ranges": [
        "(line 1352,col 9)-(line 1352,col 28)",
        "(line 1353,col 9)-(line 1353,col 28)",
        "(line 1354,col 9)-(line 1354,col 51)",
        "(line 1355,col 9)-(line 1355,col 61)",
        "(line 1356,col 9)-(line 1356,col 51)",
        "(line 1357,col 9)-(line 1357,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineToSelfArray()",
      "begin_line": 1360,
      "end_line": 1390,
      "comment": "",
      "child_ranges": [
        "(line 1362,col 9)-(line 1362,col 51)",
        "(line 1363,col 9)-(line 1363,col 27)",
        "(line 1364,col 9)-(line 1364,col 55)",
        "(line 1365,col 9)-(line 1365,col 55)",
        "(line 1366,col 9)-(line 1366,col 54)",
        "(line 1367,col 9)-(line 1367,col 43)",
        "(line 1368,col 9)-(line 1368,col 50)",
        "(line 1369,col 9)-(line 1375,col 9)",
        "(line 1376,col 9)-(line 1376,col 55)",
        "(line 1377,col 9)-(line 1377,col 44)",
        "(line 1378,col 9)-(line 1389,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineToSelfPreconditionSameType()",
      "begin_line": 1392,
      "end_line": 1401,
      "comment": "",
      "child_ranges": [
        "(line 1394,col 9)-(line 1394,col 28)",
        "(line 1395,col 9)-(line 1395,col 28)",
        "(line 1396,col 9)-(line 1396,col 51)",
        "(line 1397,col 9)-(line 1397,col 61)",
        "(line 1398,col 9)-(line 1398,col 38)",
        "(line 1399,col 9)-(line 1399,col 61)",
        "(line 1400,col 9)-(line 1400,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineToSelfSameType()",
      "begin_line": 1403,
      "end_line": 1433,
      "comment": "",
      "child_ranges": [
        "(line 1405,col 9)-(line 1405,col 51)",
        "(line 1406,col 9)-(line 1406,col 27)",
        "(line 1407,col 9)-(line 1407,col 55)",
        "(line 1408,col 9)-(line 1408,col 55)",
        "(line 1409,col 9)-(line 1409,col 54)",
        "(line 1410,col 9)-(line 1410,col 54)",
        "(line 1411,col 9)-(line 1411,col 50)",
        "(line 1412,col 9)-(line 1418,col 9)",
        "(line 1419,col 9)-(line 1419,col 55)",
        "(line 1420,col 9)-(line 1420,col 44)",
        "(line 1421,col 9)-(line 1432,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineToSelfPreconditionMixedType()",
      "begin_line": 1435,
      "end_line": 1444,
      "comment": "",
      "child_ranges": [
        "(line 1437,col 9)-(line 1437,col 28)",
        "(line 1438,col 9)-(line 1438,col 28)",
        "(line 1439,col 9)-(line 1439,col 51)",
        "(line 1440,col 9)-(line 1440,col 61)",
        "(line 1441,col 9)-(line 1441,col 38)",
        "(line 1442,col 9)-(line 1442,col 56)",
        "(line 1443,col 9)-(line 1443,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testCombineToSelfMixedTypes()",
      "begin_line": 1446,
      "end_line": 1476,
      "comment": "",
      "child_ranges": [
        "(line 1448,col 9)-(line 1448,col 51)",
        "(line 1449,col 9)-(line 1449,col 27)",
        "(line 1450,col 9)-(line 1450,col 55)",
        "(line 1451,col 9)-(line 1451,col 55)",
        "(line 1452,col 9)-(line 1452,col 54)",
        "(line 1453,col 9)-(line 1453,col 60)",
        "(line 1454,col 9)-(line 1454,col 50)",
        "(line 1455,col 9)-(line 1461,col 9)",
        "(line 1462,col 9)-(line 1462,col 55)",
        "(line 1463,col 9)-(line 1463,col 44)",
        "(line 1464,col 9)-(line 1475,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.assertClose(java.lang.String, double[], double[], double)",
      "begin_line": 1479,
      "end_line": 1487,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 1481,col 9)-(line 1483,col 9)",
        "(line 1484,col 9)-(line 1486,col 9)"
      ]
    }
  ]
}