{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/archivers/jar/JarArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JarArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"
      ],
      "begin_line": 33,
      "end_line": 48,
      "comment": "\n * Subclass that adds a special extra field to the very first entry\n * which allows the created archive to be used as an executable jar on\n * Solaris.\n "
    },
    {
      "type": "field",
      "varNames": [
        "jarMarkerAdded"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveOutputStream.JarArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.jar.JarArchiveOutputStream.putNextEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 41,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 45,col 9)",
        "(line 46,col 9)-(line 46,col 31)"
      ]
    }
  ]
}