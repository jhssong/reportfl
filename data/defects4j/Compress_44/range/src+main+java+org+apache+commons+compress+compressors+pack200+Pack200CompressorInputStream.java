{
  "filepath": "/tmp/Compress-44b/src/main/java/org/apache/commons/compress/compressors/pack200/Pack200CompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Pack200CompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 43,
      "end_line": 281,
      "comment": "\n * An input stream that decompresses from the Pack200 format to be read\n * as any other stream.\n * \n * \u003cp\u003eThe {@link CompressorInputStream#getCount getCount} and {@link\n * CompressorInputStream#getBytesRead getBytesRead} methods always\n * return 0.\u003c/p\u003e\n *\n * @NotThreadSafe\n * @since 1.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "originalInput"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "streamBridge"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * Decompresses the given stream, caching the decompressed data in\n     * memory.\n     *\n     * \u003cp\u003eWhen reading from a file the File-arg constructor may\n     * provide better performance.\u003c/p\u003e\n     *\n     * @param in the InputStream from which this object should be created\n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream, org.apache.commons.compress.compressors.pack200.Pack200Strategy)",
      "begin_line": 73,
      "end_line": 77,
      "comment": "\n     * Decompresses the given stream using the given strategy to cache\n     * the results.\n     *\n     * \u003cp\u003eWhen reading from a file the File-arg constructor may\n     * provide better performance.\u003c/p\u003e\n     *\n     * @param in the InputStream from which this object should be created\n     * @param mode the strategy to use\n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 90,
      "end_line": 94,
      "comment": "\n     * Decompresses the given stream, caching the decompressed data in\n     * memory and using the given properties.\n     *\n     * \u003cp\u003eWhen reading from a file the File-arg constructor may\n     * provide better performance.\u003c/p\u003e\n     *\n     * @param in the InputStream from which this object should be created\n     * @param props Pack200 properties to use\n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream, org.apache.commons.compress.compressors.pack200.Pack200Strategy, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 108,
      "end_line": 113,
      "comment": "\n     * Decompresses the given stream using the given strategy to cache\n     * the results and the given properties.\n     *\n     * \u003cp\u003eWhen reading from a file the File-arg constructor may\n     * provide better performance.\u003c/p\u003e\n     *\n     * @param in the InputStream from which this object should be created\n     * @param mode the strategy to use\n     * @param props Pack200 properties to use\n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.File)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Decompresses the given file, caching the decompressed data in\n     * memory.\n     *\n     * @param f the file to decompress\n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.File, org.apache.commons.compress.compressors.pack200.Pack200Strategy)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "\n     * Decompresses the given file using the given strategy to cache\n     * the results.\n     *\n     * @param f the file to decompress\n     * @param mode the strategy to use\n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.File, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 147,
      "end_line": 151,
      "comment": "\n     * Decompresses the given file, caching the decompressed data in\n     * memory and using the given properties.\n     *\n     * @param f the file to decompress\n     * @param props Pack200 properties to use\n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.File, org.apache.commons.compress.compressors.pack200.Pack200Strategy, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 162,
      "end_line": 166,
      "comment": "\n     * Decompresses the given file using the given strategy to cache\n     * the results and the given properties.\n     *\n     * @param f the file to decompress\n     * @param mode the strategy to use\n     * @param props Pack200 properties to use\n     * @throws IOException if reading fails\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Pack200CompressorInputStream(java.io.InputStream, java.io.File, org.apache.commons.compress.compressors.pack200.Pack200Strategy, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 168,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 27)",
        "(line 173,col 9)-(line 173,col 46)",
        "(line 174,col 9)-(line 190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.Anonymous-9efe4146-9ebd-4004-9894-f14c59545d89.close()",
      "begin_line": 181,
      "end_line": 185,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.read()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.read(byte[])",
      "begin_line": 198,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.read(byte[], int, int)",
      "begin_line": 203,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.available()",
      "begin_line": 208,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.markSupported()",
      "begin_line": 213,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.mark(int)",
      "begin_line": 222,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 228,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.reset()",
      "begin_line": 231,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.skip(long)",
      "begin_line": 236,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.close()",
      "begin_line": 241,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "CAFE_DOOD"
      ],
      "begin_line": 252,
      "end_line": 254,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIG_LENGTH"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.matches(byte[], int)",
      "begin_line": 268,
      "end_line": 280,
      "comment": "\n     * Checks if the signature matches what is expected for a pack200\n     * file (0xCAFED00D).\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a pack200 compressed stream,\n     * false otherwise\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 271,col 9)",
        "(line 273,col 9)-(line 277,col 9)",
        "(line 279,col 9)-(line 279,col 20)"
      ]
    }
  ]
}