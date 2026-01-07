{
  "filepath": "/tmp/Lang-4b/src/test/java/org/apache/commons/lang3/SerializationUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SerializationUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 418,
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
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.Anonymous-d7c3b157-0c00-4e23-873a-47346a818043.write(int)",
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
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 37)",
        "(line 216,col 9)-(line 216,col 70)",
        "(line 217,col 9)-(line 217,col 79)",
        "(line 219,col 9)-(line 219,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamOfNull()",
      "begin_line": 222,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 77)",
        "(line 225,col 9)-(line 225,col 74)",
        "(line 226,col 9)-(line 226,col 30)",
        "(line 227,col 9)-(line 227,col 20)",
        "(line 228,col 9)-(line 228,col 20)",
        "(line 230,col 9)-(line 230,col 95)",
        "(line 231,col 9)-(line 231,col 67)",
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
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 77)",
        "(line 258,col 9)-(line 258,col 74)",
        "(line 259,col 9)-(line 259,col 58)",
        "(line 260,col 9)-(line 260,col 20)",
        "(line 261,col 9)-(line 261,col 20)",
        "(line 263,col 9)-(line 263,col 95)",
        "(line 264,col 9)-(line 270,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytes()",
      "begin_line": 275,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 68)",
        "(line 279,col 9)-(line 279,col 77)",
        "(line 280,col 9)-(line 280,col 74)",
        "(line 281,col 9)-(line 281,col 30)",
        "(line 282,col 9)-(line 282,col 20)",
        "(line 283,col 9)-(line 283,col 20)",
        "(line 285,col 9)-(line 285,col 58)",
        "(line 286,col 9)-(line 286,col 57)",
        "(line 287,col 9)-(line 289,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytesUnserializable()",
      "begin_line": 292,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 294,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytesNull()",
      "begin_line": 303,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 68)",
        "(line 307,col 9)-(line 307,col 77)",
        "(line 308,col 9)-(line 308,col 74)",
        "(line 309,col 9)-(line 309,col 30)",
        "(line 310,col 9)-(line 310,col 20)",
        "(line 311,col 9)-(line 311,col 20)",
        "(line 313,col 9)-(line 313,col 58)",
        "(line 314,col 9)-(line 314,col 57)",
        "(line 315,col 9)-(line 317,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytes()",
      "begin_line": 322,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 77)",
        "(line 325,col 9)-(line 325,col 74)",
        "(line 326,col 9)-(line 326,col 30)",
        "(line 327,col 9)-(line 327,col 20)",
        "(line 328,col 9)-(line 328,col 20)",
        "(line 330,col 9)-(line 330,col 85)",
        "(line 331,col 9)-(line 331,col 28)",
        "(line 332,col 9)-(line 332,col 50)",
        "(line 333,col 9)-(line 333,col 33)",
        "(line 334,col 9)-(line 334,col 59)",
        "(line 335,col 9)-(line 335,col 50)",
        "(line 336,col 9)-(line 336,col 50)",
        "(line 337,col 9)-(line 337,col 51)",
        "(line 338,col 9)-(line 338,col 51)",
        "(line 339,col 9)-(line 339,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesOfNull()",
      "begin_line": 342,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 77)",
        "(line 345,col 9)-(line 345,col 74)",
        "(line 346,col 9)-(line 346,col 30)",
        "(line 347,col 9)-(line 347,col 20)",
        "(line 348,col 9)-(line 348,col 20)",
        "(line 350,col 9)-(line 350,col 85)",
        "(line 351,col 9)-(line 351,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesNull()",
      "begin_line": 354,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesBadStream()",
      "begin_line": 364,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testClone()",
      "begin_line": 376,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 59)",
        "(line 379,col 9)-(line 379,col 28)",
        "(line 380,col 9)-(line 380,col 49)",
        "(line 381,col 9)-(line 381,col 33)",
        "(line 382,col 9)-(line 382,col 59)",
        "(line 383,col 9)-(line 383,col 50)",
        "(line 384,col 9)-(line 384,col 50)",
        "(line 385,col 9)-(line 385,col 51)",
        "(line 386,col 9)-(line 386,col 51)",
        "(line 387,col 9)-(line 387,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testCloneNull()",
      "begin_line": 390,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 59)",
        "(line 393,col 9)-(line 393,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testCloneUnserializable()",
      "begin_line": 396,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 398,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtilsTest.testPrimitiveTypeClassSerialization()",
      "begin_line": 407,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 409,col 9)-(line 410,col 56)",
        "(line 412,col 9)-(line 415,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassNotFoundSerialization",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 420,
      "end_line": 427,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.ClassNotFoundSerialization.readObject(java.io.ObjectInputStream)",
      "begin_line": 424,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 89)"
      ]
    }
  ]
}