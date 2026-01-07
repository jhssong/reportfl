{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/compressors/gzip/GzipParameters.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GzipParameters",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 121,
      "comment": "\n * Parameters for the GZIP compressor.\n * \n * @since 1.7\n "
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
      "type": "field",
      "varNames": [
        "modificationTime"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "filename"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "operatingSystem"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Unknown OS by default"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipParameters.getCompressionLevel()",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipParameters.setCompressionLevel(int)",
      "begin_line": 50,
      "end_line": 55,
      "comment": "\n     * Sets the compression level.\n     * \n     * @param compressionLevel the compression level (between 0 and 9) \n     * @see Deflater#NO_COMPRESSION\n     * @see Deflater#BEST_SPEED\n     * @see Deflater#DEFAULT_COMPRESSION\n     * @see Deflater#BEST_COMPRESSION\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 54,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipParameters.getModificationTime()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipParameters.setModificationTime(long)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Sets the modification time of the compressed file.\n     * \n     * @param modificationTime the modification time, in milliseconds\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipParameters.getFilename()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipParameters.setFilename(java.lang.String)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Sets the name of the compressed file.\n     * \n     * @param filename the name of the file without the directory path\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipParameters.getComment()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipParameters.setComment(java.lang.String)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipParameters.getOperatingSystem()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipParameters.setOperatingSystem(int)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Sets the operating system on which the compression took place.\n     * The defined values are:\n     * \u003cul\u003e\n     *   \u003cli\u003e0: FAT filesystem (MS-DOS, OS/2, NT/Win32)\u003c/li\u003e\n     *   \u003cli\u003e1: Amiga\u003c/li\u003e\n     *   \u003cli\u003e2: VMS (or OpenVMS)\u003c/li\u003e\n     *   \u003cli\u003e3: Unix\u003c/li\u003e\n     *   \u003cli\u003e4: VM/CMS\u003c/li\u003e\n     *   \u003cli\u003e5: Atari TOS\u003c/li\u003e\n     *   \u003cli\u003e6: HPFS filesystem (OS/2, NT)\u003c/li\u003e\n     *   \u003cli\u003e7: Macintosh\u003c/li\u003e\n     *   \u003cli\u003e8: Z-System\u003c/li\u003e\n     *   \u003cli\u003e9: CP/M\u003c/li\u003e\n     *   \u003cli\u003e10: TOPS-20\u003c/li\u003e\n     *   \u003cli\u003e11: NTFS filesystem (NT)\u003c/li\u003e\n     *   \u003cli\u003e12: QDOS\u003c/li\u003e\n     *   \u003cli\u003e13: Acorn RISCOS\u003c/li\u003e\n     *   \u003cli\u003e255: Unknown\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param operatingSystem the code of the operating system\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 47)"
      ]
    }
  ]
}