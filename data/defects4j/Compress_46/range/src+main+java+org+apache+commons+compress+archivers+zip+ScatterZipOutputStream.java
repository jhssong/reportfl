{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/archivers/zip/ScatterZipOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ScatterZipOutputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 48,
      "end_line": 156,
      "comment": "\n * A zip output stream that is optimized for multi-threaded scatter/gather construction of zip files.\n * \u003cp\u003e\n * The internal data format of the entries used by this class are entirely private to this class\n * and are not part of any public api whatsoever.\n * \u003c/p\u003e\n * \u003cp\u003eIt is possible to extend this class to support different kinds of backing storage, the default\n * implementation only supports file-based backing.\n * \u003c/p\u003e\n * Thread safety: This class supports multiple threads. But the \"writeTo\" method must be called\n * by the thread that originally created the {@link ZipArchiveEntry}.\n *\n * @since 1.10\n "
    },
    {
      "type": "field",
      "varNames": [
        "items"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "backingStore"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "streamCompressor"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CompressedEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zipArchiveEntryRequest"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compressedSize"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.CompressedEntry.CompressedEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest, long, long, long)",
      "begin_line": 59,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 60,col 13)-(line 60,col 65)",
        "(line 61,col 13)-(line 61,col 27)",
        "(line 62,col 13)-(line 62,col 49)",
        "(line 63,col 13)-(line 63,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.CompressedEntry.transferToArchiveEntry()",
      "begin_line": 72,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 73,col 13)-(line 73,col 86)",
        "(line 74,col 13)-(line 74,col 52)",
        "(line 75,col 13)-(line 75,col 32)",
        "(line 76,col 13)-(line 76,col 30)",
        "(line 77,col 13)-(line 77,col 64)",
        "(line 78,col 13)-(line 78,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ScatterZipOutputStream(org.apache.commons.compress.parallel.ScatterGatherBackingStore, org.apache.commons.compress.archivers.zip.StreamCompressor)",
      "begin_line": 82,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 41)",
        "(line 85,col 9)-(line 85,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.addArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest)",
      "begin_line": 94,
      "end_line": 100,
      "comment": "\n     * Add an archive entry to this scatter stream.\n     *\n     * @param zipArchiveEntryRequest The entry to write.\n     * @throws IOException    If writing fails\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 99,col 120)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.writeTo(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)",
      "begin_line": 108,
      "end_line": 118,
      "comment": "\n     * Write the contents of this scatter stream to a target archive.\n     *\n     * @param target The archive to receive the contents of this {@link ScatterZipOutputStream}.\n     * @throws IOException If writing fails\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 39)",
        "(line 110,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.close()",
      "begin_line": 125,
      "end_line": 129,
      "comment": "\n     * Closes this stream, freeing all resources involved in the creation of this stream.\n     * @throws IOException If closing fails\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 29)",
        "(line 128,col 9)-(line 128,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.fileBased(java.io.File)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Create a {@link ScatterZipOutputStream} with default compression level that is backed by a file\n     *\n     * @param file The file to offload compressed data into.\n     * @return A ScatterZipOutputStream that is ready for use.\n     * @throws FileNotFoundException if the file cannot be found\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.fileBased(java.io.File, int)",
      "begin_line": 150,
      "end_line": 155,
      "comment": "\n     * Create a {@link ScatterZipOutputStream} that is backed by a file\n     *\n     * @param file             The file to offload compressed data into.\n     * @param compressionLevel The compression level to use, @see #Deflater\n     * @return A  ScatterZipOutputStream that is ready for use.\n     * @throws FileNotFoundException if the file cannot be found\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 90)",
        "(line 153,col 9)-(line 153,col 82)",
        "(line 154,col 9)-(line 154,col 50)"
      ]
    }
  ]
}