{
  "filepath": "/tmp/Lang-3b/src/test/java/org/apache/commons/lang3/SerializationUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SerializationUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 419,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.SerializationUtils}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CLASS_NOT_FOUND_MESSAGE"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SERIALIZE_IO_EXCEPTION_MESSAGE"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iString"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iInteger"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iMap"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.setUp()",
      "begin_line": 57,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 24)",
        "(line 60,col 9)-(line 60,col 38)",
        "(line 61,col 9)-(line 61,col 45)",
        "(line 62,col 9)-(line 62,col 33)",
        "(line 63,col 9)-(line 63,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testConstructor()",
      "begin_line": 68,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 48)",
        "(line 71,col 9)-(line 71,col 89)",
        "(line 72,col 9)-(line 72,col 37)",
        "(line 73,col 9)-(line 73,col 62)",
        "(line 74,col 9)-(line 74,col 79)",
        "(line 75,col 9)-(line 75,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testException()",
      "begin_line": 78,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 37)",
        "(line 81,col 9)-(line 81,col 45)",
        "(line 83,col 9)-(line 83,col 45)",
        "(line 84,col 9)-(line 84,col 45)",
        "(line 85,col 9)-(line 85,col 43)",
        "(line 87,col 9)-(line 87,col 54)",
        "(line 88,col 9)-(line 88,col 50)",
        "(line 89,col 9)-(line 89,col 43)",
        "(line 91,col 9)-(line 91,col 47)",
        "(line 92,col 9)-(line 92,col 64)",
        "(line 93,col 9)-(line 93,col 41)",
        "(line 95,col 9)-(line 95,col 58)",
        "(line 96,col 9)-(line 96,col 50)",
        "(line 97,col 9)-(line 97,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeStream()",
      "begin_line": 102,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 77)",
        "(line 105,col 9)-(line 105,col 55)",
        "(line 107,col 9)-(line 107,col 77)",
        "(line 108,col 9)-(line 108,col 74)",
        "(line 109,col 9)-(line 109,col 30)",
        "(line 110,col 9)-(line 110,col 20)",
        "(line 111,col 9)-(line 111,col 20)",
        "(line 113,col 9)-(line 113,col 58)",
        "(line 114,col 9)-(line 114,col 58)",
        "(line 115,col 9)-(line 115,col 57)",
        "(line 116,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamUnserializable()",
      "begin_line": 121,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 77)",
        "(line 124,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamNullObj()",
      "begin_line": 133,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 77)",
        "(line 136,col 9)-(line 136,col 55)",
        "(line 138,col 9)-(line 138,col 77)",
        "(line 139,col 9)-(line 139,col 74)",
        "(line 140,col 9)-(line 140,col 30)",
        "(line 141,col 9)-(line 141,col 20)",
        "(line 142,col 9)-(line 142,col 20)",
        "(line 144,col 9)-(line 144,col 58)",
        "(line 145,col 9)-(line 145,col 58)",
        "(line 146,col 9)-(line 146,col 57)",
        "(line 147,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamObjNull()",
      "begin_line": 152,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamNullNull()",
      "begin_line": 162,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeIOException()",
      "begin_line": 172,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 181,col 10)",
        "(line 182,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.Anonymous-fde74465-75e6-40a6-a0ed-2a2087e45b81.write(int)",
      "begin_line": 177,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 17)-(line 179,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStream()",
      "begin_line": 192,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 77)",
        "(line 195,col 9)-(line 195,col 74)",
        "(line 196,col 9)-(line 196,col 30)",
        "(line 197,col 9)-(line 197,col 20)",
        "(line 198,col 9)-(line 198,col 20)",
        "(line 200,col 9)-(line 200,col 95)",
        "(line 201,col 9)-(line 201,col 67)",
        "(line 202,col 9)-(line 202,col 28)",
        "(line 203,col 9)-(line 203,col 50)",
        "(line 204,col 9)-(line 204,col 33)",
        "(line 205,col 9)-(line 205,col 59)",
        "(line 206,col 9)-(line 206,col 50)",
        "(line 207,col 9)-(line 207,col 50)",
        "(line 208,col 9)-(line 208,col 51)",
        "(line 209,col 9)-(line 209,col 51)",
        "(line 210,col 9)-(line 210,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeClassCastException()",
      "begin_line": 213,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 37)",
        "(line 216,col 9)-(line 216,col 70)",
        "(line 217,col 9)-(line 217,col 79)",
        "(line 219,col 9)-(line 220,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamOfNull()",
      "begin_line": 223,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 77)",
        "(line 226,col 9)-(line 226,col 74)",
        "(line 227,col 9)-(line 227,col 30)",
        "(line 228,col 9)-(line 228,col 20)",
        "(line 229,col 9)-(line 229,col 20)",
        "(line 231,col 9)-(line 231,col 95)",
        "(line 232,col 9)-(line 232,col 67)",
        "(line 233,col 9)-(line 233,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamNull()",
      "begin_line": 236,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamBadStream()",
      "begin_line": 246,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamClassNotFound()",
      "begin_line": 256,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 77)",
        "(line 259,col 9)-(line 259,col 74)",
        "(line 260,col 9)-(line 260,col 58)",
        "(line 261,col 9)-(line 261,col 20)",
        "(line 262,col 9)-(line 262,col 20)",
        "(line 264,col 9)-(line 264,col 95)",
        "(line 265,col 9)-(line 271,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytes()",
      "begin_line": 276,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 68)",
        "(line 280,col 9)-(line 280,col 77)",
        "(line 281,col 9)-(line 281,col 74)",
        "(line 282,col 9)-(line 282,col 30)",
        "(line 283,col 9)-(line 283,col 20)",
        "(line 284,col 9)-(line 284,col 20)",
        "(line 286,col 9)-(line 286,col 58)",
        "(line 287,col 9)-(line 287,col 57)",
        "(line 288,col 9)-(line 290,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytesUnserializable()",
      "begin_line": 293,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 295,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytesNull()",
      "begin_line": 304,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 68)",
        "(line 308,col 9)-(line 308,col 77)",
        "(line 309,col 9)-(line 309,col 74)",
        "(line 310,col 9)-(line 310,col 30)",
        "(line 311,col 9)-(line 311,col 20)",
        "(line 312,col 9)-(line 312,col 20)",
        "(line 314,col 9)-(line 314,col 58)",
        "(line 315,col 9)-(line 315,col 57)",
        "(line 316,col 9)-(line 318,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytes()",
      "begin_line": 323,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 77)",
        "(line 326,col 9)-(line 326,col 74)",
        "(line 327,col 9)-(line 327,col 30)",
        "(line 328,col 9)-(line 328,col 20)",
        "(line 329,col 9)-(line 329,col 20)",
        "(line 331,col 9)-(line 331,col 85)",
        "(line 332,col 9)-(line 332,col 28)",
        "(line 333,col 9)-(line 333,col 50)",
        "(line 334,col 9)-(line 334,col 33)",
        "(line 335,col 9)-(line 335,col 59)",
        "(line 336,col 9)-(line 336,col 50)",
        "(line 337,col 9)-(line 337,col 50)",
        "(line 338,col 9)-(line 338,col 51)",
        "(line 339,col 9)-(line 339,col 51)",
        "(line 340,col 9)-(line 340,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesOfNull()",
      "begin_line": 343,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 77)",
        "(line 346,col 9)-(line 346,col 74)",
        "(line 347,col 9)-(line 347,col 30)",
        "(line 348,col 9)-(line 348,col 20)",
        "(line 349,col 9)-(line 349,col 20)",
        "(line 351,col 9)-(line 351,col 85)",
        "(line 352,col 9)-(line 352,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesNull()",
      "begin_line": 355,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 357,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesBadStream()",
      "begin_line": 365,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testClone()",
      "begin_line": 377,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 59)",
        "(line 380,col 9)-(line 380,col 28)",
        "(line 381,col 9)-(line 381,col 49)",
        "(line 382,col 9)-(line 382,col 33)",
        "(line 383,col 9)-(line 383,col 59)",
        "(line 384,col 9)-(line 384,col 50)",
        "(line 385,col 9)-(line 385,col 50)",
        "(line 386,col 9)-(line 386,col 51)",
        "(line 387,col 9)-(line 387,col 51)",
        "(line 388,col 9)-(line 388,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testCloneNull()",
      "begin_line": 391,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 59)",
        "(line 394,col 9)-(line 394,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testCloneUnserializable()",
      "begin_line": 397,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 405,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testPrimitiveTypeClassSerialization()",
      "begin_line": 408,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 410,col 9)-(line 411,col 56)",
        "(line 413,col 9)-(line 416,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassNotFoundSerialization",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 421,
      "end_line": 428,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassNotFoundSerialization.readObject(java.io.ObjectInputStream)",
      "begin_line": 425,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 89)"
      ]
    }
  ]
}