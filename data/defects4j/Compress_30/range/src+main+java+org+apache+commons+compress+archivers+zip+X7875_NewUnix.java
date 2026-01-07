{
  "filepath": "/tmp/Compress-30b/src/main/java/org/apache/commons/compress/archivers/zip/X7875_NewUnix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "X7875_NewUnix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 47,
      "end_line": 338,
      "comment": "\n * An extra field that stores UNIX UID/GID data (owner \u0026amp; group ownership) for a given\n * zip entry.  We\u0027re using the field definition given in Info-Zip\u0027s source archive:\n * zip-3.0.tar.gz/proginfo/extrafld.txt\n *\n * \u003cpre\u003e\n * Value         Size        Description\n * -----         ----        -----------\n * 0x7875        Short       tag for this extra block type (\"ux\")\n * TSize         Short       total data size for this block\n * Version       1 byte      version of this extra field, currently 1\n * UIDSize       1 byte      Size of UID field\n * UID           Variable    UID for this entry (little endian)\n * GIDSize       1 byte      Size of GID field\n * GID           Variable    GID for this entry (little endian)\n * \u003c/pre\u003e\n * @since 1.5\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_THOUSAND"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "version"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " always \u00271\u0027 according to current info-zip spec."
    },
    {
      "type": "field",
      "varNames": [
        "uid"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " NOTE:  equals() and hashCode() currently assume these can never be null."
    },
    {
      "type": "field",
      "varNames": [
        "gid"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.X7875_NewUnix()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Constructor for X7875_NewUnix.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getHeaderId()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * The Header-ID.\n     *\n     * @return the value for the header id for this extrafield\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getUID()",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Gets the UID as a long.  UID is typically a 32 bit unsigned\n     * value on most UNIX systems, so we return a long to avoid\n     * integer overflow into the negatives in case values above\n     * and including 2^31 are being used.\n     *\n     * @return the UID value.\n     ",
      "child_ranges": [
        "(line 86,col 28)-(line 86,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getGID()",
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * Gets the GID as a long.  GID is typically a 32 bit unsigned\n     * value on most UNIX systems, so we return a long to avoid\n     * integer overflow into the negatives in case values above\n     * and including 2^31 are being used.\n     *\n     * @return the GID value.\n     ",
      "child_ranges": [
        "(line 96,col 28)-(line 96,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.setUID(long)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Sets the UID.\n     *\n     * @param l UID value to set on this extra field.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.setGID(long)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Sets the GID.\n     *\n     * @param l GID value to set on this extra field.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength()",
      "begin_line": 122,
      "end_line": 128,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     *\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 80)",
        "(line 124,col 9)-(line 124,col 80)",
        "(line 127,col 9)-(line 127,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryLength()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Length of the extra field in the central directory data - without\n     * Header-ID or length specifier.\n     *\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataData()",
      "begin_line": 146,
      "end_line": 175,
      "comment": "\n     * The actual data to put into local file data - without Header-ID\n     * or length specifier.\n     *\n     * @return get the data\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 44)",
        "(line 148,col 9)-(line 148,col 44)",
        "(line 153,col 9)-(line 153,col 61)",
        "(line 154,col 9)-(line 154,col 61)",
        "(line 161,col 9)-(line 161,col 70)",
        "(line 164,col 9)-(line 164,col 26)",
        "(line 165,col 9)-(line 165,col 26)",
        "(line 167,col 9)-(line 167,col 20)",
        "(line 168,col 9)-(line 168,col 55)",
        "(line 169,col 9)-(line 169,col 63)",
        "(line 170,col 9)-(line 170,col 66)",
        "(line 171,col 9)-(line 171,col 31)",
        "(line 172,col 9)-(line 172,col 63)",
        "(line 173,col 9)-(line 173,col 66)",
        "(line 174,col 9)-(line 174,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryData()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * The actual data to put into central directory data - without Header-ID\n     * or length specifier.\n     *\n     * @return get the data\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 195,
      "end_line": 210,
      "comment": "\n     * Populate data from this array as if it was in local file data.\n     *\n     * @param data   an array of bytes\n     * @param offset the start offset\n     * @param length the number of bytes in the array from offset\n     * @throws java.util.zip.ZipException on error\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 16)",
        "(line 199,col 9)-(line 199,col 63)",
        "(line 200,col 9)-(line 200,col 62)",
        "(line 201,col 9)-(line 201,col 44)",
        "(line 202,col 9)-(line 202,col 61)",
        "(line 203,col 9)-(line 203,col 26)",
        "(line 204,col 9)-(line 204,col 56)",
        "(line 206,col 9)-(line 206,col 62)",
        "(line 207,col 9)-(line 207,col 44)",
        "(line 208,col 9)-(line 208,col 61)",
        "(line 209,col 9)-(line 209,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 216,
      "end_line": 221,
      "comment": "\n     * Doesn\u0027t do anything special since this class always uses the\n     * same data in central directory and local file data.\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 16)",
        "(line 220,col 9)-(line 220,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.reset()",
      "begin_line": 227,
      "end_line": 231,
      "comment": "\n     * Reset state back to newly constructed state.  Helps us make sure\n     * parse() calls always generate clean results.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 27)",
        "(line 230,col 9)-(line 230,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.toString()",
      "begin_line": 240,
      "end_line": 243,
      "comment": "\n     * Returns a String representation of this class useful for\n     * debugging purposes.\n     *\n     * @return A String representation of this class useful for\n     *         debugging purposes.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.clone()",
      "begin_line": 245,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.equals(java.lang.Object)",
      "begin_line": 250,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.hashCode()",
      "begin_line": 260,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 36)",
        "(line 266,col 9)-(line 266,col 53)",
        "(line 267,col 9)-(line 267,col 29)",
        "(line 268,col 9)-(line 268,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byte[])",
      "begin_line": 280,
      "end_line": 337,
      "comment": "\n     * Not really for external usage, but marked \"package\" visibility\n     * to help us JUnit it.   Trims a byte array of leading zeroes while\n     * also enforcing a minimum length, and thus it really trims AND pads\n     * at the same time.\n     *\n     * @param array byte[] array to trim \u0026 pad.\n     * @return trimmed \u0026 padded byte[] array.\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 285,col 20)",
        "(line 286,col 9)-(line 292,col 9)",
        "(line 331,col 9)-(line 331,col 33)",
        "(line 333,col 9)-(line 333,col 81)",
        "(line 334,col 9)-(line 334,col 66)",
        "(line 335,col 9)-(line 335,col 93)",
        "(line 336,col 9)-(line 336,col 28)"
      ]
    }
  ]
}