{
  "filepath": "/tmp/Lang-9b/src/test/java/org/apache/commons/lang3/SerializationUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SerializationUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 417,
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
        "(line 71,col 9)-(line 71,col 83)",
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
        "(line 81,col 9)-(line 81,col 39)",
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
        "(line 104,col 9)-(line 104,col 71)",
        "(line 105,col 9)-(line 105,col 55)",
        "(line 107,col 9)-(line 107,col 71)",
        "(line 108,col 9)-(line 108,col 68)",
        "(line 109,col 9)-(line 109,col 30)",
        "(line 110,col 9)-(line 110,col 20)",
        "(line 111,col 9)-(line 111,col 20)",
        "(line 113,col 9)-(line 113,col 52)",
        "(line 114,col 9)-(line 114,col 52)",
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
        "(line 123,col 9)-(line 123,col 71)",
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
        "(line 135,col 9)-(line 135,col 71)",
        "(line 136,col 9)-(line 136,col 55)",
        "(line 138,col 9)-(line 138,col 71)",
        "(line 139,col 9)-(line 139,col 68)",
        "(line 140,col 9)-(line 140,col 30)",
        "(line 141,col 9)-(line 141,col 20)",
        "(line 142,col 9)-(line 142,col 20)",
        "(line 144,col 9)-(line 144,col 52)",
        "(line 145,col 9)-(line 145,col 52)",
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
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.Anonymous-9d32ae87-8f3e-4d97-9adf-d996ad57c62e.write(int)",
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
        "(line 194,col 9)-(line 194,col 71)",
        "(line 195,col 9)-(line 195,col 68)",
        "(line 196,col 9)-(line 196,col 30)",
        "(line 197,col 9)-(line 197,col 20)",
        "(line 198,col 9)-(line 198,col 20)",
        "(line 200,col 9)-(line 200,col 89)",
        "(line 201,col 9)-(line 201,col 61)",
        "(line 202,col 9)-(line 202,col 28)",
        "(line 203,col 9)-(line 203,col 50)",
        "(line 204,col 9)-(line 204,col 33)",
        "(line 205,col 9)-(line 205,col 53)",
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
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 37)",
        "(line 216,col 9)-(line 216,col 64)",
        "(line 217,col 9)-(line 217,col 79)",
        "(line 219,col 9)-(line 219,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamOfNull()",
      "begin_line": 222,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 71)",
        "(line 225,col 9)-(line 225,col 68)",
        "(line 226,col 9)-(line 226,col 30)",
        "(line 227,col 9)-(line 227,col 20)",
        "(line 228,col 9)-(line 228,col 20)",
        "(line 230,col 9)-(line 230,col 89)",
        "(line 231,col 9)-(line 231,col 61)",
        "(line 232,col 9)-(line 232,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamNull()",
      "begin_line": 235,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamBadStream()",
      "begin_line": 245,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamClassNotFound()",
      "begin_line": 255,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 71)",
        "(line 258,col 9)-(line 258,col 68)",
        "(line 259,col 9)-(line 259,col 58)",
        "(line 260,col 9)-(line 260,col 20)",
        "(line 261,col 9)-(line 261,col 20)",
        "(line 263,col 9)-(line 263,col 89)",
        "(line 264,col 9)-(line 269,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytes()",
      "begin_line": 274,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 62)",
        "(line 278,col 9)-(line 278,col 71)",
        "(line 279,col 9)-(line 279,col 68)",
        "(line 280,col 9)-(line 280,col 30)",
        "(line 281,col 9)-(line 281,col 20)",
        "(line 282,col 9)-(line 282,col 20)",
        "(line 284,col 9)-(line 284,col 52)",
        "(line 285,col 9)-(line 285,col 57)",
        "(line 286,col 9)-(line 288,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytesUnserializable()",
      "begin_line": 291,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 293,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytesNull()",
      "begin_line": 302,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 62)",
        "(line 306,col 9)-(line 306,col 71)",
        "(line 307,col 9)-(line 307,col 68)",
        "(line 308,col 9)-(line 308,col 30)",
        "(line 309,col 9)-(line 309,col 20)",
        "(line 310,col 9)-(line 310,col 20)",
        "(line 312,col 9)-(line 312,col 52)",
        "(line 313,col 9)-(line 313,col 57)",
        "(line 314,col 9)-(line 316,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytes()",
      "begin_line": 321,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 71)",
        "(line 324,col 9)-(line 324,col 68)",
        "(line 325,col 9)-(line 325,col 30)",
        "(line 326,col 9)-(line 326,col 20)",
        "(line 327,col 9)-(line 327,col 20)",
        "(line 329,col 9)-(line 329,col 79)",
        "(line 330,col 9)-(line 330,col 28)",
        "(line 331,col 9)-(line 331,col 50)",
        "(line 332,col 9)-(line 332,col 33)",
        "(line 333,col 9)-(line 333,col 53)",
        "(line 334,col 9)-(line 334,col 50)",
        "(line 335,col 9)-(line 335,col 50)",
        "(line 336,col 9)-(line 336,col 51)",
        "(line 337,col 9)-(line 337,col 51)",
        "(line 338,col 9)-(line 338,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesOfNull()",
      "begin_line": 341,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 71)",
        "(line 344,col 9)-(line 344,col 68)",
        "(line 345,col 9)-(line 345,col 30)",
        "(line 346,col 9)-(line 346,col 20)",
        "(line 347,col 9)-(line 347,col 20)",
        "(line 349,col 9)-(line 349,col 79)",
        "(line 350,col 9)-(line 350,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesNull()",
      "begin_line": 353,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 355,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesBadStream()",
      "begin_line": 363,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 365,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testClone()",
      "begin_line": 375,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 53)",
        "(line 378,col 9)-(line 378,col 28)",
        "(line 379,col 9)-(line 379,col 49)",
        "(line 380,col 9)-(line 380,col 33)",
        "(line 381,col 9)-(line 381,col 53)",
        "(line 382,col 9)-(line 382,col 50)",
        "(line 383,col 9)-(line 383,col 50)",
        "(line 384,col 9)-(line 384,col 51)",
        "(line 385,col 9)-(line 385,col 51)",
        "(line 386,col 9)-(line 386,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testCloneNull()",
      "begin_line": 389,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 53)",
        "(line 392,col 9)-(line 392,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testCloneUnserializable()",
      "begin_line": 395,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 397,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testPrimitiveTypeClassSerialization()",
      "begin_line": 406,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 409,col 56)",
        "(line 411,col 9)-(line 414,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassNotFoundSerialization",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 419,
      "end_line": 426,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassNotFoundSerialization.readObject(java.io.ObjectInputStream)",
      "begin_line": 423,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 89)"
      ]
    }
  ]
}