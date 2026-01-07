{
  "filepath": "/tmp/Math-60b/src/test/java/org/apache/commons/math/linear/ArrayRealVectorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrayRealVectorTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 1160,
      "comment": "\n * Test cases for the {@link ArrayRealVector} class.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ma1"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec1"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec2"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec3"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec4"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec5"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec_null"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dvec1"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mat1"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " tolerances"
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 76,
      "end_line": 76,
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
      "begin_line": 80,
      "end_line": 345,
      "comment": " only with enough content to support the test"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Entries of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.RealVectorTestImpl(double[])",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 13)-(line 89,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unsupported()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 13)-(line 93,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.map(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 13)-(line 97,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 13)-(line 101,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.iterator()",
      "begin_line": 104,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 105,col 13)-(line 126,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-140c6fc2-0975-4a43-aa55-3f5512417da7.hasNext()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 21)-(line 108,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-422f0fa9-a5c2-4bde-9663-5afebf56dc6e.next()",
      "begin_line": 110,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 111,col 21)-(line 111,col 38)",
        "(line 112,col 21)-(line 121,col 22)",
        "(line 122,col 21)-(line 122,col 34)",
        "(line 123,col 21)-(line 123,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-8f52cfa6-0773-4903-9fe7-1963ca6e5e20.getValue()",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 29)-(line 115,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-83ac4f5a-39e6-4426-9b10-46db93902500.setValue(double)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 29)-(line 119,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.Anonymous-0d7ed115-3a0e-4f7e-81d9-b58e9e8f3064.remove()",
      "begin_line": 125,
      "end_line": 125,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.sparseIterator()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 13)-(line 130,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.copy()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 13)-(line 134,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 13)-(line 138,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.add(double[])",
      "begin_line": 141,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 13)-(line 142,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 13)-(line 146,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.subtract(double[])",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 13)-(line 150,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAdd(double)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 13)-(line 154,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapAddToSelf(double)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 13)-(line 158,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSubtract(double)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 13)-(line 162,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapSubtractToSelf(double)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 13)-(line 166,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapMultiply(double)",
      "begin_line": 169,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 170,col 13)-(line 170,col 51)",
        "(line 171,col 13)-(line 173,col 13)",
        "(line 174,col 13)-(line 174,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapMultiplyToSelf(double)",
      "begin_line": 177,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 178,col 13)-(line 178,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapDivide(double)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 13)-(line 182,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapDivideToSelf(double)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 186,col 13)-(line 186,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapPow(double)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 190,col 13)-(line 190,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.mapPowToSelf(double)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 194,col 13)-(line 194,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 13)-(line 198,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeMultiply(double[])",
      "begin_line": 201,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 13)-(line 202,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 13)-(line 206,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.ebeDivide(double[])",
      "begin_line": 209,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 13)-(line 210,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getData()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 13)-(line 214,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 217,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 218,col 13)-(line 218,col 27)",
        "(line 219,col 13)-(line 221,col 13)",
        "(line 222,col 13)-(line 222,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.dotProduct(double[])",
      "begin_line": 225,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 226,col 13)-(line 226,col 27)",
        "(line 227,col 13)-(line 229,col 13)",
        "(line 230,col 13)-(line 230,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getNorm()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 234,col 13)-(line 234,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Norm()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 238,col 13)-(line 238,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfNorm()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 13)-(line 242,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 245,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 13)-(line 246,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDistance(double[])",
      "begin_line": 249,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 250,col 13)-(line 250,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 253,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 254,col 13)-(line 254,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getL1Distance(double[])",
      "begin_line": 257,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 258,col 13)-(line 258,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 261,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 262,col 13)-(line 262,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getLInfDistance(double[])",
      "begin_line": 265,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 266,col 13)-(line 266,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unitVector()",
      "begin_line": 269,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 270,col 13)-(line 270,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.unitize()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 274,col 13)-(line 274,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 277,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 278,col 13)-(line 278,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.projection(double[])",
      "begin_line": 281,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 282,col 13)-(line 282,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 285,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 286,col 13)-(line 286,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.outerProduct(double[])",
      "begin_line": 289,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 290,col 13)-(line 290,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getEntry(int)",
      "begin_line": 293,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 294,col 13)-(line 294,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getDimension()",
      "begin_line": 297,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 298,col 13)-(line 298,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 301,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 302,col 13)-(line 302,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(double)",
      "begin_line": 305,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 306,col 13)-(line 306,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.append(double[])",
      "begin_line": 309,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 310,col 13)-(line 310,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.getSubVector(int, int)",
      "begin_line": 313,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 314,col 13)-(line 314,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setEntry(int, double)",
      "begin_line": 317,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 318,col 13)-(line 318,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 321,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 322,col 13)-(line 322,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.setSubVector(int, double[])",
      "begin_line": 325,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 326,col 13)-(line 326,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.set(double)",
      "begin_line": 329,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 330,col 13)-(line 330,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.toArray()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 334,col 13)-(line 334,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.isNaN()",
      "begin_line": 337,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 338,col 13)-(line 338,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl.isInfinite()",
      "begin_line": 341,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 342,col 13)-(line 342,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testConstructors()",
      "begin_line": 347,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 51)",
        "(line 351,col 9)-(line 351,col 66)",
        "(line 353,col 9)-(line 353,col 52)",
        "(line 354,col 9)-(line 354,col 66)",
        "(line 355,col 9)-(line 355,col 72)",
        "(line 357,col 9)-(line 357,col 58)",
        "(line 358,col 9)-(line 358,col 66)",
        "(line 359,col 9)-(line 359,col 74)",
        "(line 361,col 9)-(line 361,col 55)",
        "(line 362,col 9)-(line 362,col 66)",
        "(line 363,col 9)-(line 363,col 72)",
        "(line 365,col 9)-(line 365,col 65)",
        "(line 366,col 9)-(line 366,col 70)",
        "(line 367,col 9)-(line 367,col 76)",
        "(line 368,col 9)-(line 368,col 56)",
        "(line 369,col 9)-(line 369,col 53)",
        "(line 371,col 9)-(line 371,col 66)",
        "(line 372,col 9)-(line 372,col 70)",
        "(line 373,col 9)-(line 373,col 76)",
        "(line 374,col 9)-(line 374,col 53)",
        "(line 375,col 9)-(line 375,col 53)",
        "(line 377,col 9)-(line 377,col 61)",
        "(line 378,col 9)-(line 378,col 66)",
        "(line 379,col 9)-(line 379,col 72)",
        "(line 380,col 9)-(line 385,col 9)",
        "(line 387,col 9)-(line 387,col 53)",
        "(line 388,col 9)-(line 388,col 68)",
        "(line 389,col 9)-(line 389,col 74)",
        "(line 391,col 9)-(line 391,col 56)",
        "(line 392,col 9)-(line 392,col 66)",
        "(line 393,col 9)-(line 393,col 72)",
        "(line 395,col 9)-(line 395,col 62)",
        "(line 396,col 9)-(line 396,col 66)",
        "(line 397,col 9)-(line 397,col 72)",
        "(line 398,col 9)-(line 403,col 9)",
        "(line 405,col 9)-(line 405,col 53)",
        "(line 406,col 9)-(line 406,col 66)",
        "(line 407,col 9)-(line 407,col 72)",
        "(line 409,col 9)-(line 409,col 63)",
        "(line 411,col 9)-(line 411,col 57)",
        "(line 412,col 9)-(line 412,col 68)",
        "(line 413,col 9)-(line 413,col 75)",
        "(line 415,col 9)-(line 415,col 59)",
        "(line 416,col 9)-(line 416,col 66)",
        "(line 417,col 9)-(line 417,col 72)",
        "(line 418,col 9)-(line 418,col 76)",
        "(line 420,col 9)-(line 420,col 62)",
        "(line 421,col 9)-(line 421,col 68)",
        "(line 422,col 9)-(line 422,col 74)",
        "(line 423,col 9)-(line 423,col 73)",
        "(line 425,col 9)-(line 425,col 57)",
        "(line 426,col 9)-(line 426,col 67)",
        "(line 427,col 9)-(line 427,col 72)",
        "(line 429,col 9)-(line 429,col 84)",
        "(line 430,col 9)-(line 430,col 67)",
        "(line 431,col 9)-(line 431,col 75)",
        "(line 432,col 9)-(line 432,col 73)",
        "(line 434,col 9)-(line 434,col 84)",
        "(line 435,col 9)-(line 435,col 67)",
        "(line 436,col 9)-(line 436,col 73)",
        "(line 437,col 9)-(line 437,col 75)",
        "(line 439,col 9)-(line 439,col 60)",
        "(line 440,col 9)-(line 440,col 67)",
        "(line 441,col 9)-(line 441,col 75)",
        "(line 442,col 9)-(line 442,col 73)",
        "(line 444,col 9)-(line 444,col 60)",
        "(line 445,col 9)-(line 445,col 67)",
        "(line 446,col 9)-(line 446,col 73)",
        "(line 447,col 9)-(line 447,col 75)",
        "(line 449,col 9)-(line 449,col 62)",
        "(line 450,col 9)-(line 450,col 68)",
        "(line 451,col 9)-(line 451,col 73)",
        "(line 452,col 9)-(line 452,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testDataInOut()",
      "begin_line": 456,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 55)",
        "(line 460,col 9)-(line 460,col 55)",
        "(line 461,col 9)-(line 461,col 55)",
        "(line 462,col 9)-(line 462,col 63)",
        "(line 464,col 9)-(line 464,col 46)",
        "(line 465,col 9)-(line 465,col 74)",
        "(line 466,col 9)-(line 466,col 80)",
        "(line 468,col 9)-(line 468,col 47)",
        "(line 469,col 9)-(line 469,col 74)",
        "(line 470,col 9)-(line 470,col 80)",
        "(line 472,col 9)-(line 472,col 48)",
        "(line 473,col 9)-(line 473,col 74)",
        "(line 474,col 9)-(line 474,col 77)",
        "(line 476,col 9)-(line 476,col 48)",
        "(line 477,col 9)-(line 477,col 74)",
        "(line 478,col 9)-(line 478,col 80)",
        "(line 480,col 9)-(line 480,col 59)",
        "(line 481,col 9)-(line 481,col 74)",
        "(line 482,col 9)-(line 482,col 80)",
        "(line 484,col 9)-(line 484,col 38)",
        "(line 485,col 9)-(line 485,col 70)",
        "(line 486,col 9)-(line 486,col 85)",
        "(line 488,col 9)-(line 488,col 41)",
        "(line 489,col 9)-(line 489,col 64)",
        "(line 490,col 9)-(line 490,col 77)",
        "(line 498,col 9)-(line 498,col 49)",
        "(line 499,col 9)-(line 499,col 69)",
        "(line 500,col 9)-(line 500,col 75)",
        "(line 501,col 9)-(line 506,col 9)",
        "(line 508,col 9)-(line 508,col 61)",
        "(line 509,col 9)-(line 509,col 33)",
        "(line 510,col 9)-(line 510,col 78)",
        "(line 511,col 9)-(line 516,col 9)",
        "(line 518,col 9)-(line 518,col 61)",
        "(line 519,col 9)-(line 519,col 26)",
        "(line 520,col 9)-(line 520,col 76)",
        "(line 521,col 9)-(line 521,col 76)",
        "(line 522,col 9)-(line 527,col 9)",
        "(line 529,col 9)-(line 529,col 61)",
        "(line 530,col 9)-(line 530,col 25)",
        "(line 531,col 9)-(line 531,col 78)",
        "(line 533,col 9)-(line 538,col 9)",
        "(line 540,col 9)-(line 540,col 61)",
        "(line 541,col 9)-(line 541,col 37)",
        "(line 542,col 9)-(line 542,col 76)",
        "(line 543,col 9)-(line 543,col 76)",
        "(line 544,col 9)-(line 549,col 9)",
        "(line 552,col 9)-(line 552,col 61)",
        "(line 553,col 9)-(line 553,col 63)",
        "(line 554,col 9)-(line 554,col 46)",
        "(line 555,col 9)-(line 555,col 34)",
        "(line 556,col 9)-(line 556,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMapFunctions()",
      "begin_line": 560,
      "end_line": 886,
      "comment": "",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 55)",
        "(line 565,col 9)-(line 565,col 46)",
        "(line 566,col 9)-(line 566,col 46)",
        "(line 567,col 9)-(line 567,col 87)",
        "(line 570,col 9)-(line 570,col 46)",
        "(line 571,col 9)-(line 571,col 42)",
        "(line 572,col 9)-(line 572,col 52)",
        "(line 573,col 9)-(line 573,col 99)",
        "(line 576,col 9)-(line 576,col 56)",
        "(line 577,col 9)-(line 577,col 52)",
        "(line 578,col 9)-(line 578,col 97)",
        "(line 581,col 9)-(line 581,col 51)",
        "(line 582,col 9)-(line 582,col 52)",
        "(line 583,col 9)-(line 583,col 58)",
        "(line 584,col 9)-(line 584,col 109)",
        "(line 587,col 9)-(line 587,col 56)",
        "(line 588,col 9)-(line 588,col 51)",
        "(line 589,col 9)-(line 589,col 97)",
        "(line 592,col 9)-(line 592,col 51)",
        "(line 593,col 9)-(line 593,col 52)",
        "(line 594,col 9)-(line 594,col 57)",
        "(line 595,col 9)-(line 595,col 109)",
        "(line 598,col 9)-(line 598,col 52)",
        "(line 599,col 9)-(line 599,col 52)",
        "(line 600,col 9)-(line 600,col 93)",
        "(line 603,col 9)-(line 603,col 49)",
        "(line 604,col 9)-(line 604,col 48)",
        "(line 605,col 9)-(line 605,col 58)",
        "(line 606,col 9)-(line 606,col 105)",
        "(line 609,col 9)-(line 609,col 46)",
        "(line 610,col 9)-(line 610,col 46)",
        "(line 611,col 9)-(line 611,col 87)",
        "(line 614,col 9)-(line 614,col 46)",
        "(line 615,col 9)-(line 615,col 42)",
        "(line 616,col 9)-(line 616,col 52)",
        "(line 617,col 9)-(line 617,col 99)",
        "(line 620,col 9)-(line 620,col 48)",
        "(line 621,col 9)-(line 621,col 105)",
        "(line 622,col 9)-(line 622,col 87)",
        "(line 625,col 9)-(line 625,col 46)",
        "(line 626,col 9)-(line 626,col 44)",
        "(line 627,col 9)-(line 627,col 111)",
        "(line 628,col 9)-(line 628,col 99)",
        "(line 632,col 9)-(line 632,col 52)",
        "(line 633,col 9)-(line 633,col 95)",
        "(line 634,col 9)-(line 634,col 91)",
        "(line 637,col 9)-(line 637,col 48)",
        "(line 638,col 9)-(line 638,col 48)",
        "(line 639,col 9)-(line 639,col 101)",
        "(line 640,col 9)-(line 640,col 103)",
        "(line 643,col 9)-(line 643,col 48)",
        "(line 644,col 9)-(line 644,col 85)",
        "(line 645,col 9)-(line 645,col 87)",
        "(line 648,col 9)-(line 648,col 46)",
        "(line 649,col 9)-(line 649,col 44)",
        "(line 650,col 9)-(line 650,col 91)",
        "(line 651,col 9)-(line 651,col 99)",
        "(line 654,col 9)-(line 654,col 52)",
        "(line 655,col 9)-(line 655,col 87)",
        "(line 656,col 9)-(line 656,col 91)",
        "(line 659,col 9)-(line 659,col 48)",
        "(line 660,col 9)-(line 660,col 48)",
        "(line 661,col 9)-(line 661,col 93)",
        "(line 662,col 9)-(line 662,col 103)",
        "(line 665,col 9)-(line 665,col 52)",
        "(line 666,col 9)-(line 666,col 97)",
        "(line 667,col 9)-(line 667,col 91)",
        "(line 670,col 9)-(line 670,col 48)",
        "(line 671,col 9)-(line 671,col 48)",
        "(line 672,col 9)-(line 672,col 103)",
        "(line 673,col 9)-(line 673,col 103)",
        "(line 676,col 9)-(line 676,col 50)",
        "(line 677,col 9)-(line 677,col 106)",
        "(line 678,col 9)-(line 678,col 89)",
        "(line 681,col 9)-(line 681,col 47)",
        "(line 682,col 9)-(line 682,col 46)",
        "(line 683,col 9)-(line 683,col 112)",
        "(line 684,col 9)-(line 684,col 101)",
        "(line 687,col 9)-(line 687,col 50)",
        "(line 688,col 9)-(line 688,col 106)",
        "(line 689,col 9)-(line 689,col 89)",
        "(line 692,col 9)-(line 692,col 47)",
        "(line 693,col 9)-(line 693,col 46)",
        "(line 694,col 9)-(line 694,col 112)",
        "(line 695,col 9)-(line 695,col 101)",
        "(line 698,col 9)-(line 698,col 50)",
        "(line 699,col 9)-(line 699,col 105)",
        "(line 700,col 9)-(line 700,col 89)",
        "(line 703,col 9)-(line 703,col 47)",
        "(line 704,col 9)-(line 704,col 46)",
        "(line 705,col 9)-(line 705,col 111)",
        "(line 706,col 9)-(line 706,col 101)",
        "(line 709,col 9)-(line 709,col 48)",
        "(line 710,col 9)-(line 710,col 107)",
        "(line 711,col 9)-(line 711,col 87)",
        "(line 714,col 9)-(line 714,col 46)",
        "(line 715,col 9)-(line 715,col 44)",
        "(line 716,col 9)-(line 716,col 113)",
        "(line 717,col 9)-(line 717,col 99)",
        "(line 720,col 9)-(line 720,col 48)",
        "(line 721,col 9)-(line 721,col 104)",
        "(line 722,col 9)-(line 722,col 87)",
        "(line 725,col 9)-(line 725,col 46)",
        "(line 726,col 9)-(line 726,col 44)",
        "(line 727,col 9)-(line 727,col 110)",
        "(line 728,col 9)-(line 728,col 99)",
        "(line 731,col 9)-(line 731,col 48)",
        "(line 732,col 9)-(line 732,col 106)",
        "(line 733,col 9)-(line 733,col 87)",
        "(line 736,col 9)-(line 736,col 46)",
        "(line 737,col 9)-(line 737,col 44)",
        "(line 738,col 9)-(line 738,col 112)",
        "(line 739,col 9)-(line 739,col 99)",
        "(line 741,col 9)-(line 741,col 42)",
        "(line 742,col 9)-(line 742,col 57)",
        "(line 745,col 9)-(line 745,col 51)",
        "(line 746,col 9)-(line 746,col 88)",
        "(line 747,col 9)-(line 747,col 89)",
        "(line 750,col 9)-(line 750,col 48)",
        "(line 751,col 9)-(line 751,col 46)",
        "(line 752,col 9)-(line 752,col 94)",
        "(line 753,col 9)-(line 753,col 101)",
        "(line 756,col 9)-(line 756,col 51)",
        "(line 757,col 9)-(line 757,col 87)",
        "(line 758,col 9)-(line 758,col 89)",
        "(line 761,col 9)-(line 761,col 48)",
        "(line 762,col 9)-(line 762,col 46)",
        "(line 763,col 9)-(line 763,col 93)",
        "(line 764,col 9)-(line 764,col 101)",
        "(line 767,col 9)-(line 767,col 51)",
        "(line 768,col 9)-(line 768,col 87)",
        "(line 769,col 9)-(line 769,col 89)",
        "(line 772,col 9)-(line 772,col 48)",
        "(line 773,col 9)-(line 773,col 46)",
        "(line 774,col 9)-(line 774,col 93)",
        "(line 775,col 9)-(line 775,col 101)",
        "(line 778,col 9)-(line 778,col 52)",
        "(line 779,col 9)-(line 779,col 66)",
        "(line 780,col 9)-(line 780,col 87)",
        "(line 783,col 9)-(line 783,col 46)",
        "(line 784,col 9)-(line 784,col 48)",
        "(line 785,col 9)-(line 785,col 72)",
        "(line 786,col 9)-(line 786,col 99)",
        "(line 788,col 9)-(line 788,col 45)",
        "(line 789,col 9)-(line 789,col 59)",
        "(line 792,col 9)-(line 792,col 51)",
        "(line 793,col 9)-(line 793,col 44)",
        "(line 794,col 9)-(line 794,col 87)",
        "(line 797,col 9)-(line 797,col 49)",
        "(line 798,col 9)-(line 798,col 44)",
        "(line 799,col 9)-(line 799,col 50)",
        "(line 800,col 9)-(line 800,col 99)",
        "(line 803,col 9)-(line 803,col 50)",
        "(line 804,col 9)-(line 804,col 85)",
        "(line 805,col 9)-(line 805,col 89)",
        "(line 808,col 9)-(line 808,col 47)",
        "(line 809,col 9)-(line 809,col 46)",
        "(line 810,col 9)-(line 810,col 91)",
        "(line 811,col 9)-(line 811,col 101)",
        "(line 813,col 9)-(line 813,col 46)",
        "(line 814,col 9)-(line 814,col 61)",
        "(line 817,col 9)-(line 817,col 54)",
        "(line 818,col 9)-(line 818,col 80)",
        "(line 819,col 9)-(line 819,col 89)",
        "(line 822,col 9)-(line 822,col 51)",
        "(line 823,col 9)-(line 823,col 46)",
        "(line 824,col 9)-(line 824,col 87)",
        "(line 825,col 9)-(line 825,col 101)",
        "(line 827,col 9)-(line 827,col 46)",
        "(line 828,col 9)-(line 828,col 61)",
        "(line 831,col 9)-(line 831,col 54)",
        "(line 832,col 9)-(line 832,col 46)",
        "(line 833,col 9)-(line 833,col 89)",
        "(line 836,col 9)-(line 836,col 51)",
        "(line 837,col 9)-(line 837,col 46)",
        "(line 838,col 9)-(line 838,col 53)",
        "(line 839,col 9)-(line 839,col 101)",
        "(line 842,col 9)-(line 842,col 56)",
        "(line 843,col 9)-(line 843,col 47)",
        "(line 844,col 9)-(line 844,col 91)",
        "(line 847,col 9)-(line 847,col 52)",
        "(line 848,col 9)-(line 848,col 48)",
        "(line 849,col 9)-(line 849,col 54)",
        "(line 850,col 9)-(line 850,col 103)",
        "(line 853,col 9)-(line 853,col 54)",
        "(line 854,col 9)-(line 854,col 46)",
        "(line 855,col 9)-(line 855,col 89)",
        "(line 858,col 9)-(line 858,col 51)",
        "(line 859,col 9)-(line 859,col 46)",
        "(line 860,col 9)-(line 860,col 53)",
        "(line 861,col 9)-(line 861,col 101)",
        "(line 864,col 9)-(line 864,col 58)",
        "(line 865,col 9)-(line 865,col 48)",
        "(line 866,col 9)-(line 866,col 93)",
        "(line 869,col 9)-(line 869,col 53)",
        "(line 870,col 9)-(line 870,col 50)",
        "(line 871,col 9)-(line 871,col 55)",
        "(line 872,col 9)-(line 872,col 105)",
        "(line 877,col 9)-(line 877,col 52)",
        "(line 878,col 9)-(line 878,col 105)",
        "(line 879,col 9)-(line 879,col 87)",
        "(line 882,col 9)-(line 882,col 50)",
        "(line 883,col 9)-(line 883,col 44)",
        "(line 884,col 9)-(line 884,col 111)",
        "(line 885,col 9)-(line 885,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testBasicFunctions()",
      "begin_line": 888,
      "end_line": 1037,
      "comment": "",
      "child_ranges": [
        "(line 890,col 9)-(line 890,col 55)",
        "(line 891,col 9)-(line 891,col 55)",
        "(line 892,col 9)-(line 892,col 55)",
        "(line 893,col 9)-(line 893,col 63)",
        "(line 895,col 9)-(line 895,col 63)",
        "(line 898,col 9)-(line 898,col 40)",
        "(line 899,col 9)-(line 899,col 97)",
        "(line 902,col 9)-(line 902,col 44)",
        "(line 903,col 9)-(line 903,col 82)",
        "(line 906,col 9)-(line 906,col 48)",
        "(line 907,col 9)-(line 907,col 83)",
        "(line 911,col 9)-(line 911,col 41)",
        "(line 912,col 9)-(line 912,col 95)",
        "(line 915,col 9)-(line 915,col 45)",
        "(line 916,col 9)-(line 916,col 97)",
        "(line 919,col 9)-(line 919,col 56)",
        "(line 920,col 9)-(line 920,col 97)",
        "(line 923,col 9)-(line 923,col 55)",
        "(line 924,col 9)-(line 924,col 84)",
        "(line 926,col 9)-(line 926,col 58)",
        "(line 927,col 9)-(line 927,col 86)",
        "(line 929,col 9)-(line 929,col 69)",
        "(line 930,col 9)-(line 930,col 86)",
        "(line 933,col 9)-(line 933,col 58)",
        "(line 934,col 9)-(line 934,col 86)",
        "(line 936,col 9)-(line 936,col 63)",
        "(line 937,col 9)-(line 937,col 88)",
        "(line 939,col 9)-(line 939,col 74)",
        "(line 940,col 9)-(line 940,col 88)",
        "(line 943,col 9)-(line 943,col 43)",
        "(line 944,col 9)-(line 944,col 43)",
        "(line 945,col 9)-(line 945,col 80)",
        "(line 947,col 9)-(line 947,col 62)",
        "(line 948,col 9)-(line 948,col 41)",
        "(line 949,col 9)-(line 949,col 45)",
        "(line 950,col 9)-(line 950,col 82)",
        "(line 953,col 9)-(line 953,col 53)",
        "(line 954,col 9)-(line 954,col 51)",
        "(line 955,col 9)-(line 955,col 88)",
        "(line 957,col 9)-(line 957,col 51)",
        "(line 958,col 9)-(line 958,col 53)",
        "(line 959,col 9)-(line 959,col 92)",
        "(line 962,col 9)-(line 962,col 60)",
        "(line 963,col 9)-(line 963,col 53)",
        "(line 964,col 9)-(line 964,col 94)",
        "(line 966,col 9)-(line 966,col 59)",
        "(line 967,col 9)-(line 967,col 55)",
        "(line 968,col 9)-(line 968,col 98)",
        "(line 970,col 9)-(line 970,col 70)",
        "(line 971,col 9)-(line 971,col 55)",
        "(line 972,col 9)-(line 972,col 98)",
        "(line 975,col 9)-(line 975,col 56)",
        "(line 976,col 9)-(line 976,col 56)",
        "(line 977,col 9)-(line 977,col 90)",
        "(line 979,col 9)-(line 979,col 55)",
        "(line 980,col 9)-(line 980,col 58)",
        "(line 981,col 9)-(line 981,col 94)",
        "(line 983,col 9)-(line 983,col 66)",
        "(line 984,col 9)-(line 984,col 58)",
        "(line 985,col 9)-(line 985,col 94)",
        "(line 988,col 9)-(line 988,col 40)",
        "(line 989,col 9)-(line 989,col 68)",
        "(line 992,col 9)-(line 992,col 44)",
        "(line 993,col 9)-(line 993,col 70)",
        "(line 995,col 9)-(line 995,col 56)",
        "(line 996,col 9)-(line 996,col 92)",
        "(line 998,col 9)-(line 998,col 60)",
        "(line 999,col 9)-(line 999,col 94)",
        "(line 1001,col 9)-(line 1001,col 71)",
        "(line 1002,col 9)-(line 1002,col 94)",
        "(line 1004,col 9)-(line 1004,col 50)",
        "(line 1005,col 9)-(line 1005,col 63)",
        "(line 1006,col 9)-(line 1006,col 99)",
        "(line 1008,col 9)-(line 1013,col 9)",
        "(line 1015,col 9)-(line 1015,col 63)",
        "(line 1016,col 9)-(line 1016,col 28)",
        "(line 1017,col 9)-(line 1017,col 96)",
        "(line 1018,col 9)-(line 1023,col 9)",
        "(line 1025,col 9)-(line 1025,col 57)",
        "(line 1026,col 9)-(line 1026,col 96)",
        "(line 1027,col 9)-(line 1027,col 94)",
        "(line 1029,col 9)-(line 1029,col 56)",
        "(line 1030,col 9)-(line 1030,col 98)",
        "(line 1031,col 9)-(line 1031,col 98)",
        "(line 1033,col 9)-(line 1033,col 64)",
        "(line 1034,col 9)-(line 1034,col 98)",
        "(line 1035,col 9)-(line 1035,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMisc()",
      "begin_line": 1039,
      "end_line": 1073,
      "comment": "",
      "child_ranges": [
        "(line 1041,col 9)-(line 1041,col 55)",
        "(line 1042,col 9)-(line 1042,col 55)",
        "(line 1043,col 9)-(line 1043,col 52)",
        "(line 1045,col 9)-(line 1045,col 36)",
        "(line 1046,col 9)-(line 1046,col 61)",
        "(line 1052,col 9)-(line 1057,col 9)",
        "(line 1059,col 8)-(line 1064,col 9)",
        "(line 1066,col 9)-(line 1071,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testPredicates()",
      "begin_line": 1075,
      "end_line": 1110,
      "comment": "",
      "child_ranges": [
        "(line 1078,col 9)-(line 1078,col 74)",
        "(line 1080,col 9)-(line 1080,col 38)",
        "(line 1081,col 9)-(line 1081,col 34)",
        "(line 1082,col 9)-(line 1082,col 37)",
        "(line 1084,col 9)-(line 1084,col 43)",
        "(line 1085,col 9)-(line 1085,col 48)",
        "(line 1086,col 9)-(line 1086,col 43)",
        "(line 1087,col 9)-(line 1087,col 25)",
        "(line 1088,col 9)-(line 1088,col 42)",
        "(line 1089,col 9)-(line 1089,col 25)",
        "(line 1090,col 9)-(line 1090,col 43)",
        "(line 1092,col 9)-(line 1092,col 25)",
        "(line 1093,col 9)-(line 1093,col 78)",
        "(line 1094,col 9)-(line 1094,col 96)",
        "(line 1095,col 9)-(line 1095,col 82)",
        "(line 1097,col 9)-(line 1098,col 88)",
        "(line 1100,col 9)-(line 1101,col 77)",
        "(line 1103,col 9)-(line 1103,col 39)",
        "(line 1104,col 9)-(line 1104,col 46)",
        "(line 1105,col 9)-(line 1105,col 43)",
        "(line 1106,col 9)-(line 1106,col 53)",
        "(line 1107,col 9)-(line 1107,col 78)",
        "(line 1108,col 9)-(line 1108,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testSerial()",
      "begin_line": 1112,
      "end_line": 1116,
      "comment": "",
      "child_ranges": [
        "(line 1114,col 9)-(line 1114,col 74)",
        "(line 1115,col 9)-(line 1115,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testZeroVectors()",
      "begin_line": 1118,
      "end_line": 1123,
      "comment": "",
      "child_ranges": [
        "(line 1120,col 9)-(line 1120,col 82)",
        "(line 1121,col 9)-(line 1121,col 88)",
        "(line 1122,col 9)-(line 1122,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.testMinMax()",
      "begin_line": 1125,
      "end_line": 1147,
      "comment": "",
      "child_ranges": [
        "(line 1127,col 9)-(line 1127,col 83)",
        "(line 1128,col 9)-(line 1128,col 50)",
        "(line 1129,col 9)-(line 1129,col 59)",
        "(line 1130,col 9)-(line 1130,col 50)",
        "(line 1131,col 9)-(line 1131,col 59)",
        "(line 1132,col 9)-(line 1132,col 97)",
        "(line 1133,col 9)-(line 1133,col 50)",
        "(line 1134,col 9)-(line 1134,col 59)",
        "(line 1135,col 9)-(line 1135,col 50)",
        "(line 1136,col 9)-(line 1136,col 58)",
        "(line 1137,col 9)-(line 1137,col 90)",
        "(line 1138,col 9)-(line 1138,col 51)",
        "(line 1139,col 9)-(line 1139,col 58)",
        "(line 1140,col 9)-(line 1140,col 51)",
        "(line 1141,col 9)-(line 1141,col 58)",
        "(line 1142,col 9)-(line 1142,col 64)",
        "(line 1143,col 9)-(line 1143,col 51)",
        "(line 1144,col 9)-(line 1144,col 58)",
        "(line 1145,col 9)-(line 1145,col 51)",
        "(line 1146,col 9)-(line 1146,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.ArrayRealVectorTest.assertClose(java.lang.String, double[], double[], double)",
      "begin_line": 1151,
      "end_line": 1159,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 1153,col 9)-(line 1155,col 9)",
        "(line 1156,col 9)-(line 1158,col 9)"
      ]
    }
  ]
}