{
  "filepath": "/tmp/Compress-36b/src/main/java/org/apache/commons/compress/archivers/jar/JarArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JarArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"
      ],
      "begin_line": 36,
      "end_line": 65,
      "comment": "\n * Subclass that adds a special extra field to the very first entry\n * which allows the created archive to be used as an executable jar on\n * Solaris.\n * \n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "jarMarkerAdded"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveOutputStream.JarArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveOutputStream.JarArchiveOutputStream(java.io.OutputStream, java.lang.String)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Create and instance that wraps the output stream using the provided encoding.\n     * \n     * @param out the output stream to wrap\n     * @param encoding the encoding to use. Use null for the platform default.\n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 19)",
        "(line 53,col 9)-(line 53,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 57,
      "end_line": 64,
      "comment": " @throws ClassCastException if entry is not an instance of ZipArchiveEntry",
      "child_ranges": [
        "(line 59,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 63,col 34)"
      ]
    }
  ]
}