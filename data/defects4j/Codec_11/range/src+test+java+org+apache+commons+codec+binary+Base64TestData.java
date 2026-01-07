{
  "filepath": "/tmp/Codec-11b/src/test/java/org/apache/commons/codec/binary/Base64TestData.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64TestData",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 223,
      "comment": "\n * This random data was encoded by OpenSSL. Java had nothing to do with it. This data helps us test interop between\n * Commons-Codec and OpenSSL. Notice that OpenSSL creates 64 character lines instead of the 76 of Commons-Codec.\n * \n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\n * @author Apache Software Foundation\n * @version $Id $\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "CODEC_101_MULTIPLE_OF_3"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CODEC_98_NPE"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CODEC_98_NPE_DECODED"
      ],
      "begin_line": 40,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ENCODED_64_CHARS_PER_LINE"
      ],
      "begin_line": 46,
      "end_line": 68,
      "comment": " to further parameterize commons-codec to support this pointless variation."
    },
    {
      "type": "field",
      "varNames": [
        "ENCODED_76_CHARS_PER_LINE"
      ],
      "begin_line": 70,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DECODED"
      ],
      "begin_line": 90,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIZE_KEY"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LAST_READ_KEY"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.streamToBytes(java.io.InputStream)",
      "begin_line": 143,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.streamToBytes(java.io.InputStream, byte[])",
      "begin_line": 148,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.fill(byte[], int, java.io.InputStream)",
      "begin_line": 171,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 61)",
        "(line 174,col 9)-(line 174,col 28)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.resizeArray(byte[])",
      "begin_line": 187,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 56)",
        "(line 189,col 9)-(line 189,col 65)",
        "(line 190,col 9)-(line 190,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.randomData(int, boolean)",
      "begin_line": 201,
      "end_line": 207,
      "comment": "\n     * Returns an encoded and decoded copy of the same random data.\n     * \n     * @param size amount of random data to generate and encode\n     * @param urlSafe true if encoding be urlSafe\n     * @return two byte[] arrays:  [0] \u003d decoded, [1] \u003d encoded \n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 32)",
        "(line 203,col 9)-(line 203,col 40)",
        "(line 204,col 9)-(line 204,col 29)",
        "(line 205,col 9)-(line 205,col 102)",
        "(line 206,col 9)-(line 206,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64TestData.bytesContain(byte[], byte)",
      "begin_line": 216,
      "end_line": 221,
      "comment": "\n     * Tests the supplied byte[] array to see if it contains the specified byte c.\n     *\n     * @param bytes byte[] array to test\n     * @param c byte to look for\n     * @return true if bytes contains c, false otherwise\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 21)"
      ]
    }
  ]
}