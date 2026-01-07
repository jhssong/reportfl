{
  "filepath": "/tmp/Compress-23b/src/main/java/org/apache/commons/compress/archivers/jar/JarArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JarArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"
      ],
      "begin_line": 36,
      "end_line": 53,
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
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 45,
      "end_line": 52,
      "comment": " @throws ClassCastException if entry is not an instance of ZipArchiveEntry",
      "child_ranges": [
        "(line 47,col 9)-(line 50,col 9)",
        "(line 51,col 9)-(line 51,col 34)"
      ]
    }
  ]
}