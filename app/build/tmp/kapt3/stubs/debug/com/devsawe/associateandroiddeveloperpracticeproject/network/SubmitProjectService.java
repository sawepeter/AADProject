package com.devsawe.associateandroiddeveloperpracticeproject.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006H\'\u00a8\u0006\n"}, d2 = {"Lcom/devsawe/associateandroiddeveloperpracticeproject/network/SubmitProjectService;", "", "submitProject", "Lretrofit2/Call;", "Ljava/lang/Void;", "email", "", "firstName", "lastName", "projectLink", "app_debug"})
public abstract interface SubmitProjectService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "1FAIpQLSf9d1TcNU6zc6KR8bSEM41Z1g1zl35cwZr2xyjIhaMAz8WChQ/formResponse")
    public abstract retrofit2.Call<java.lang.Void> submitProject(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "entry.1824927963")
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "entry.1877115667")
    java.lang.String firstName, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "entry.2006916086")
    java.lang.String lastName, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "entry.284483984")
    java.lang.String projectLink);
}