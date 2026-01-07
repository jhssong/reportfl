{
  "filepath": "/tmp/Compress-12b/src/main/java/org/apache/commons/compress/compressors/xz/XZCompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XZCompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream"
      ],
      "begin_line": 32,
      "end_line": 98,
      "comment": "\n * XZ compressor.\n * @since Commons Compress 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorOutputStream.XZCompressorOutputStream(java.io.OutputStream)",
      "begin_line": 39,
      "end_line": 42,
      "comment": "\n     * Creates a new XZ compressor using the default LZMA2 options.\n     * This is equivalent to \u003ccode\u003eXZCompressorOutputStream(6)\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorOutputStream.XZCompressorOutputStream(java.io.OutputStream, int)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * Creates a new XZ compressor using the specified LZMA2 preset level.\n     * \u003cp\u003e\n     * The presets 0-3 are fast presets with medium compression.\n     * The presets 4-6 are fairly slow presets with high compression.\n     * The default preset is 6.\n     * \u003cp\u003e\n     * The presets 7-9 are like the preset 6 but use bigger dictionaries\n     * and have higher compressor and decompressor memory requirements.\n     * Unless the uncompressed size of the file exceeds 8\u0026nbsp;MiB,\n     * 16\u0026nbsp;MiB, or 32\u0026nbsp;MiB, it is waste of memory to use the\n     * presets 7, 8, or 9, respectively.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorOutputStream.write(int)",
      "begin_line": 63,
      "end_line": 66,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorOutputStream.write(byte[], int, int)",
      "begin_line": 69,
      "end_line": 72,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorOutputStream.flush()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Flushes the encoder and calls \u003ccode\u003eoutputStream.flush()\u003c/code\u003e.\n     * All buffered pending data will then be decompressible from\n     * the output stream. Calling this function very often may increase\n     * the compressed file size a lot.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorOutputStream.finish()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Finishes compression without closing the underlying stream.\n     * No more data can be written to this stream after finishing.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.xz.XZCompressorOutputStream.close()",
      "begin_line": 94,
      "end_line": 97,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 20)"
      ]
    }
  ]
}