{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/archivers/sevenz/Coders.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Coders",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 275,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CODER_MAP"
      ],
      "begin_line": 45,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.findByMethod(org.apache.commons.compress.archivers.sevenz.SevenZMethod)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 68,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 90)",
        "(line 71,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(java.io.OutputStream, org.apache.commons.compress.archivers.sevenz.SevenZMethod, java.lang.Object)",
      "begin_line": 79,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 50)",
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CopyDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 88,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder.decode(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 89,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 13)-(line 92,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 13)-(line 96,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BCJDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 100,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "opts"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BCJDecoder.BCJDecoder(org.tukaani.xz.FilterOptions)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BCJDecoder.decode(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 106,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 109,col 13)-(line 116,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BCJDecoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 119,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 13)-(line 122,col 115)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DeflateDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 126,
      "end_line": 220,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoder()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 13)-(line 128,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.decode(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 131,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 136,col 13)-(line 136,col 57)",
        "(line 137,col 13)-(line 138,col 30)",
        "(line 139,col 13)-(line 139,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 141,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 143,col 13)-(line 143,col 64)",
        "(line 144,col 13)-(line 144,col 64)",
        "(line 145,col 13)-(line 145,col 102)",
        "(line 146,col 13)-(line 146,col 82)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DeflateDecoderInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 149,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inflaterInputStream"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inflater"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderInputStream.DeflateDecoderInputStream(java.util.zip.InflaterInputStream, java.util.zip.Inflater)",
      "begin_line": 154,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 156,col 17)-(line 156,col 63)",
        "(line 157,col 17)-(line 157,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderInputStream.read()",
      "begin_line": 160,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 17)-(line 162,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderInputStream.read(byte[], int, int)",
      "begin_line": 165,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 17)-(line 167,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderInputStream.read(byte[])",
      "begin_line": 170,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 172,col 17)-(line 172,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderInputStream.close()",
      "begin_line": 175,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 177,col 17)-(line 181,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DeflateDecoderOutputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.OutputStream"
      ],
      "begin_line": 185,
      "end_line": 219,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deflaterOutputStream"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deflater"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderOutputStream.DeflateDecoderOutputStream(java.util.zip.DeflaterOutputStream, java.util.zip.Deflater)",
      "begin_line": 190,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 192,col 17)-(line 192,col 65)",
        "(line 193,col 17)-(line 193,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderOutputStream.write(int)",
      "begin_line": 196,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 17)-(line 198,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderOutputStream.write(byte[])",
      "begin_line": 201,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 17)-(line 203,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderOutputStream.write(byte[], int, int)",
      "begin_line": 206,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 17)-(line 208,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.DeflateDecoderOutputStream.close()",
      "begin_line": 211,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 213,col 17)-(line 217,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BZIP2Decoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.CoderBase"
      ],
      "begin_line": 222,
      "end_line": 239,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.BZIP2Decoder()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 13)-(line 224,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.decode(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 227,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 13)-(line 231,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 233,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 236,col 13)-(line 236,col 108)",
        "(line 237,col 13)-(line 237,col 67)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DummyByteAddingInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterInputStream"
      ],
      "begin_line": 247,
      "end_line": 274,
      "comment": "\n     * ZLIB requires an extra dummy byte.\n     *\n     * @see java.util.zip.Inflater#Inflater(boolean)\n     * @see org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "addDummyByte"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.DummyByteAddingInputStream(java.io.InputStream)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 13)-(line 251,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.read()",
      "begin_line": 254,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 256,col 13)-(line 256,col 38)",
        "(line 257,col 13)-(line 260,col 13)",
        "(line 261,col 13)-(line 261,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.read(byte[], int, int)",
      "begin_line": 264,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 266,col 13)-(line 266,col 55)",
        "(line 267,col 13)-(line 271,col 13)",
        "(line 272,col 13)-(line 272,col 26)"
      ]
    }
  ]
}