{
  "filepath": "/tmp/Compress-40b/src/main/java/org/apache/commons/compress/compressors/deflate/DeflateParameters.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DeflateParameters",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 79,
      "comment": "\n * Parameters for the Deflate compressor.\n * @since 1.9\n "
    },
    {
      "type": "field",
      "varNames": [
        "zlibHeader"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compressionLevel"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateParameters.withZlibHeader()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Whether or not the zlib header shall be written (when\n     * compressing) or expected (when decompressing).\n     * @return true if zlib header shall be written\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateParameters.setWithZlibHeader(boolean)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Sets the zlib header presence parameter.\n     *\n     * \u003cp\u003eThis affects whether or not the zlib header will be written\n     * (when compressing) or expected (when decompressing).\u003c/p\u003e\n     *\n     * @param zlibHeader true if zlib header shall be written\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateParameters.getCompressionLevel()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * The compression level.\n     * @see #setCompressionLevel\n     * @return the compression level\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.deflate.DeflateParameters.setCompressionLevel(int)",
      "begin_line": 72,
      "end_line": 77,
      "comment": "\n     * Sets the compression level.\n     *\n     * @param compressionLevel the compression level (between 0 and 9)\n     * @see Deflater#NO_COMPRESSION\n     * @see Deflater#BEST_SPEED\n     * @see Deflater#DEFAULT_COMPRESSION\n     * @see Deflater#BEST_COMPRESSION\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 49)"
      ]
    }
  ]
}