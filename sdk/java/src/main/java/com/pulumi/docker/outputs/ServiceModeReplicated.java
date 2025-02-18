// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceModeReplicated {
    private @Nullable Integer replicas;

    private ServiceModeReplicated() {}
    public Optional<Integer> replicas() {
        return Optional.ofNullable(this.replicas);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceModeReplicated defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer replicas;
        public Builder() {}
        public Builder(ServiceModeReplicated defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicas = defaults.replicas;
        }

        @CustomType.Setter
        public Builder replicas(@Nullable Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public ServiceModeReplicated build() {
            final var o = new ServiceModeReplicated();
            o.replicas = replicas;
            return o;
        }
    }
}
