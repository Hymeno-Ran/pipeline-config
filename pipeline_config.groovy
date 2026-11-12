// Global tier: áp dụng cho mọi job dùng JTE
@merge     // app được thêm jte.pipeline_template, nhưng không đổi được allow_scm_jenkinsfile
jte {
    allow_scm_jenkinsfile = false   // repo app không được dùng Jenkinsfile riêng
}

@merge              // app được thêm library khác
libraries {
    @override       // app được truyền tham số cho lib (registry, image...)
    lib {}
}

@override
keywords {
    agent_label = 'docker-linux'
}
